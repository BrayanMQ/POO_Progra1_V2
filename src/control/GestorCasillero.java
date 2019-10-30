
package control;

import modelo.Casillero;

public class GestorCasillero {

    public GestorCasillero() {
    }
    
    /**
     * Elimina el casillero de la lista de ocupados y lo agrega de nuevo en la cola
     * de casilleros disponibles
     * @param pCasillero 
     */
    public void eliminarCasillero(Casillero pCasillero){
        
            pCasillero.limpiarCasillero();
            Controlador.getSingletonInstance().getCounter().getListaCasillerosOcupados().remove(pCasillero);
            Controlador.getSingletonInstance().getCounter().getListaCasillerosDisponibles().add(pCasillero);
    
    }
    
    /**
     * Busca el casillero en lista de casilleros ocupados
     * @param pId
     * @return Retorna el casillero en caso de encontrarlo en la lista de ocupados
     */
    public Casillero buscarCasillero(String pId){
        Casillero casillero = null;
        if (Controlador.getSingletonInstance().validarDigitosEnteros(pId)) {
            int idCasillero = Integer.parseInt(pId);
                   
            for (Casillero casilleroOcupado : Controlador.getSingletonInstance().getCounter().getListaCasillerosOcupados()) {
                int id = casilleroOcupado.getId();

                if (idCasillero == id) {
                    casillero = casilleroOcupado;
                }
            
            }
            
        }
        
        return casillero;
  
    }
    
}
