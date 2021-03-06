/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.ArrayList;

/**
 *
 * @author Fernando
 */
public class SistemaUsuarios {

    private ArrayList<Jugador> jugadores = new ArrayList();
    private ArrayList<Administrador> administradores = new ArrayList();

    public void agregarJugador(String n, String c, String nc, int s) {
        jugadores.add(new Jugador(n, c, nc, s));

    }

    public void agregarUsuarioAdmin(String n, String c, String nc) {
        administradores.add(new Administrador(n, c, nc));

    }

    public Jugador loginJugador(String n, String c) throws PokerException {
        Jugador j = (Jugador) login(n, c, jugadores);
        return j;
    }

    public Administrador loginAdmin(String n, String c) throws PokerException {
        Administrador adm = (Administrador) login(n, c, administradores);
        return adm;
    }

    private Usuario login(String nom, String pwd, ArrayList usuarios) throws PokerException {
        Usuario u;
        boolean encontre = false;
        for (Object obj : usuarios) {
            u = (Usuario) obj;
            if (u.getNombreUsuario().equals(nom)) {
                encontre = true;
                if (u.getContrasenha().equals(pwd)) {
                    return u;
                }
            }
        }
        if (!encontre) {
            throw new PokerException("El nombre ingresado no es correcto");
        }
        return null;
    }

}
