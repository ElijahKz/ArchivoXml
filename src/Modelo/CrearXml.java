/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import org.jdom2.Attribute;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

/**
 *
 * @author milmax.duque
 */
public class CrearXml {
    
    public void crearArchivoXml(LinkedList<EmpleadoContrato> lista){
    
   try {
       Element empleadoContrato= new Element("EmpleadoContrato");
		Document doc = new Document(empleadoContrato);
       for(int i = 0; i < lista.size() ; i++ ){
                Element empleado = new Element("empleado");
		empleado.setAttribute(new Attribute("id", lista.get(i).getId()));
		empleado.addContent(new Element("Nombre").setText(lista.get(i).getNombre()));
		empleado.addContent(new Element("Telefono").setText(lista.get(i).getTelefono()));
		empleado.addContent(new Element("Numero de Contrato").setText(lista.get(i).getNumContrato()));
		empleado.addContent(new Element("Actividad").setText(lista.get(i).getActividad()));
 
		doc.getRootElement().addContent(empleado);
       }
                // new XMLOutputter().output(doc, System.out);
		XMLOutputter xmlOutput = new XMLOutputter();
 
		// display nice nice
		xmlOutput.setFormat(Format.getPrettyFormat());
		xmlOutput.output(doc, new FileWriter("empleadoC.xml"));
 
		System.out.println("File Saved!");
                
   }catch (IOException io) {
		System.out.println(io.getMessage());
	  }
    
    
    }
    
    public void leerArchivoXml(){
    
    SAXBuilder builder = new SAXBuilder();
    File xmlFile = new File( "empleadoC.xml" );
    try{
    
          //Se crea el documento a traves del archivo
        Document document = (Document) builder.build( xmlFile );
 
        //Se obtiene la raiz 'tables'
        Element rootNode = document.getRootElement();
 
        //Se obtiene la lista de hijos de la raiz 'tables'
        List list = rootNode.getChildren( "empleado" );
 
        //Se recorre la lista de hijos de 'tables'
        for ( int i = 0; i < list.size(); i++ )
        {
           Element tabla = (Element) list.get(i);
           String nombre = tabla.getChildText("nombre");
           System.out.println("nombre:" + nombre);
            String id = tabla.getAttributeValue("id");
            System.out.println("id:" + id);
            String telefono = tabla.getChildText("telefono");
            System.out.println("telefono:" + telefono);
            String numContrato = tabla.getChildText("numContrato");
            System.out.println("numContrato:" + numContrato);
            String actividad = tabla.getChildText("actividad");
            System.out.println("actividad:" + actividad);
            
            
        }
        
        
        
        
    
    }catch ( IOException io ) {
        System.out.println( io.getMessage() );
    }catch ( JDOMException jdomex ) {
        System.out.println( jdomex.getMessage() );
    }
    
    }
    
    
    
}
