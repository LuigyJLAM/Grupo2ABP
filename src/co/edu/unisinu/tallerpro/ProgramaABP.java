/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unisinu.tallerpro;

import co.edu.unisinu.tallerpro.ventanas.VentanaABP;
/**
 *
 * @author YEAN
 */
public class ProgramaABP {
    public static void main(String xyz[]){
        VentanaABP teclado = new VentanaABP ();
        teclado.setTitle("Grupo 2");
        teclado.setLocationRelativeTo(null);
        teclado.setVisible(true);
    }
}
