/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author iampa
 */
public abstract class Persona implements Relacionable {
    private String nombre;
    private String apellidos;
    private int edad;

    public Persona(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    Persona() {
       
    }

 

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + '}';
    }

    @Override
    public boolean esMayor(Relacionable r) {
         if(r == null || !(r instanceof Persona))
       return false;
       
       Persona other = (Persona) r;
       
       double a, b, suma;
       a = this.edad / this.edad;
       b = other.edad / other.edad;
       suma = a - b;
       if(suma < 0.0)
           return true;
       else
           return false;
    }

    @Override
    public boolean esMenor(Relacionable r) {
        if(r == null || !(r instanceof Persona))
       return false;
       
       Persona other = (Persona) r;
       
       double a, b, resta;
       a = this.edad / this.edad;
       b = other.edad / other.edad;
       resta = a - b;
       if(resta < 0.0)
           return true;
       else
           return false;
    }

    @Override
    public boolean esIgual(Relacionable r) {
          
       return false;
       
     
    }
    
}
