/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


import javax.swing.JOptionPane;


public class Main {
    public static void main (String [] arg){
      int opcion;
      boolean salir=true;
      
      Agenda agend = new Agenda();
      String nombre;
      String direccion;
      String movil;
      String fechaNacimiento;

      Contacto x;
      
      do{
     
          opcion=Integer.parseInt(JOptionPane.showInputDialog("Digite la opcion que prefiera\n"
                + "1. Agregar contacto\n"
                + "2. Modificar contacto\n"
                + "3. Listar contacto\n"
                + "4. Buscar contacto\n"
                + "5. Borrar contacto\n"
                + "6. Salir\n"));
      
        switch(opcion){
            case 1:
                nombre = JOptionPane.showInputDialog("Escribe un nombre");
                movil=JOptionPane.showInputDialog("Escribe movil");
                direccion= JOptionPane.showInputDialog("Escribe direccion");
                fechaNacimiento= JOptionPane.showInputDialog("Escribe fecha de nacimiento");
                
                x = new Contacto(nombre, direccion, fechaNacimiento, movil );
                agend.AddContact(x);
                break;
                
            case 2:
                break;

            case 3:
                agend.SeeContacts();
                break;

            case 4:
                nombre = JOptionPane.showInputDialog("Escribe un nombre");
                agend.SearchByName(nombre);
                break;
            case 5:
                nombre = JOptionPane.showInputDialog("Escribe un nombre");
                Contacto p =agend.Search(nombre);
                if(p!= null){
                     
                    agend.Delete(p);
                    JOptionPane.showMessageDialog(null, "contacto eliminado");
                }
                else JOptionPane.showMessageDialog(null, "contacto no encontrado");

                break;
            
            case 6:
                salir=false;
            default:
                JOptionPane.showMessageDialog(null, "Solo numeros entre 1 y 6");
                break;
        }
      }while(salir);
    }
}
