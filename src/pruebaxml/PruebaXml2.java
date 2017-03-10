/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaxml;

import Modelo.CrearXml;
import Modelo.EmpleadoContrato;
import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author milmax.duque
 */
public class PruebaXml2 {

    
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//    String nombre;
//    String id;
//    String telefono;
//    String Actividad;
//    String numContrato;
//    
//    
//    LinkedList<EmpleadoContrato> emp = new LinkedList< >( );
//    EmpleadoContrato obj = new EmpleadoContrato();
//    
//    
//    
//        for (int i = 0; i < 3; i++) {
//            
//           nombre = JOptionPane.showInputDialog("Ingrese el Nombre");
//           id = JOptionPane.showInputDialog("Ingrese el id");
//           telefono =  JOptionPane.showInputDialog("Ingrese el telefono");
//           numContrato = JOptionPane.showInputDialog("Ingrese el numero de  contrato");
//           Actividad = JOptionPane.showInputDialog("Ingrese la actividad");
//           
//           obj = new EmpleadoContrato(Actividad, numContrato, nombre, id, telefono);
//             emp.add(obj);           
//                      
//            
//        }
//        
//        
        
        CrearXml objx = new CrearXml();
        
        //objx.crearArchivoXml(emp);
        // TODO code application logic here
        objx.leerArchivoXml();
    }
    
 
    
}
