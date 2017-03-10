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
public class EmpleadoContrato extends Empleado {
    
    private String Actividad;
    private String numContrato;

    public EmpleadoContrato() {
        
    }

  
    

    public EmpleadoContrato(String Actividad, String numContrato,String nombre, String id, String telefono) {
        super(nombre, id, telefono);
        this.Actividad = Actividad;
        this.numContrato = numContrato;
        
    }

    public void setNumContrato(String numContrato) {
        this.numContrato = numContrato;
    }

    public String getNumContrato() {
        return numContrato;
    }

    
    public String getActividad() {
        return Actividad;
    }

    /**
     * Set the value of Actividad
     *
     * @param Actividad new value of Actividad
     */
    public void setActividad(String Actividad) {
        this.Actividad = Actividad;
    }

    @Override
    public String toString() {
        return super.toString() + "Actividades= " + Actividad + "\nNumero de Contrato" + numContrato; //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
