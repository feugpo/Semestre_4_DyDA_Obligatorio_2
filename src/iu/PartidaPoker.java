/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iu;

import Controladores.ControladorPartidaPoker;
import Vistas.VistaPartidaPoker;
import java.util.ArrayList;
import logica.Juego;
import logica.Participante;
import javax.swing.*;

/**
 *
 * @author Gabriel
 */
public class PartidaPoker extends javax.swing.JDialog implements VistaPartidaPoker {

    /**
     * Creates new form PartidaPoker
     */
    private ControladorPartidaPoker ctrlPoker;

    public PartidaPoker(java.awt.Frame parent, boolean modal, Juego juego, Participante participante) {
        super(parent, modal);
        initComponents();
        this.ctrlPoker = new ControladorPartidaPoker(this, juego, participante);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMensaje = new javax.swing.JLabel();
        jCarta1 = new javax.swing.JButton();
        jCarta2 = new javax.swing.JButton();
        jCarta3 = new javax.swing.JButton();
        jCarta4 = new javax.swing.JButton();
        jCarta5 = new javax.swing.JButton();
        jBtnApostar = new javax.swing.JButton();
        jBtnPasar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jMensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jMensaje.setText("ESPERANDO PARA EMPEZAR");

        jCarta1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gabriel\\Documents\\NetBeansProjects\\cartas\\Invertida.gif")); // NOI18N
        jCarta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCarta1ActionPerformed(evt);
            }
        });
        jCarta1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jCarta1PropertyChange(evt);
            }
        });

        jCarta2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gabriel\\Documents\\NetBeansProjects\\cartas\\Invertida.gif")); // NOI18N
        jCarta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCarta2ActionPerformed(evt);
            }
        });

        jCarta3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gabriel\\Documents\\NetBeansProjects\\cartas\\Invertida.gif")); // NOI18N

        jCarta4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gabriel\\Documents\\NetBeansProjects\\cartas\\Invertida.gif")); // NOI18N

        jCarta5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Gabriel\\Documents\\NetBeansProjects\\cartas\\Invertida.gif")); // NOI18N

        jBtnApostar.setText("APOSTAR");
        jBtnApostar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnApostarActionPerformed(evt);
            }
        });

        jBtnPasar.setText("PASAR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jMensaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCarta1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jCarta2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jCarta3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jCarta4, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jCarta5, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(286, 286, 286)
                        .addComponent(jBtnApostar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jBtnPasar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jCarta1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCarta2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCarta3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCarta4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jCarta5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(52, 52, 52)
                .addComponent(jMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBtnApostar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtnPasar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCarta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCarta1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCarta1ActionPerformed

    private void jCarta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCarta2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCarta2ActionPerformed

    private void jBtnApostarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnApostarActionPerformed
        int respuesta = Integer.parseInt(JOptionPane.showInputDialog(this, "Cuanto apuesta?", "Ingresar apuesta", -1));
        ctrlPoker.apostar(respuesta);
    }//GEN-LAST:event_jBtnApostarActionPerformed

    private void jCarta1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jCarta1PropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_jCarta1PropertyChange

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtnApostar;
    private javax.swing.JButton jBtnPasar;
    private javax.swing.JButton jCarta1;
    private javax.swing.JButton jCarta2;
    private javax.swing.JButton jCarta3;
    private javax.swing.JButton jCarta4;
    private javax.swing.JButton jCarta5;
    private javax.swing.JLabel jMensaje;
    // End of variables declaration//GEN-END:variables

    @Override
    public void cargarVistaParticipante(Participante p) {
        this.setTitle(p.getJugador().getNombreCompleto());
        asignarRutaBoton(ctrlPoker.rutaCartas());
        
//        if (p.tieneMano()) {
//            asignarRutaBoton(ctrlPoker.rutaCartas());
//        }else{
//            asignarRutaBoton(ctrlPoker.rutaCartas());
//        }

    }

    private void asignarRutaBoton(ArrayList<String> rutas) {
        Icon c1 = new ImageIcon(rutas.get(0));
        jCarta1.setIcon(c1);
        Icon c2 = new ImageIcon(rutas.get(1));
        jCarta2.setIcon(c2);
        Icon c3 = new ImageIcon(rutas.get(2));
        jCarta3.setIcon(c3);
        Icon c4 = new ImageIcon(rutas.get(3));
        jCarta4.setIcon(c4);
        Icon c5 = new ImageIcon(rutas.get(4));
        jCarta5.setIcon(c5);
    }
    
    

    @Override
    public void alertarApuesta() {
        int respuesta = JOptionPane.showOptionDialog(this, "Aceptas o rechazas?", "Aceptar Apuesta", -1, JOptionPane.OK_CANCEL_OPTION, null, new String[]{"Acepto", "Rechazo"}, "default");
        if (respuesta == 0) {
            //acepta
            ctrlPoker.aceptarApuesta();
        } else {
            //rechaza
            ctrlPoker.rechazarApuesta();
        }
    }

    

}
