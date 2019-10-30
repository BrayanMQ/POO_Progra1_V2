/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
/**
 *
 * @author Ronny
 */
public class Counter {
    private String nombre;
    private int cedulaJuridica;
    private String direccion;
    private int cantCasilleros;
    private Queue <Casillero> listaCasillerosDisponibles;
    private ArrayList<Casillero> listaCasillerosOcupados;
    private ArrayList <Cliente> listaClientes;

    public Counter(String nombre, int cedulaJuridica, String direccion, int cantCasilleros) {
        this.nombre = nombre;
        this.cedulaJuridica = cedulaJuridica;
        this.direccion = direccion;
        this.cantCasilleros = cantCasilleros;
        this.listaCasillerosDisponibles = new LinkedList<>();
        this.listaCasillerosOcupados = new ArrayList<>();
        this.listaClientes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public int getCedulaJuridica() {
        return cedulaJuridica;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getCantCasilleros() {
        return cantCasilleros;
    }

    public Queue<Casillero> getListaCasillerosDisponibles() {
        return listaCasillerosDisponibles;
    }

    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }

    public ArrayList<Casillero> getListaCasillerosOcupados() {
        return listaCasillerosOcupados;
    }
    
}
