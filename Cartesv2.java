/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Organaizacion_cartas;

/**
 *
 * @author kirky
 */
public class Cartesv2 {

    //atributos de la clase
    private tipoCarta pal;
    private int numero;

    //metodo constructor vacio
    public Cartesv2() {

    }

    //metodo constructor con parametros
    public Cartesv2(String pal, int numero) {
        this.pal = tipoCarta.valueOf(pal);
        this.numero = numero;
    }
    //metodos gets y sets

    public tipoCarta getPal() {
        return pal;
    }

    public void setPal(String pal) {
        this.pal = tipoCarta.valueOf(pal);
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    //metodo menorque
    public boolean menorque(Cartesv2 a) {
        boolean aux2;
        if (pal.ordinal() < a.getPal().ordinal()) {
            aux2 = true;
        } else if (pal.ordinal() > a.getPal().ordinal()) {
            aux2 = false;
        } else {
            if (numero < a.getNumero()) {
                aux2 = true;
            } else {
                aux2 = false;
            }
        }
        return aux2;
    }
    //metodo toString

    @Override
    public String toString() {
        return "{" + pal.name() + numero + "}";
    }

}
