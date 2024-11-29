/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.nba;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javax.swing.*;

import java.io.FileOutputStream;
import java.io.IOException;
/**
 *
 * @author Alba
 */
public class pagprincipal extends javax.swing.JFrame {
    
    

    public pagprincipal() {
        
        initComponents();
        //para que aparezca en el centro de la pantalla 
        this.setLocationRelativeTo(null);
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedTiros = new javax.swing.JTabbedPane();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        Jugador = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jSpinnertirosRealizados = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        jSpinnerLibresHechos = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        jSpinnerLibresMetidos = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jSpinnerRealizados2 = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        jSpinnerTiros2 = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        jSpinnerRealizados3 = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        jSpinnerTiros3 = new javax.swing.JSpinner();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jSpinnerRebotes = new javax.swing.JSpinner();
        jLabel10 = new javax.swing.JLabel();
        jSpinnerAsistencias = new javax.swing.JSpinner();
        jLabel11 = new javax.swing.JLabel();
        jSpinnerRobos = new javax.swing.JSpinner();
        jLabel12 = new javax.swing.JLabel();
        jSpinnerTaponesFavor = new javax.swing.JSpinner();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jSpinnerTirosCampoFallados = new javax.swing.JSpinner();
        jSpinnerTirosLibresFallados = new javax.swing.JSpinner();
        jSpinnerTaponesRecibidos = new javax.swing.JSpinner();
        jSpinnerPerdidas = new javax.swing.JSpinner();
        BotonCalcular = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jSpinnerFaltasRecibidas = new javax.swing.JSpinner();
        jLabel18 = new javax.swing.JLabel();
        jSpinnerFaltasRealizadas = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jTabbedTiros.setBackground(new java.awt.Color(0, 0, 0));

        jLayeredPane1.setBackground(new java.awt.Color(51, 51, 51));
        jLayeredPane1.setOpaque(true);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre del jugador");

        Jugador.setBackground(new java.awt.Color(255, 255, 255));
        Jugador.setForeground(new java.awt.Color(0, 0, 0));
        Jugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JugadorActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tiros Realizados");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Tiros libres hechos");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Tiros libres metidos");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tiros realizados de 2");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tiros metidos de 2");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Tiros realizados de 3");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Tiros metidos de 3");

        jLayeredPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(Jugador, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jSpinnertirosRealizados, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jSpinnerLibresHechos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jSpinnerLibresMetidos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jSpinnerRealizados2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jSpinnerTiros2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jSpinnerRealizados3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jSpinnerTiros3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(Jugador, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addGap(134, 134, 134)
                                .addComponent(jSpinnertirosRealizados, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(97, 97, 97))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jLayeredPane1Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jSpinnerTiros3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(88, 88, 88))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jLayeredPane1Layout.createSequentialGroup()
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(38, 38, 38)
                                        .addComponent(jSpinnerLibresHechos, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jSpinnerRealizados2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSpinnerLibresMetidos, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jSpinnerTiros2, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                                    .addComponent(jSpinnerRealizados3))))
                        .addGap(40, 40, 40)))
                .addGap(45, 45, 45))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jugador, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnertirosRealizados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinnerLibresHechos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerLibresMetidos, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerRealizados2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerTiros2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerTiros3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerRealizados3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(143, Short.MAX_VALUE))
        );

        jTabbedTiros.addTab("Tiros", jLayeredPane1);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Rebotes");

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Asistencias");

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Robos");

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Tapones a Favor");

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Tiros de campo fallados");

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Tiros libres fallados");

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Perdidas");

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Tapones recibidos");

        BotonCalcular.setText("Calcular");
        BotonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCalcularActionPerformed(evt);
            }
        });

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Faltas Recibidas");

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Faltas Realiadas");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSpinnerAsistencias, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel17)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jSpinnerFaltasRecibidas, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel15))
                                    .addGap(93, 93, 93)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jSpinnerRebotes)
                                        .addComponent(jSpinnerRobos)
                                        .addComponent(jSpinnerPerdidas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(127, 127, 127)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel16)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel18))
                        .addGap(32, 32, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSpinnerFaltasRealizadas, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinnerTaponesRecibidos, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinnerTirosLibresFallados, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinnerTirosCampoFallados, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinnerTaponesFavor, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(349, 349, 349)
                        .addComponent(BotonCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(155, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jSpinnerRebotes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(jSpinnerTirosCampoFallados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jSpinnerTaponesFavor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(jSpinnerAsistencias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jSpinnerTirosLibresFallados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(jSpinnerRobos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(jSpinnerTaponesRecibidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15)
                            .addComponent(jSpinnerPerdidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jSpinnerFaltasRecibidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel17)
                        .addComponent(jLabel18)
                        .addComponent(jSpinnerFaltasRealizadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(BotonCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        jTabbedTiros.addTab("Más Datos", jPanel2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedTiros)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedTiros, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
        
    private void BotonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCalcularActionPerformed
        procesarYGenerarExcel();
        calcularFormula(); // Calcula y muestra el resultado de la fórmula
    }//GEN-LAST:event_BotonCalcularActionPerformed

    private void JugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JugadorActionPerformed
    }//GEN-LAST:event_JugadorActionPerformed
    
    
    private void calcularFormula() {
    try {
        // Recuperar los valores desde los JSpinners
        int puntos = (2 * (int) jSpinnerTiros2.getValue()) + (3 * (int) jSpinnerTiros3.getValue()) + (int) jSpinnerLibresMetidos.getValue();
        int rebotes = (int) jSpinnerRebotes.getValue();
        int asistencias = (int) jSpinnerAsistencias.getValue();
        int robos = (int) jSpinnerRobos.getValue();
        int taponesFavor = (int) jSpinnerTaponesFavor.getValue();
        int faltasRecibidas = (int) jSpinnerFaltasRecibidas.getValue();

        int tirosCampoFallados = (int) jSpinnertirosRealizados.getValue() - ((int) jSpinnerTiros2.getValue() + (int) jSpinnerTiros3.getValue());
        int tirosLibresFallados = (int) jSpinnerLibresHechos.getValue() - (int) jSpinnerLibresMetidos.getValue();
        int perdidas = (int) jSpinnerPerdidas.getValue();
        int taponesRecibidos = (int) jSpinnerTaponesRecibidos.getValue();
        int faltasRealizadas = (int) jSpinnerFaltasRealizadas.getValue();

        // Fórmula
        int resultado = (puntos + rebotes + asistencias + robos + taponesFavor + faltasRecibidas)
                - (tirosCampoFallados + tirosLibresFallados + perdidas + taponesRecibidos + faltasRealizadas);

        
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error al calcular la fórmula: " + e.getMessage());
    }
}
    
   // Metodo que procesa los datos y genera el archivo Excel
     private void procesarYGenerarExcel() {
         try {
        // Obtiene datos de la interfaz
        String nombreJugador = Jugador.getText();
        int tirosRealizados = (int) jSpinnertirosRealizados.getValue();
        int tirosLibresHechos = (int) jSpinnerLibresHechos.getValue();
        int tirosLibresMetidos = (int) jSpinnerLibresMetidos.getValue();
        int tirosRealizados2 = (int) jSpinnerRealizados2.getValue();
        int tirosMetidos2 = (int) jSpinnerTiros2.getValue();
        int tirosRealizados3 = (int) jSpinnerRealizados3.getValue();
        int tirosMetidos3 = (int) jSpinnerTiros3.getValue();

        int rebotes = (int) jSpinnerRebotes.getValue();
        int asistencias = (int) jSpinnerAsistencias.getValue();
        int robos = (int) jSpinnerRobos.getValue();
        int taponesFavor = (int) jSpinnerTaponesFavor.getValue();
        int faltasRecibidas = (int) jSpinnerTirosCampoFallados.getValue();

        int tirosCampoFallados = (int) jSpinnertirosRealizados.getValue() - ((int) jSpinnerTiros2.getValue() + (int) jSpinnerTiros3.getValue());
        int tirosLibresFallados = (int) jSpinnerLibresHechos.getValue() - (int) jSpinnerLibresMetidos.getValue();
        int perdidas = (int) jSpinnerTirosLibresFallados.getValue();
        int taponesRecibidos = (int) jSpinnerTaponesRecibidos.getValue();
        int faltasRealizadas = (int) jSpinnerPerdidas.getValue();

        if (nombreJugador.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor ingrese el nombre del jugador.");
            return;
        }

        // Calcular %FG y %eFG
        double porcentajeFG = ((double) (tirosMetidos2 + tirosMetidos3) / tirosRealizados) * 100;
        double porcentajeEFG = ((double) (tirosMetidos2 + 1.5 * tirosMetidos3) / tirosRealizados) * 100;

        // Calcular puntos totales y TS%
        int puntosTotales = (2 * tirosMetidos2) + (3 * tirosMetidos3) + tirosLibresMetidos;
        System.out.println("Puntos totales:"+puntosTotales);
        double tsPorcentaje = (double) puntosTotales / (2 * (tirosRealizados2 + tirosRealizados3 + (0.44 * tirosRealizados))) * 100;

        // Crear archivo Excel
        String filePath = "C:\\Users\\alba_\\Documents\\NetBeansProjects\\NBA1_5\\NBAEstadisticasNBA_1_5.xlsx";
        crearInformeExcel(filePath, nombreJugador, tirosRealizados, tirosMetidos2, tirosMetidos3, tirosLibresHechos, 
                          tirosLibresMetidos, puntosTotales, asistencias, robos, rebotes, taponesFavor, faltasRecibidas, 
                          tirosCampoFallados, tirosLibresFallados, perdidas, taponesRecibidos, faltasRealizadas, 
                          tsPorcentaje, porcentajeFG, porcentajeEFG);
         
        JOptionPane.showMessageDialog(null, "Informe generado exitosamente: EstadisticasNBA.xlsx");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al procesar los datos: " + ex.getMessage());
        }
}

private void crearInformeExcel(String nombreArchivo, String nombreJugador, int tirosRealizados, 
    int tirosMetidos2, int tirosMetidos3, int tirosLibresHechos, int tirosLibresMetidos, 
    int puntosTotales, int asistencias, int robos,int Rebotes, int taponesFavor, int faltasRecibidas, 
    int tirosCampoFallados, int tirosLibresFallados, int perdidas, int taponesRecibidos, 
    int faltasRealizadas, double tsPorcentaje, double porcentajeFG, double porcentajeEFG) throws IOException {
   
    // Crear referencias para Workbook y Sheet
    Workbook libroExcel;
    Sheet hoja;

    File archivoExcel = new File(nombreArchivo);

    if (archivoExcel.exists()) {
        // Si el archivo existe, cargarlo
        FileInputStream fis = new FileInputStream(archivoExcel);
        libroExcel = new XSSFWorkbook(fis);
        hoja = libroExcel.getSheetAt(0); // Obtener la primera hoja
        fis.close();
        
    } else {
        // Si el archivo no existe, crear uno nuevo
        libroExcel = new XSSFWorkbook();
        hoja = libroExcel.createSheet("Estadísticas");

        // Crear encabezados
      Row encabezado = hoja.createRow(0);
        encabezado.createCell(0).setCellValue("Nombre del Jugador");
        encabezado.createCell(1).setCellValue("Tiros Realizados");
        encabezado.createCell(2).setCellValue("Tiros Metidos de 2");
        encabezado.createCell(3).setCellValue("Tiros Metidos de 3");
        encabezado.createCell(4).setCellValue("Tiros Libres Hechos");
        encabezado.createCell(5).setCellValue("Tiros Libres Metidos");
        encabezado.createCell(6).setCellValue("Puntos Totales");
        encabezado.createCell(7).setCellValue("TS%");
        encabezado.createCell(8).setCellValue("% FG");
        encabezado.createCell(9).setCellValue("% eFG");
        encabezado.createCell(10).setCellValue("Rebotes");
        encabezado.createCell(11).setCellValue("Asistencias");
        encabezado.createCell(12).setCellValue("Robos");
        encabezado.createCell(13).setCellValue("Tapones a Favor");
        encabezado.createCell(14).setCellValue("Faltas Recibidas");
        encabezado.createCell(15).setCellValue("Tiros Campo Fallados");
        encabezado.createCell(16).setCellValue("Tiros Libres Fallados");
        encabezado.createCell(17).setCellValue("Pérdidas");
        encabezado.createCell(18).setCellValue("Tapones Recibidos");
        encabezado.createCell(19).setCellValue("Faltas Realizadas");
    }

    // Buscar la última fila antes de la media
    int ultimaFilaDatos = hoja.getLastRowNum();

    // Si existe la fila de medias, quitarla antes de agregar nuevos datos
    if (ultimaFilaDatos > 0 && hoja.getRow(ultimaFilaDatos).getCell(0).getStringCellValue().equalsIgnoreCase("MEDIA")) {
        hoja.removeRow(hoja.getRow(ultimaFilaDatos));
        ultimaFilaDatos--; // Ajustar el índice de la última fila de datos
    }

    // Crear una nueva fila para los datos del jugador
    Row filaNueva = hoja.createRow(ultimaFilaDatos + 1);
    filaNueva.createCell(0).setCellValue(nombreJugador);
    filaNueva.createCell(1).setCellValue(tirosRealizados);
    filaNueva.createCell(2).setCellValue(tirosMetidos2);  
    filaNueva.createCell(3).setCellValue(tirosMetidos3);  
    filaNueva.createCell(4).setCellValue(tirosLibresHechos);
    filaNueva.createCell(5).setCellValue(tirosLibresMetidos);
    filaNueva.createCell(6).setCellValue(puntosTotales);
    filaNueva.createCell(7).setCellValue(tsPorcentaje);
    filaNueva.createCell(8).setCellValue(porcentajeFG);
    filaNueva.createCell(9).setCellValue(porcentajeEFG);
    filaNueva.createCell(10).setCellValue(Rebotes);
    filaNueva.createCell(11).setCellValue(asistencias);
    filaNueva.createCell(12).setCellValue(robos);
    filaNueva.createCell(13).setCellValue(taponesFavor);
    filaNueva.createCell(14).setCellValue(faltasRecibidas);
    filaNueva.createCell(15).setCellValue(tirosCampoFallados);
    filaNueva.createCell(16).setCellValue(tirosLibresFallados);
    filaNueva.createCell(17).setCellValue(perdidas);
    filaNueva.createCell(18).setCellValue(taponesRecibidos);
    filaNueva.createCell(19).setCellValue(faltasRealizadas);

    // Calcular medias generales de las columnas numéricas
    Row filaMedia = hoja.createRow(ultimaFilaDatos + 2); // La fila siguiente a los datos del jugador
    filaMedia.createCell(0).setCellValue("MEDIA");

    int totalFilasDatos = ultimaFilaDatos + 1; 
    
    for (int col = 1; col <= 19; col++) { // Columnas numéricas de la 1 a la 9
        double suma = 0;
        for (int i = 1; i <= totalFilasDatos; i++) { // Ignorar encabezados
            Row filaDatos = hoja.getRow(i);
            suma += filaDatos.getCell(col).getNumericCellValue();
        }
        double media = suma / totalFilasDatos;
        filaMedia.createCell(col).setCellValue(media);
    }

    // Autoajustar columnas
    for (int i = 0; i <= 9; i++) {  
        hoja.autoSizeColumn(i);
    }

    // Guardar archivo Excel
    try (FileOutputStream archivo = new FileOutputStream(nombreArchivo)) {
        libroExcel.write(archivo);
    }
        libroExcel.close();
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pagprincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCalcular;
    private javax.swing.JTextField Jugador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSpinner jSpinnerAsistencias;
    private javax.swing.JSpinner jSpinnerFaltasRealizadas;
    private javax.swing.JSpinner jSpinnerFaltasRecibidas;
    private javax.swing.JSpinner jSpinnerLibresHechos;
    private javax.swing.JSpinner jSpinnerLibresMetidos;
    private javax.swing.JSpinner jSpinnerPerdidas;
    private javax.swing.JSpinner jSpinnerRealizados2;
    private javax.swing.JSpinner jSpinnerRealizados3;
    private javax.swing.JSpinner jSpinnerRebotes;
    private javax.swing.JSpinner jSpinnerRobos;
    private javax.swing.JSpinner jSpinnerTaponesFavor;
    private javax.swing.JSpinner jSpinnerTaponesRecibidos;
    private javax.swing.JSpinner jSpinnerTiros2;
    private javax.swing.JSpinner jSpinnerTiros3;
    private javax.swing.JSpinner jSpinnerTirosCampoFallados;
    private javax.swing.JSpinner jSpinnerTirosLibresFallados;
    private javax.swing.JSpinner jSpinnertirosRealizados;
    private javax.swing.JTabbedPane jTabbedTiros;
    // End of variables declaration//GEN-END:variables
}
