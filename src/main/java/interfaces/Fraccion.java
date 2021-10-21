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
public class Fraccion implements Relacionable{
    private int numerador;
    private int denominador;
    
    public Fraccion() {
        numerador = denominador = 0;
    }
    
    public Fraccion(int numerador, int denominador) {
        if (denominador == 0)
            denominador = 1;
        this.numerador = numerador;
        this.denominador = denominador;
        simplificar();
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
        simplificar();
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        if (denominador == 0)
            denominador = 1;
        this.denominador = denominador;
        simplificar();
    }
    
    private void simplificar() {
        int mcd = mcd(Math.abs(numerador), Math.abs(denominador));
        numerador /= mcd;
        denominador /= mcd;
    }
    
    private int mcd(int a, int b) {
        if (b == 0)
            return a;
        return mcd(b, a % b);
    }
    
    @Override
    public String toString() {
        return String.format("(%d / %d)", numerador, denominador);
    }

    @Override
    public boolean esMayor(Relacionable r) {
          if(r == null || !(r instanceof Fraccion))
       return false;
       
       Fraccion other = (Fraccion) r;
       
       double a, b, suma;
       a = this.numerador / (double)this.denominador;
       b = other.numerador / (double)other.denominador;
       suma = a + b;
       if(suma < 0.0)
           return true;
       else
           return false;
    }

    @Override
    public boolean esMenor(Relacionable r) {
       if(r == null || !(r instanceof Fraccion))
       return false;
       
       Fraccion other = (Fraccion) r;
       
       double a, b, resta;
       a = this.numerador / (double)this.denominador;
       b = other.numerador / (double)other.denominador;
       resta = a - b;
       if(resta < 0.0)
           return true;
       else
           return false;
    }

    @Override
    public boolean esIgual(Relacionable r) {
        if(r == null || !(r instanceof Fraccion))
       return false;
       
       Fraccion other = (Fraccion) r;
       
       double a, b, igual;
       a = this.numerador / (double)this.denominador;
       b = other.numerador / (double)other.denominador;
       igual = a = b;
       if(igual < 0.0)
           return false;
       else
           return true;
    }
    
}
