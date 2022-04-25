/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LojaDeInformatica;

/**
 *
 * @author NatanDantas
 */
public class Computador {

    private static String marca = "Natan Dantas";

    private String HD;
    private String processador;

    public Computador() {

    }

    public String getHD() {
        return HD;
    }

    public void setHD(String HD) {
        this.HD = HD;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }
}
