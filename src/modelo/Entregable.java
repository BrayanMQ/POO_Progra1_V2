/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Ronny
 */
public class Entregable {
    protected int id;
    protected double peso;
    protected boolean estado;
    protected String descripcion;
    protected String remitente;

    public Entregable(int id) {
        this.id = id;
    }
    
    public Entregable(int id, double peso, String descripcion, String remitente) {
        this.id = id;
        this.peso = peso;
        this.estado = false;
        this.descripcion = descripcion;
        this.remitente = remitente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getRemitente() {
        return remitente;
    }

    public void setRemitente(String remitente) {
        this.remitente = remitente;
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
        final Entregable other = (Entregable) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
    
    
}
