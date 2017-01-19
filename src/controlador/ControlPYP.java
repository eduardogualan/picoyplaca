/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.PicoYPlaca;

/**
 *
 * @author AngelEduardo
 */
public class ControlPYP {

    private PicoYPlaca pyp;

    public PicoYPlaca getPyp() {
        if (this.pyp == null) {
            this.pyp = new PicoYPlaca();
        }
        return pyp;
    }

    private int ObtenerUltimoDigitoMatricula(int matricula) {
        int ultimoDigito = 0;
        if (matricula >= 1000) {
            ultimoDigito = ((matricula % 1000) % 100) % 10;
        } else if (matricula >= 100) {
            ultimoDigito = (matricula % 100) % 10;
        } else if (matricula > 10) {
            ultimoDigito = matricula % 10;
        } else {
            ultimoDigito = matricula;
        }
        return ultimoDigito;
    }

    public void ObtenerPYP() {
        int ultimoDigito = this.ObtenerUltimoDigitoMatricula(this.getPyp().getUltimoDigito());
        if (ultimoDigito >=0 && ultimoDigito <=9) {
            if(ultimoDigito ==0){
                this.getPyp().setPYP(this.getPyp().getDIAS()[ultimoDigito]+"\n"+this.getPyp().getDIAS()[2 - ultimoDigito]);
            }else if (ultimoDigito == 1) {
                this.getPyp().setPYP(this.getPyp().getDIAS()[2-ultimoDigito]+"\n"+this.getPyp().getDIAS()[5 - ultimoDigito]);
            }else if (ultimoDigito >=2 && ultimoDigito <=7) {
                this.getPyp().setPYP(this.getPyp().getDIAS()[ultimoDigito-2]+"\n"+this.getPyp().getDIAS()[ultimoDigito-1]);
            }else{
                this.getPyp().setPYP(this.getPyp().getDIAS()[(ultimoDigito - 1) % 7]+"\n"+this.getPyp().getDIAS()[(ultimoDigito - 2) % 7]);
            }
        }
       
    }

}
