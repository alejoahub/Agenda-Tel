/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Agenda {
    
    private List<Contacto> contactos;
    
    public Agenda (){
        this.contactos = new ArrayList();
    }
    
    public void AddContact(Contacto x){
        
        boolean is=false;
        
        if (contactos.isEmpty()){ contactos.add(x); return; }
        
        for (Contacto i :contactos) {
            if(i == x){ is=true; break; }
         }
         
        if(!is){
            contactos.add(x);
            System.out.println("Añadido correctamente");
        }
        else{
            System.out.println("COntacto repetido");
        }
        
       
        }
    
    public void SeeContacts() {

        if(contactos.isEmpty()) {
            JOptionPane.showMessageDialog(null,"No hay contactos que mostrar");
        } 
        else{
            for (Contacto i : contactos) {
                    JOptionPane.showMessageDialog(null,i.toString());
                
            }   
        }
    }

    public void SearchByName(String nombre) {

        boolean encontrado = false;
        for (Contacto i : contactos) {
            if(nombre.equals(i.getNombre())){
                JOptionPane.showMessageDialog(null,i.toString());
                encontrado=true;
                break;
            }
                
        }
        if(!encontrado){
            JOptionPane.showMessageDialog(null,"No se ha encontrado el contacto");
        }
     
    }
    
    public Contacto Search(String nombre) {
        
        for (Contacto i : contactos) {
            if(nombre.equals(i.getNombre())){
                JOptionPane.showMessageDialog(null,i.toString());
                return i;
            }    
        }
        return null;
    }
     public void Delete(Contacto x){contactos.remove(x); }
    
 
}
    
