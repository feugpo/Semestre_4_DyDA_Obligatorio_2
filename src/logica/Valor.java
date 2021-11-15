/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author Fernando
 */
public class Valor implements Comparable<Valor> {
    private String valor;
    private int puntaje;

    public Valor(String valor, int puntaje) {
        this.valor = valor;
        this.puntaje = puntaje;
    }


    public String getValor() {
        return valor;
    }

    @Override
    public int compareTo(Valor v) {
        int ret = Integer.compare(this.puntaje, v.puntaje);
        return ret;
    }

   

   

    
    
    
}
