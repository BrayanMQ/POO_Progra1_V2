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
public class Sobre extends Entregable{
    private TSobre tipo;
    private boolean tieneDocumentos;

    public Sobre(TSobre tipo, boolean tieneDocumentos, int id, double peso, String descripcion, String remitente) {
        super(id, peso, descripcion, remitente);
        this.tipo = tipo;
        this.tieneDocumentos = tieneDocumentos;
    }

    public TSobre getTipo() {
        return tipo;
    }

    public void setTipo(TSobre tipo) {
        this.tipo = tipo;
    }

    public boolean isTieneDocumentos() {
        return tieneDocumentos;
    }

    public void setTieneDocumentos(boolean tieneDocumentos) {
        this.tieneDocumentos = tieneDocumentos;
    }
    
}
