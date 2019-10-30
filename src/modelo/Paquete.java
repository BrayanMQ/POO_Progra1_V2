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
public class Paquete extends Entregable{
    private TPaquete tipoPaquete;
    private boolean fragil;
    private boolean contElectronico;

    public Paquete(TPaquete tipoPaquete, boolean fragil, boolean contElectronico, int id, double peso, String descripcion, String remitente) {
        super(id, peso, descripcion, remitente);
        this.tipoPaquete = tipoPaquete;
        this.fragil = fragil;
        this.contElectronico = contElectronico;
    }


    public TPaquete getTipoPaquete() {
        return tipoPaquete;
    }

    public void setTipoPaquete(TPaquete tipoPaquete) {
        this.tipoPaquete = tipoPaquete;
    }

    public boolean isFragil() {
        return fragil;
    }

    public void setFragil(boolean fragil) {
        this.fragil = fragil;
    }

    public boolean isContElectronico() {
        return contElectronico;
    }

    public void setContElectronico(boolean contElectronico) {
        this.contElectronico = contElectronico;
    }
    
    
    
}
