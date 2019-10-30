
package control;

import java.util.ArrayList;
import modelo.Casillero;
import modelo.Entregable;
import modelo.Paquete;
import modelo.Revista;
import modelo.Sobre;
import modelo.TPaquete;
import modelo.TSobre;

public class GestorEntregable {

    public GestorEntregable() {
    }
    
    /**
     * Crea un paquete
     * @param id
     * @param peso
     * @param pDescripcion
     * @param pRemitente
     * @param pTipoPaquete
     * @param pFragil
     * @param pContenidoElectronico
     * @return Retorna un paquete
     */
    public Paquete crearPaquete(int id, double peso, String pDescripcion, 
            String pRemitente, String pTipoPaquete, 
            boolean pFragil, boolean pContenidoElectronico){
        
        TPaquete Tpaquete;
        
        if (TPaquete.Bolsa.toString().equals(pTipoPaquete)) {
            Tpaquete = TPaquete.Bolsa;
        } else {
            Tpaquete = TPaquete.Caja;
        }
        
        Paquete paquete = new Paquete(Tpaquete, pFragil, 
                pContenidoElectronico, id, peso, pDescripcion, pRemitente);
        
        return paquete;

    }
    
    /**
     * Crea un Sobre
     * @param id
     * @param peso
     * @param pDescripcion
     * @param pRemitente
     * @param pTipoSobre
     * @param pTieneDocumentos
     * @return Retorna un sobre
     */
    public Sobre crearSobre(int id, double peso, String pDescripcion, String pRemitente, String pTipoSobre, boolean pTieneDocumentos){
        TSobre Tsobre;
        if (TSobre.Aereo.toString().equals(pTipoSobre)){
            Tsobre = TSobre.Aereo;
        }else{
            Tsobre = TSobre.Manilla;
        }
        Sobre sobre = new Sobre(Tsobre,pTieneDocumentos,id,peso,  pDescripcion,  pRemitente);
        return sobre;
    }
    
    /**
     * Crea una revista
     * @param pEsCatalogo
     * @param pTema
     * @param pId
     * @param pPeso
     * @param pDescripcion
     * @param pRemitente
     * @return Retorna una revista
     */
    public Revista crearRevista(boolean pEsCatalogo, String pTema, String pId, String pPeso, String pDescripcion, String pRemitente){
        if (pEsCatalogo) {
            
        }
        Revista revista = new Revista(pEsCatalogo, pTema, Integer.parseInt(pId), Double.parseDouble(pPeso), pDescripcion, pRemitente);
        return revista;
    }
    
    /**
     * Busca el entregable y lo inserta
     * @param pEntregable
     * @param casillero
     * @return Retorna true si lo inserta
     */
    public boolean buscarEntregableEInsertar(Entregable pEntregable, Casillero casillero){
        int index = casillero.getListaEntregables().indexOf((pEntregable));
        
        if (index == -1) {
            casillero.getListaEntregables().add(pEntregable);
            return true;
        }
        
        return false;
    }
    
    /**
     * Busca los entregables seleccionados y los agrega a la lista
     * @param pListaIds
     * @param pCasillero
     * @return Retorna la lista de los entregables seleccionados
     */
    public ArrayList<Entregable> buscarEntregablesSeleccionados(ArrayList<String> pListaIds, Casillero pCasillero){
        ArrayList<Entregable> listaEntregables = new ArrayList<>();
        for (String id : pListaIds) {
            int idInt = Integer.parseInt(id);
            Entregable entregable = new Entregable(idInt);
            int index = pCasillero.getListaEntregables().indexOf((entregable));
        
            if (index == -1) {
                listaEntregables.add(pCasillero.getListaEntregables().get(index));
            }
        }
        return listaEntregables;
    }
    
    public double calcularMontoDolares(ArrayList<Entregable> listaEntregables){
        double montoDolares = 0;
        for (Entregable entregable : listaEntregables) {
            if (entregable instanceof Revista) {
                Revista entregableTemporal = (Revista)entregable;
                if (!entregableTemporal.isEsCatalogo()) {
                    montoDolares += 1;
                }else if (entregableTemporal.isEsCatalogo()) {
                    montoDolares += 0;
                }
            }else if (entregable instanceof Paquete) {
                Paquete entregableTemporal = (Paquete)entregable;
                if (entregableTemporal.isContElectronico() && !entregableTemporal.isFragil()) {
                    montoDolares += entregableTemporal.getPeso() * 0.02 + 2;
                }else if (entregableTemporal.isContElectronico() && entregableTemporal.isFragil()) {
                    montoDolares += entregableTemporal.getPeso() * 0.02 + 4;
                }else if (!entregableTemporal.isContElectronico() && !entregableTemporal.isFragil()) {
                    montoDolares += entregableTemporal.getPeso() * 0.02;
                }
                
            }else{
                Sobre entregableTemporal = (Sobre)entregable;
                if (entregableTemporal.isTieneDocumentos() && entregableTemporal.getTipo() == TSobre.Aereo) {
                    montoDolares += 0;
                }else if (entregableTemporal.isTieneDocumentos() && entregableTemporal.getTipo() == TSobre.Manilla) {
                    montoDolares += 1;
                }else if (!entregableTemporal.isTieneDocumentos() && entregableTemporal.getTipo() == TSobre.Aereo) {
                    montoDolares += 1;
                }else if (!entregableTemporal.isTieneDocumentos() && entregableTemporal.getTipo() == TSobre.Manilla) {
                    montoDolares += 2;
                }
            }
        }
        return montoDolares;
    }
    
}
