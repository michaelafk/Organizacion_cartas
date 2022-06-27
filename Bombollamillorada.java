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
        for (int i = 0; i < carta.length; i++) {
            carta[i] = new Cartes(tipoCarta.values()[m.nextInt(4)].name(), m.nextInt(12));
        }
        for (int i = 0; i < carta.length; i++) {
            System.out.print(carta[i]);
        }
        int n = carta.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = n-2; j >= i; j--) {
                if (carta[j + 1].menorque(carta[j])) {
                    Cartes aux = carta[j+1];
                    carta[j+1] = carta[j];
                    carta[j] = aux;
                }
            }
        }
        System.out.println("\n");
        for (int i = 0; i < carta.length; i++) {
            System.out.print(carta[i]);
        }

    }

}
