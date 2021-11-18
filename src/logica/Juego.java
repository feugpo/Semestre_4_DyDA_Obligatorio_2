/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import Observer.Observable;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Fernando
 */
public class Juego extends Observable {

    private ArrayList<Participante> participantes = new ArrayList();
    private ArrayList<Participante> retirados = new ArrayList();
    private Participante ganador;
    private int continuan = 0;
    private int rondas;
    private Ronda rondaActual;
    private Date fecha;

    public enum Eventos {
        rondaNueva, apuestaNueva, ganadorJuego, continuar, ganadorRonda, retiroJugador
    };

    public Ronda getRondaActual() {
        return rondaActual;
    }

    public Juego() {
    }

    public void agregar(Participante p) {
        participantes.add(p);
    }

    public void crearRonda() {
        Ronda ronda = new Ronda(participantes);
        rondas++;
        rondaActual = ronda;
        avisar(Eventos.rondaNueva);
    }

    public void crearRondaPasadores() {
        Ronda ronda = new Ronda(rondaActual.getPasadores(), rondaActual.getPozo());
        rondas++;
        rondaActual = ronda;
        avisar(Eventos.rondaNueva);
    }

    public void retirarseJuego(Participante p) {
        participantes.remove(p);
        retirados.add(p);
        if (rondaActual != null) {
            retirarseRonda(p);
        }
        if (participantes.size() == 1 && rondaActual != null) {
            //premiar al ganador en la ronda si es que hay sino solo felicitarlo
            avisar(Eventos.ganadorJuego);
        }
    }

    public void retirarseRonda(Participante p) {
        if (rondaActual.retirarse(p)) {
            avisar(Eventos.ganadorRonda);
        } else {
            avisar(Eventos.retiroJugador);
        }
    }

    public boolean lleno(int maximo) {
        return participantes.size() == maximo;
    }

    void datosIniciales() {
        fecha = new Date();
        for (Participante p : participantes) {
            p.iniciarSaldo();
        }

    }

    public ArrayList<Participante> getParticipantes() {
        return participantes;
    }

    public Participante buscar(Jugador j) {
        for (Participante p : participantes) {
            if (p.comparar(j)) {
                return p;
            }
        }
        return null;
    }

    public void apostar(Participante p, int monto) {
        rondaActual.apostar(p, monto);
        avisar(Eventos.apuestaNueva);
    }

    public void pasar(Participante p) {
        if (rondaActual.pasar(p)) {
            avisar(Eventos.continuar);
        }
    }

    public void continuar(Participante ganador) {
        continuan++;
        if (continuan == participantes.size()) {
            continuan = 0;
            if (ganador != null) {
                crearRonda();
            } else {
                crearRondaPasadores();
            }
        }
    }

    public void seleccionarGanadorRonda() {
        rondaActual.seleccionarGanadorRonda();
        avisar(Eventos.ganadorRonda);
        avisar(Eventos.continuar);
        //crearRonda();
    }

    public boolean seEncuentra(Participante participante) {
        return participantes.contains(participante);
    }

}
