/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import Observer.Observable;
import java.util.ArrayList;

/**
 *
 * @author Fernando
 */
public class Sistema extends Observable {

    private SistemaUsuarios sUsuarios = new SistemaUsuarios();
    private SistemaJuegos sJuegos = new SistemaJuegos();
    private static Sistema instancia = new Sistema();

    public enum Eventos {
        juegoNuevo,
        modificoListaEspera
    };

    public static Sistema getInstancia() {
        return instancia;
    }

    public Sistema() {
    }

    public void agregarJugador(String n, String c, String nc, int s) {
        sUsuarios.agregarJugador(n, c, nc, s);
    }

    public void agregarUsuarioAdmin(String n, String c, String nc) {
        sUsuarios.agregarUsuarioAdmin(n, c, nc);
    }

    public void crearConfiguracion(int luz, int participantes, ArrayList<Figura> figuras, ArrayList<Valor> valores, ArrayList<Palo> palos) {
        sJuegos.crearConfiguracion(luz, participantes, figuras, valores, palos);
    }

    public Configuracion getConfiguracion() {
        return sJuegos.getConfiguracion();
    }

    public Jugador loginJugador(String n, String c) throws PokerException {
        return sUsuarios.loginJugador(n, c);
    }

    public Administrador loginAdmin(String n, String c) throws PokerException {
        return sUsuarios.loginAdmin(n, c);
    }

    public Juego agregar(Jugador j) throws PokerException {
        return sJuegos.agregar(j);
    }

    public void empezarJuego() {
        sJuegos.empezarJuego();
    }

    public boolean listaEsperaLLena() {
        return sJuegos.listaEsperaLLena();
    }

    public int participantesFaltantes() {
        return sJuegos.participantesFaltantes();
    }

    public boolean saldoSuficiente(int saldo) {
        return sJuegos.saldoSuficiente(saldo);
    }

    public void salirListaEspera(Participante p) {
        sJuegos.salirListaEspera(p);
    }

    public ArrayList<Juego> juegosEnProgreso() {
        return sJuegos.juegosEnProgreso();
    }

}
