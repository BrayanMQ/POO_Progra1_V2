/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Ronny
 */
public class Casillero {
    private int id;
    private boolean estado;
    private ArrayList <Entregable> listaEntregables;
    private Cliente cliente;
        
    public Casillero(int id) {
        this.id = id;
        this.estado = false;
        this.listaEntregables = new ArrayList<>();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public ArrayList<Entregable> getListaEntregables() {
        return listaEntregables;
    }

    public void setListaEntregables(ArrayList<Entregable> listaEntregables) {
        this.listaEntregables = listaEntregables;
    }
    
    public void limpiarCasillero(){
        this.estado = false;
        this.listaEntregables.clear();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Casillero other = (Casillero) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
    
}
