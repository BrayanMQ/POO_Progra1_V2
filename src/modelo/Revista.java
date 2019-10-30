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
public class Revista extends Entregable{
    private boolean esCatalogo;
    private String tema;

    public Revista(boolean esCatalogo, String tema, int id, double peso, String descripcion, String remitente) {
        super(id, peso, descripcion, remitente);
        this.esCatalogo = esCatalogo;
        this.tema = tema;
    }

    public boolean isEsCatalogo() {
        return esCatalogo;
    }

    public void setEsCatalogo(boolean esCatalogo) {
        this.esCatalogo = esCatalogo;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }
    
    
    
}
