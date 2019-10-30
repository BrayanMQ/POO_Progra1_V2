
package control;

import java.util.ArrayList;
import modelo.Casillero;
import modelo.Cliente;
import modelo.Entregable;
import modelo.IConstants;
import modelo.Paquete;
import modelo.Revista;
import modelo.Sobre;
import modelo.TCliente;
import modelo.TPaquete;
import modelo.TSobre;
import modelo.WebService.Cambio;

public class GestorEntregable implements IConstants{

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
            for (Entregable entregable : pCasillero.getListaEntregables()) {
                if (entregable.getId() == idInt) {
                    listaEntregables.add(entregable);
                }
            }
        }
        return listaEntregables;
    }
    
    public double calcularMontoDolaresEntregable(Entregable pEntregable){
        double montoDolares = 0;
        if (pEntregable instanceof Revista) {
                Revista entregableTemporal = (Revista)pEntregable;
                if (!entregableTemporal.isEsCatalogo()) {
                    montoDolares += 1;
                }else if (entregableTemporal.isEsCatalogo()) {
                    montoDolares += 0;
                }
            }else if (pEntregable instanceof Paquete) {
                Paquete entregableTemporal = (Paquete)pEntregable;
                if (entregableTemporal.isContElectronico() && !entregableTemporal.isFragil()) {
                    montoDolares += entregableTemporal.getPeso() * 0.02 + 2;
                }else if (entregableTemporal.isContElectronico() && entregableTemporal.isFragil()) {
                    montoDolares += entregableTemporal.getPeso() * 0.02 + 4;
                }else if (!entregableTemporal.isContElectronico() && !entregableTemporal.isFragil()) {
                    montoDolares += entregableTemporal.getPeso() * 0.02;
                }
                
            }else{
                Sobre entregableTemporal = (Sobre)pEntregable;
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
        return montoDolares;
    }
    
    /**
     * Calcula el monto a pagar en dolares
     * @param listaEntregables
     * @return Retorna el monto en dolares
     */
    public double calcularMontoDolares(ArrayList<Entregable> listaEntregables){
        double montoDolares = 0;
        for (Entregable entregable : listaEntregables) {
            montoDolares += calcularMontoDolaresEntregable(entregable);
        }
        return montoDolares;
    }
    
    /**
     * Calcula el descuento con el precio final
     * @param pMontoDolares
     * @param pCliente
     * @return Retorna el monto con el descuento aplicado
     */
    public double calcularDescuento(double pMontoDolares, Cliente pCliente){
        double descuento = pMontoDolares;
        if (pCliente.getTipoCliente() == TCliente.Plata) {
            descuento = pMontoDolares * DESCUENTO_PLATA;
        }else if (pCliente.getTipoCliente() == TCliente.Oro) {
            descuento = pMontoDolares * DESCUENTO_ORO;
        }
        return descuento;
    }
    
    /**
     * Realiza la conversion de dolares a colones
     * @param pMontoDolares
     * @return Retorna el montoColones
     */
    public double conversionColones(double pMontoDolares){
        Cambio tipoCambio = new Cambio();
        double montoColones = tipoCambio.getVenta() * pMontoDolares;
        return montoColones;
    }
    
    public void retirarEntregables(ArrayList<Entregable> listaEntregables){
        for (Entregable entregable : listaEntregables) {
            entregable.setEstado(true);
        }
    }
    
    public String obtenerEntregablesPendientesTexto(Cliente pCliente){
        String mensaje = "Tiene entregables pendientes: \n";
        for (Entregable entregable : pCliente.getCasillero().getListaEntregables()) {
            if (!entregable.isEstado()) {
                 if (entregable instanceof Revista) {
                    Revista entregableTemporal = (Revista)entregable;
                    mensaje += "Id: " + entregable.getId() + " | Tipo: Revista | Descripción: " + entregableTemporal.getDescripcion() + "\n";
                }else if (entregable instanceof Paquete) {
                        Paquete entregableTemporal = (Paquete)entregable;
                        mensaje += "Id: " + entregable.getId() + " | Tipo: Paquete | Descripción: " + entregableTemporal.getDescripcion() + "\n";
                }else{
                    Sobre entregableTemporal = (Sobre)entregable;
                    mensaje += "Id: " + entregable.getId() + " | Tipo: Sobre | Descripción: " + entregableTemporal.getDescripcion() + "\n";
                }
            }
        }
        return mensaje;
    }
}
