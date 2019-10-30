
package control;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import modelo.Casillero;
import modelo.Cliente;
import static modelo.IConstants.CASILLERO_MIL;
import modelo.TCliente;
import modelo.TSexo;

/**
 *
 * @author Ronny, Brayan, Isaac
 */
public class GestorCliente {

    public GestorCliente() {
    }
    
    
    /**
     * Crea un cliente junto con su respectivo casillero y los añade a las listas clientes/casilleros de la clase Counter
     * @param pId 
     * @param pNombre
     * @param pCorreo
     * @param pTelefono
     * @param pDireccion
     * @param pSexo
     * @param pFechaNacimiento
     * @return Retorna true si existe un error al crear un cliente, caso contrario retornará false
     */
    public int registrarCliente(String pId, String pNombre, String pCorreo,
        String pTelefono, String pDireccion, String pSexo, Date pFechaNacimiento){
        
        
        if (!Controlador.getSingletonInstance().getCounter().getListaCasillerosDisponibles().isEmpty()) {
            Casillero casillero = Controlador.getSingletonInstance().getCounter().getListaCasillerosDisponibles().poll();
            casillero.setEstado(true); //Casillero ocupado
            TSexo sexo = convertirTSexo(pSexo);
            Cliente cliente = new Cliente(Integer.parseInt(pId), pNombre,
                    pCorreo, Integer.parseInt(pTelefono), pDireccion, sexo, pFechaNacimiento, casillero);

            casillero.setCliente(cliente);
            Controlador.getSingletonInstance().getCounter().getListaCasillerosOcupados().add(casillero);
            Controlador.getSingletonInstance().getCounter().getListaClientes().add(cliente);
            return casillero.getId();
        }
        
        return -1;
    }
    
    /**
     * Convierte el pSexo en TSexo
     * @param pSexo
     * @return Retorna la variable sexo en TSexo
     */
    public TSexo convertirTSexo(String pSexo){
        TSexo sexo;
        if (TSexo.Femenino.toString().equals(pSexo)) {
            sexo = TSexo.Femenino;
        }else if (TSexo.Masculino.toString().equals(pSexo)) {
            sexo = TSexo.Masculino;
        }else if (TSexo.Otro.toString().equals(pSexo)) {
            sexo = TSexo.Otro;
        }else{
            sexo = TSexo.PrefieroNoEspecificar;
        }
        return sexo;
    }
    
    /**
     * Valida que el teléfono tenga 8 dígitos
     * @param pTelefono
     * @return Retornará true si el teléfono es válido, caso contrario retornará false
     */
    public boolean validarTelefono(String pTelefono){
        return pTelefono.matches("[0-9]{8}");
    }
    
    /**
     * Valida que el correo tenga una estructura válida
     * @param pCorreo
     * @return Retornará true si el correo es válido, caso contrario retornará false
     */
    public boolean validarCorreo(String pCorreo){
        String regex = "^(.+)@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(pCorreo);
        return matcher.matches();
    }
    
    /**
     * Valida y convierte la fecha de nacimiento a un Date
     * @param pFechaNacimiento
     * @return Retorna la fecha de nacimiento si es válida, de lo contrario retornará null
     */
    public Date validarFechaNacimiento(String pFechaNacimiento){
        Date date = null;
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        try {
            date = formatter.parse(pFechaNacimiento);
        } catch (ParseException e) {
        }
        return date;
    }
    
    /**
     * Valida que los datos de la lista no sen vacíos
     * @param pListaDatos
     * @return Retorna true si no son vacíos
     */
    public boolean validarDatoVacio(ArrayList<String> pListaDatos){
        for (String dato : pListaDatos) {
            if ("".equals(dato)) {
                return false;
            }
        }
        return true;
    }
    
    /**
     * Busca el cliente en la lista de clientes del counter
     * @param pId
     * @return Si encuentra el cliente, retorna el index, de lo contrario retorna -1
     */
    public int buscarCliente(String pId){
        int index = -1;
        if (Controlador.getSingletonInstance().validarDigitosEnteros(pId)) {
            int id = Integer.parseInt(pId);
            Cliente cliente = new Cliente(id);
            index = Controlador.getSingletonInstance().getCounter().getListaClientes().indexOf(cliente);
        }
        return index;
    } 
    
    /**
     * Obtiene el cliente de la listaClientes del counter
     * @param pIndex
     * @return Retorna el objeto cliente 
     */
    public Cliente consultarDatosCliente(int pIndex){
        Cliente cliente = Controlador.getSingletonInstance().getCounter().getListaClientes().get(pIndex);
        return cliente;
    }
    
    /**
     * Elimina el cliente de la listaClientes del counter
     * @param pId
     * @return Retorna true si se logró eliminar, de lo contrario retornará false
     */
    public boolean eliminarCliente(String pId){
        int index = buscarCliente(pId);
        if (index >= 0) {
            Cliente cliente = Controlador.getSingletonInstance().getCounter().getListaClientes().remove(index);
            Casillero casillero = cliente.getCasillero();
            
            return true;
        } 
        return false;
    }
    
    /**
     * Modifica al cliente
     * @param pId
     * @param pNombre
     * @param pCorreo
     * @param pTelefono
     * @param pDireccion
     * @param pSexo
     * @param pFechaNacimiento
     * @param cliente 
     */
    public void modificarCliente(String pId, String pNombre, String pCorreo,
        String pTelefono, String pDireccion, String pSexo, Date pFechaNacimiento, Cliente cliente){

        cliente.setId(Integer.parseInt(pId));
        cliente.setNombre(pNombre);
        cliente.setCorreo(pCorreo);
        cliente.setTelefono(Integer.parseInt(pTelefono));
        cliente.setDireccion(pDireccion);
        cliente.setSexo(convertirTSexo(pSexo));
        cliente.setFechaNacimiento(pFechaNacimiento);
        
    }
    
    /**
     * Verifica el tipo del cliente para cambiarlo o no
     * @param cliente 
     */
    public void verificarTipoCliente(Cliente cliente){
        if (cliente.getTipoCliente() != TCliente.Oro) {
            if (cliente.getCantidadEntregablesRecibidos() >= 10) {
                cliente.setTipoCliente(TCliente.Plata);
            }else if (cliente.getCantidadEntregablesRecibidos() >= 20) {
                cliente.setTipoCliente(TCliente.Oro);
            }
        }
    }
}
