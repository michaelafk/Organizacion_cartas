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
public class Cartes {

    //atributos de la clase
    private String pal;
    private int numero;

    //metodo constructor vacio
    public Cartes() {
    }

    //metodo constructor con parametros
    public Cartes(String pal, int numero) {
        this.pal = pal;
        this.numero = numero;
    }
    //metodos gets y sets

    public String getPal() {
        return pal;
    }

    public void setPal(String pal) {
        this.pal = pal;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    //metodo menorque
    public boolean menorque(Cartes a) {
        boolean aux2 = false;
        switch (pal) {
            case "OROS":
                if (a.getPal().equals("BASTOS") || a.getPal().equals("COPES") || a.getPal().equals("ESPASES")) {
                    aux2=true;
                } else {
                    if (a.getNumero() > numero) {
                        aux2=true;
                    } else {
                        aux2=false;
                    }
                }
                break;
            case "BASTOS":
                if (a.getPal().equals("COPES") || a.getPal().equals("ESPASES")) {
                    aux2=true;
                } else if (a.getPal().equals("OROS")) {
                    aux2=false;
                } else {
                    if (a.getNumero() > numero) {
                        aux2=true;
                    } else {
                        aux2=false;
                    }
                }
                break;
            case "COPES":
                if (a.getPal().equals("ESPASES")) {
                    aux2=true;
                } else if (a.getPal().equals("OROS") || a.getPal().equals("BASTOS")) {
                    aux2=false;
                } else {
                    if (a.getNumero() > numero) {
                       aux2=true;
                    } else {
                       aux2=false;
                    }
                }
                break;
            case "ESPASES":
                if (a.getPal().equals("OROS") || a.getPal().equals("BASTOS") || a.getPal().equals("COPES")) {
                    aux2=false;
                } else {
                    if (a.getNumero() > numero) {
                        aux2=true;
                    } else {
                        aux2=false;
                    }
                }
                break;
        }
        return aux2;
    }
    //metodo toString

    @Override
    public String toString() {
        return "{" + pal + numero + "}";
    }

}
