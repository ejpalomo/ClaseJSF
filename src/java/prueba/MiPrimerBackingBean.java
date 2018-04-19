/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Esteban
 */
@Named(value = "backing")
@RequestScoped
public class MiPrimerBackingBean {

    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Creates a new instance of MiPrimerBackingBean
     */
    public MiPrimerBackingBean() {
    }
    
    public String miMetodo(){
        return "prueba.xhtml";
    }
    
}
