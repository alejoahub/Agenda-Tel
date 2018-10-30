/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
public class Contacto {
    private String nombre;
    private String direccion;
    private String movil;
    private String fechaNacimiento;
    
    public Contacto(String nombre, String direccion, String fechaNacimiento, String movil){
        this.direccion=direccion;
        this.movil=movil;
        this.nombre=nombre;
        this.fechaNacimiento=fechaNacimiento;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getMovil() {
        return movil;
    }

    public void setMovil(String movil) {
        this.movil = movil;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    public boolean equals(Contacto x){
        
        if(this.nombre.trim().equalsIgnoreCase(x.getNombre().trim())){
            return true;
        }
        
        return false;
        
    }
    
    @Override
    public String toString() {
        return "nombre=" + nombre + "\n" +
               ", movil=" + movil + "\n" +
               ", direccion=" + direccion + "\n" +
               ", fecha de nacimiento=" + fechaNacimiento + "\n" ;
    }
    
}
