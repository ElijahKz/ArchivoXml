/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author milmax.duque
 */
public class Empleado {
    
    private String nombre;
    private String id;
    private String telefono;

    public Empleado() {
    }
    

    public Empleado(String nombre, String id, String telefono) {
        this.nombre = nombre;
        this.id = id;
        this.telefono = telefono;
    }

    public String getId() {     return id;    }

    public String getNombre() {      return nombre;    }

    public String getTelefono() {    return telefono;    }

    public void setId(String id) {     this.id = id;    }

    public void setNombre(String nombre) {   this.nombre = nombre;    }

    public void setTelefono(String telefono) {    this.telefono = telefono;   }

    @Override
    public String toString() {
        return "Nombre=" + nombre 
                +"\nidentificacion" + id 
                +"\ntelefono" +  telefono;
    }
    
    
    
    
}
