/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;

/**
 *
 * @author Ronny
 */
public class Cliente {
    private int id;
    private String nombre;
    private String correo;
    private int telefono;
    private String direccion;
    private TSexo sexo;
    private Date fechaNacimiento;
    private Casillero casillero;
    private TCliente tipoCliente;
    private int cantidadEntregablesRecibidos;

    public Cliente(int id) {
        this.id = id;
    }

    public Cliente(int id, String nombre, String correo, int telefono, String direccion, TSexo sexo, Date fechaNacimiento, Casillero casillero) {
        this.cantidadEntregablesRecibidos = 0;
        this.tipoCliente = TCliente.Normal;
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
        this.casillero = casillero;
    }

    public int getCantidadEntregablesRecibidos() {
        return cantidadEntregablesRecibidos;
    }
    
    public void aumentarCantidadEntregablesRecibidos(){
        this.cantidadEntregablesRecibidos++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public TSexo getSexo() {
        return sexo;
    }

    public void setSexo(TSexo sexo) {
        this.sexo = sexo;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Casillero getCasillero() {
        return casillero;
    }

    public void setCasillero(Casillero casillero) {
        this.casillero = casillero;
    }

    public TCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
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
        final Cliente other = (Cliente) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
    
    
}
