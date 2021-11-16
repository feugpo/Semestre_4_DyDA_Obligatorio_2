/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.Objects;

/**
 *
 * @author Fernando
 */
public class Carta implements Comparable<Carta> {
    private Palo palo;
    private Valor valor;

    public Carta(Palo palo, Valor valor) {
        this.palo = palo;
        this.valor = valor;
    }

    public String generarString() {
        //MOVER CARPETA CARTAS PARA ADENTRO DEL PROJECT Y USAR "./IMAGENES"
        return System.getProperty("user.dir")+"\\..\\cartas\\"+valor.getValor()+palo.getPalo()+".gif";
    }

   

    public Palo getPalo() {
        return palo;
    }

    public Valor getValor() {
        return valor;
    }

    @Override
    public int compareTo(Carta c) {
        int ret = valor.compareTo(c.getValor());
        if(ret == 0){
            ret = palo.compareTo(c.getPalo());
        }
        return ret;
    }

    

    
    
    
    



    
    
    

    

    
    
    
}
