/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import modelo.Casillero;
import modelo.Counter;
import modelo.IConstants;

/**
 *
 * @author Ronny
 */
public class Controlador implements IConstants{
    private static Controlador controlador;
    private Counter counter;
    private GestorCliente gestorCliente = new GestorCliente();
    private GestorCasillero gestorCasillero = new GestorCasillero();
    private GestorEntregable gestorEntregable = new GestorEntregable();

    public Controlador() {
        this.gestorCliente = new GestorCliente();
    }
    
    /**
     * Crea la instancia Singleton del Controlador
     * @return La instacncia Singleton de controlador
     */
    public static Controlador getSingletonInstance() {
        if (controlador == null){
            controlador = new Controlador();
        }
        return controlador;
    }

    public GestorCliente getGestorCliente() {
        return gestorCliente;
    }

    /**
     * Crea la instancia del Counter con sus respectivos parámetros
     * @param pNombre
     * @param pCedulaJuridica
     * @param direccion
     * @param pCantidadCasilleros 
     */
    public void crearCounter(String pNombre, String pCedulaJuridica, String direccion, String pCantidadCasilleros){
        counter = new Counter(pNombre, Integer.parseInt(pCedulaJuridica), direccion, Integer.parseInt(pCantidadCasilleros));
        //for que crea la cantidad de casilleros disponibles
        for (int i = 0; i < Integer.parseInt(pCantidadCasilleros); i++) {
            Casillero casillero = new Casillero(CASILLERO_MIL+i);
            Controlador.getSingletonInstance().counter.getListaCasillerosDisponibles().add(casillero);
        }
    }
    
    /**
     * Valida numeros enteros
     * @param pDigito
     * @return  Retorna true si el string son solo numeros mayores que 0
     */
    public boolean validarDigitosEnteros(String pDigito){
        Pattern patronPalabras = Pattern.compile("[0-9]*");
        Matcher match = patronPalabras.matcher(pDigito);
        if (match.matches()) {
            if (Integer.parseInt(pDigito) > 0) {
                return true;
            }
        }
        return false;
    }
    
    
    /**
     * Valida numeros double
     * @param pDigito
     * @return Retorna true si el string se puede parsear a double
     */
    public boolean validarDigitosDobles(String pDigito){
        
        try {
            double num = Double.parseDouble(pDigito);
            return true;
        } catch (Exception e) {
        }
        
        return false;

    }

    public Counter getCounter() {
        return counter;
    }

    public GestorCasillero getGestorCasillero() {
        return gestorCasillero;
    }

    public GestorEntregable getGestorEntregable() {
        return gestorEntregable;
    }
    
    
}
