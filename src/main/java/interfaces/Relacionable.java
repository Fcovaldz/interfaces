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
public interface Relacionable {
    boolean esMayor(Relacionable r);
    boolean esMenor(Relacionable r);
    boolean esIgual(Relacionable r);
}
