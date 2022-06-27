/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Organaizacion_cartas;

import java.util.Random;

/**
 *
 * @author kirky
 */
public class Bombollamillorada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bombollamillorada m = new Bombollamillorada();
        m.inicio();
    }

    public void inicio() {
        Random m = new Random();
        Cartes carta[] = new Cartes[10];
        Cartesv2 cartav2[] = new Cartesv2[10];
        for (int i = 0; i < carta.length; i++) {
            int aux = m.nextInt(4);
            int aux2 = m.nextInt(12) + 1;
            carta[i] = new Cartes(tipoCarta.values()[aux].name(), aux2);
            cartav2[i] = new Cartesv2(tipoCarta.values()[aux].name(), aux2);
        }
        for (int i = 0; i < carta.length; i++) {
            System.out.print(carta[i]);
        }
        System.out.println("\n");
        for (int i = 0; i < carta.length; i++) {
            System.out.print(cartav2[i]);
        }
        int n = carta.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = n - 2; j >= i; j--) {
                if (carta[j + 1].menorque(carta[j])) {
                    Cartes aux = carta[j + 1];
                    carta[j + 1] = carta[j];
                    carta[j] = aux;
                }
            }
        }
        int n2= cartav2.length;
        for (int i = 0; i < n2 - 1; i++) {
            for (int j = n2 - 2; j >= i; j--) {
                if (cartav2[j + 1].menorque(cartav2[j])) {
                    Cartesv2 aux = cartav2[j + 1];
                    cartav2[j + 1] = cartav2[j];
                    cartav2[j] = aux;
                }
            }
        }
        System.out.println("\n");
        for (int i = 0; i < carta.length; i++) {
            System.out.print(carta[i]);
        }
        System.out.println("\n");
        for (int i = 0; i < carta.length; i++) {
            System.out.print(cartav2[i]);
        }

    }

}
