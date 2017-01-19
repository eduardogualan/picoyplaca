/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

/**
 *
 * @author AngelEduardo
 */
public class PicoYPlaca {
    private String DIAS[] = {"LUNES","MARTES","MIERCOLES","JUEVES","VIERNES","SABADO","DOMINGO"};
    private String PYP;
    private int ultimoDigito;

    public String[] getDIAS() {
        return DIAS;
    }

    public String getPYP() {
        return PYP;
    }

    public void setPYP(String PYP) {
        this.PYP = PYP;
    }

    public int getUltimoDigito() {
        return ultimoDigito;
    }

    public void setUltimoDigito(int ultimoDigito) {
        this.ultimoDigito = ultimoDigito;
    }
    
}
