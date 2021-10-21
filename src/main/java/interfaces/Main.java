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
public class Main {

    
    public static void main(String[] args){
        Fraccion f1 = new Fraccion(1, 2);
        Fraccion f2 = new Fraccion(1, 2);
        Persona persona = new Persona() {};
        persona.setNombre("Francisco");
        persona.setEdad(23);
        persona.setApellidos("Bañuelos");
        System.out.println("nombre" + persona.getNombre());
        System.out.println("edad: "+ persona.getEdad());
        System.out.println("apellidos: "+ persona.getApellidos());
        
        
    
        
    }
   

   
}
