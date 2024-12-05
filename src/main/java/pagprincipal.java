/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javax.swing.*;

import java.io.FileOutputStream;
import java.io.IOException;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.renderer.category.BarRenderer;
import java.awt.Color;

import java.util.Iterator;
import org.jfree.chart.ChartUtils;
import org.jfree.data.category.DefaultCategoryDataset;




/**
 *
 * @author Alba
 */
public class pagprincipal extends javax.swing.JFrame {
    
    // Define equipos y jugadores
    String[] equipo1 = {"LeBron James", "Anthony Davis", "D'Angelo Russell", "Austin Reaves", "Rui Hachimura"};
    String[] equipo2 = {"Stephen Curry", "Klay Thompson", "Draymond Green", "Andrew Wiggins", "Kevon Looney"};

    public pagprincipal() {
        
        initComponents();
        this.setLocationRelativeTo(null);
        jComboBoxEquipo.addActionListener(e -> actualizarJugadores());
        
        // Llena el JComboBox con los equipos
        jComboBoxEquipo.addItem("Los Ángeles Lakers");
        jComboBoxEquipo.addItem("Golden State Warriors");
        
        jButtonGrafico.addActionListener(this::jButtonGrafico);

    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jTabbedTiros = new javax.swing.JTabbedPane();
        jLayeredPane1 = new javax.swing.JLayeredPane();
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
        jugador = new javax.swing.JLabel();
        Equipo = new javax.swing.JLabel();
        jComboBoxJugador = new javax.swing.JComboBox<>();
        jComboBoxEquipo = new javax.swing.JComboBox<>();
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
        jButtonGrafico = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jTabbedTiros.setBackground(new java.awt.Color(0, 0, 0));

        jLayeredPane1.setBackground(new java.awt.Color(51, 51, 51));
        jLayeredPane1.setOpaque(true);
        jLayeredPane1.setPreferredSize(new java.awt.Dimension(605, 357));

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

        jugador.setForeground(new java.awt.Color(255, 255, 255));
        jugador.setText("Jugador");

        Equipo.setForeground(new java.awt.Color(255, 255, 255));
        Equipo.setText("Equipo");

        jComboBoxJugador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        jComboBoxEquipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

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
        jLayeredPane1.setLayer(jugador, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(Equipo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jComboBoxJugador, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jComboBoxEquipo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(Equipo)
                        .addGap(40, 40, 40)
                        .addComponent(jComboBoxEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(146, 146, 146)
                        .addComponent(jugador, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBoxJugador, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35)
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSpinnerTiros3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jSpinnerRealizados2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jSpinnerLibresHechos, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addGap(166, 166, 166)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSpinnertirosRealizados, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(56, 56, 56)
                                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jSpinnerTiros2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSpinnerRealizados3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSpinnerLibresMetidos, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(72, 72, 72))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jugador, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxJugador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Equipo))
                .addGap(40, 40, 40)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnertirosRealizados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jSpinnerLibresHechos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinnerRealizados2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinnerTiros3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jSpinnerLibresMetidos, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinnerTiros2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinnerRealizados3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(46, Short.MAX_VALUE))
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

        jButtonGrafico.setText(" Grafica");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSpinnerAsistencias, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
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
                                .addComponent(jSpinnerPerdidas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel17)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(BotonCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSpinnerFaltasRecibidas, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel16)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSpinnerFaltasRealizadas, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinnerTaponesRecibidos, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinnerTirosLibresFallados, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinnerTirosCampoFallados, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinnerTaponesFavor, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(jButtonGrafico, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(147, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
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
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jSpinnerFaltasRecibidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(jSpinnerFaltasRealizadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonGrafico, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedTiros.addTab("Más Datos", jPanel2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTabbedTiros, javax.swing.GroupLayout.PREFERRED_SIZE, 834, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTabbedTiros)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 832, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
            
    private void actualizarJugadores() {
        String equipoSeleccionado = (String) jComboBoxEquipo.getSelectedItem();

        jComboBoxJugador.removeAllItems();  // Limpia el JComboBox de jugadores

        if (equipoSeleccionado.equals("Los Ángeles Lakers")) {
            // Agrega jugadores del equipo Los Ángeles Lakers
            for (String jugador : equipo1) {
                jComboBoxJugador.addItem(jugador);
            }
        } else if (equipoSeleccionado.equals("Golden State Warriors")) {
            // Agrega jugadores del equipo Golden State Warriors
            for (String jugador : equipo2) {
                jComboBoxJugador.addItem(jugador);
            }
        }
    }
    
    // Método para leer los puntos de un archivo Excel para un jugador
    private int[] obtenerPuntosDesdeExcel(String jugadorSeleccionado, String equipoSeleccionado) {
        try {
            // Ruta del archivo Excel (se asume que el archivo se encuentra en el disco)
            String filePath = "C:\\Users\\alba_\\Documents\\NetBeansProjects\\NBA4.5\\EstadisticasNBA_4_5" + equipoSeleccionado + ".xlsx";

            FileInputStream fileInputStream = new FileInputStream(new File(filePath));
            Workbook workbook = new XSSFWorkbook(fileInputStream);
            
            // Buscar la hoja correspondiente al jugador seleccionado
            Sheet sheet = workbook.getSheet(jugadorSeleccionado);
            if (sheet == null) {
                JOptionPane.showMessageDialog(this, "No se encontró la hoja para el jugador seleccionado.");
                return new int[0]; // Devolver un array vacío si no se encuentra la hoja
            }

            // Leer los puntos de la columna de puntos (suponiendo que están en la columna 5)
            int numPartidos = sheet.getPhysicalNumberOfRows() - 1; // Excluir la fila de encabezado
            int[] puntosPorPartido = new int[numPartidos];

            Iterator<Row> rowIterator = sheet.iterator();
            rowIterator.next(); // Saltamos la fila de encabezado
            int i = 0;
            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();
                double puntos = row.getCell(5).getNumericCellValue(); // Supongamos que los puntos están en la columna 5
                puntosPorPartido[i++] = (int) puntos;
            }
            
            return puntosPorPartido;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al leer el archivo Excel: " + e.getMessage());
            return new int[0]; // Devolver un array vacío en caso de error
        }
    }

    
    private int[] obtenerRebotesDesdeExcel(String jugadorSeleccionado, String equipoSeleccionado) {
        try {
            String filePath = "C:\\Users\\alba_\\Documents\\NetBeansProjects\\NBA4.5\\EstadisticasNBA_4_5" + equipoSeleccionado + ".xlsx";
            FileInputStream fileInputStream = new FileInputStream(new File(filePath));
            Workbook workbook = new XSSFWorkbook(fileInputStream);

            // Buscar la hoja correspondiente al jugador seleccionado
            Sheet sheet = workbook.getSheet(jugadorSeleccionado);
            if (sheet == null) {
                JOptionPane.showMessageDialog(this, "No se encontró la hoja para el jugador seleccionado.");
                return new int[0]; 
            }

            // Leer los rebotes de la columna 9 (rebotes)
            int numPartidos = sheet.getPhysicalNumberOfRows() - 1; 
            int[] rebotesPorPartido = new int[numPartidos];

            Iterator<Row> rowIterator = sheet.iterator();
            rowIterator.next(); 
            int i = 0;
            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();
                double rebotes = row.getCell(9).getNumericCellValue(); 
                rebotesPorPartido[i++] = (int) rebotes;
            }

            return rebotesPorPartido;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al leer el archivo Excel: " + e.getMessage());
            return new int[0];
        }
    }
    
    private void generarGraficoJugador(String jugadorSeleccionado, int[] puntosPorPartido, int[] rebotesPorPartido) {
        if (jugadorSeleccionado == null || jugadorSeleccionado.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un jugador.");
            return;
        }

        if (puntosPorPartido.length == 0 || rebotesPorPartido.length == 0) {
            JOptionPane.showMessageDialog(this, "No se encontraron puntos o rebotes para el jugador seleccionado.");
            return;
        }

        // Crear carpetas para guardar gráficos
        String directorioJugador = "graficos/" + jugadorSeleccionado;
        File carpetaJugador = new File(directorioJugador);
        if (!carpetaJugador.exists()) {
            carpetaJugador.mkdirs();
        }

        // Calcular la media de puntos
        double sumaPuntos = 0;
        for (int puntos : puntosPorPartido) {
            sumaPuntos += puntos;
        }
        double mediaPuntos = sumaPuntos / puntosPorPartido.length;

        // Crear el dataset para los puntos y la línea de la media
        DefaultCategoryDataset datasetPuntos = new DefaultCategoryDataset();
        DefaultCategoryDataset datasetMediaPuntos = new DefaultCategoryDataset();
        for (int i = 0; i < puntosPorPartido.length; i++) {
            datasetPuntos.addValue(puntosPorPartido[i], "Puntos", "Partido " + (i + 1));
            datasetMediaPuntos.addValue(mediaPuntos, "Media Puntos", "Partido " + (i + 1));
        }

        // Crear el dataset para los rebotes
        DefaultCategoryDataset datasetRebotes = new DefaultCategoryDataset();
        for (int i = 0; i < rebotesPorPartido.length; i++) {
            datasetRebotes.addValue(rebotesPorPartido[i], "Rebotes", "Partido " + (i + 1));
        }

        // **Gráfico de puntos**
        JFreeChart graficoPuntos = ChartFactory.createBarChart(
            "Rendimiento de Puntos de " + jugadorSeleccionado,
            "Partidos",
            "Puntos",
            datasetPuntos
        );

        // Agregar la línea de la media al gráfico de puntos
        CategoryPlot plotPuntos = graficoPuntos.getCategoryPlot();
        plotPuntos.setDataset(1, datasetMediaPuntos);
        plotPuntos.mapDatasetToRangeAxis(1, 0);

        // Personalizar la línea de la media
        org.jfree.chart.renderer.category.LineAndShapeRenderer rendererMedia = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
        rendererMedia.setSeriesPaint(0, Color.RED);
        plotPuntos.setRenderer(1, rendererMedia);

        // Guardar el gráfico de puntos
        try {
            File archivoPuntos = new File(directorioJugador + "/grafico_puntos.jpg");
            ChartUtils.saveChartAsJPEG(archivoPuntos, graficoPuntos, 800, 600);
            JOptionPane.showMessageDialog(this, "Gráfico de puntos generado en: " + archivoPuntos.getAbsolutePath());
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error al guardar el gráfico de puntos: " + e.getMessage());
        }

        // **Gráfico de rebotes**
        JFreeChart graficoRebotes = ChartFactory.createLineChart(
            "Rendimiento de Rebotes de " + jugadorSeleccionado,
            "Partidos",
            "Rebotes",
            datasetRebotes
        );

        // Personalizar el gráfico de rebotes (línea azul)
        CategoryPlot plotRebotes = graficoRebotes.getCategoryPlot();
        org.jfree.chart.renderer.category.LineAndShapeRenderer rendererRebotes = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
        rendererRebotes.setSeriesPaint(0, Color.BLUE);
        plotRebotes.setRenderer(0, rendererRebotes);

        // Guardar el gráfico de rebotes
        try {
            File archivoRebotes = new File(directorioJugador + "/grafico_rebotes.jpg");
            ChartUtils.saveChartAsJPEG(archivoRebotes, graficoRebotes, 800, 600);
            JOptionPane.showMessageDialog(this, "Gráfico de rebotes generado en: " + archivoRebotes.getAbsolutePath());
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Error al guardar el gráfico de rebotes: " + e.getMessage());
        }
    }



    // Evento del botón para generar el gráfico
    private void jButtonGrafico(java.awt.event.ActionEvent evt) {
        String jugadorSeleccionado = (String) jComboBoxJugador.getSelectedItem();
        if (jugadorSeleccionado == null || jugadorSeleccionado.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un jugador.");
            return;
        }

        // Obtener el equipo seleccionado
        String equipoSeleccionado = (String) jComboBoxEquipo.getSelectedItem(); 

        // Obtener los puntos y rebotes por partido desde el archivo Excel
        int[] puntosPorPartido = obtenerPuntosDesdeExcel(jugadorSeleccionado, equipoSeleccionado);
        int[] rebotesPorPartido = obtenerRebotesDesdeExcel(jugadorSeleccionado, equipoSeleccionado);

        // Generar el gráfico con los puntos y rebotes obtenidos
        generarGraficoJugador(jugadorSeleccionado, puntosPorPartido, rebotesPorPartido);
    }
                
    
    
   
    private int calcularFormula() {
        try {
            // Recupera los valores desde los JSpinners
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

            return resultado;  

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al calcular la fórmula: " + e.getMessage());
            return 0;  // Si ocurre un error, retornar 0 
        }
    }
   
    
    private void procesarYGenerarExcel() {
       
        try {
            // Obtiene el nombre del jugador y equipo desde el JComboBox
            String equipoSeleccionado = (String) jComboBoxEquipo.getSelectedItem();
            String jugadorSeleccionado = (String) jComboBoxJugador.getSelectedItem();
            
            if (equipoSeleccionado == null || equipoSeleccionado.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor, seleccione un equipo.");
                return;
            }
            
            if (jugadorSeleccionado == null || jugadorSeleccionado.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Por favor, seleccione un jugador.");
                return;
            }

            // Obtiene los valores desde los JSpinners
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

            // Calcula el resultado usando la fórmula
            int resultado = calcularFormula();

            // Calcula %FG y %eFG
            double porcentajeFG = ((double) (tirosMetidos2 + tirosMetidos3) / tirosRealizados) * 100;
            double porcentajeEFG = ((double) (tirosMetidos2 + 1.5 * tirosMetidos3) / tirosRealizados) * 100;

            // Calcula puntos totales y TS%
            int puntosTotales = (2 * tirosMetidos2) + (3 * tirosMetidos3) + tirosLibresMetidos;
            double tsPorcentaje = (double) puntosTotales / (2 * (tirosRealizados2 + tirosRealizados3 + (0.44 * tirosRealizados))) * 100;

            // Generea el Excel para el equipo y jugador
            String filePath = "C:\\Users\\alba_\\Documents\\NetBeansProjects\\NBA4.5\\EstadisticasNBA_4_5" + jComboBoxEquipo.getSelectedItem() + ".xlsx";
          
            // Crea el archivo Excel con hojas para cada jugador y medias
            crearInformeExcel(filePath, equipoSeleccionado, jugadorSeleccionado, tirosRealizados, tirosMetidos2, tirosMetidos3, tirosLibresHechos,
                tirosLibresMetidos, puntosTotales, asistencias, robos, rebotes, taponesFavor, faltasRecibidas,
                tirosCampoFallados, tirosLibresFallados, perdidas, taponesRecibidos, faltasRealizadas,
                tsPorcentaje, porcentajeFG, porcentajeEFG, resultado);

            JOptionPane.showMessageDialog(null, "Informe generado exitosamente: EstadisticasNBA_4_5.xlsx");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al procesar los datos: " + ex.getMessage());
        }
    }
     
     
    
    private void BotonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCalcularActionPerformed
        // Verifica que se haya seleccionado un jugador
        String jugadorSeleccionado = (String) jComboBoxJugador.getSelectedItem();
        if (jugadorSeleccionado == null || jugadorSeleccionado.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un jugador.");
            return;
        }

        procesarYGenerarExcel();
        calcularFormula();
    }//GEN-LAST:event_BotonCalcularActionPerformed
    
    private void crearInformeExcel(String nombreArchivo, String equipo, String nombreJugador, int tirosRealizados, int tirosMetidos2, int tirosMetidos3,
                               int tirosLibresHechos, int tirosLibresMetidos, int puntosTotales, int asistencias, int robos, int rebotes,
                               int taponesFavor, int faltasRecibidas, int tirosCampoFallados, int tirosLibresFallados, int perdidas,
                               int taponesRecibidos, int faltasRealizadas, double tsPorcentaje, double porcentajeFG, double porcentajeEFG,
                               int resultado) throws IOException {

        // Crea un archivo de Excel si no existe
        Workbook libroTrabajo;
        File archivo = new File(nombreArchivo);
        if (archivo.exists()) {
            libroTrabajo = new XSSFWorkbook(new FileInputStream(archivo));
        } else {
            libroTrabajo = new XSSFWorkbook();
        }

        // Hoja del jugador: se añade una nueva fila para cada nuevo conjunto de datos
        Sheet hojaJugador = libroTrabajo.getSheet(nombreJugador);
        if (hojaJugador == null) {
            hojaJugador = libroTrabajo.createSheet(nombreJugador);
            Row filaEncabezadoJugador = hojaJugador.createRow(0);

            // Encabezados de la hoja del jugador
            String[] columnas = {"Tiros Realizados", "Tiros Metidos 2", "Tiros Metidos 3", "Tiros Libres Hechos", "Tiros Libres Metidos",
                    "Puntos Totales", "Asistencias", "Robos", "Rebotes", "Tapones Favor", "Faltas Recibidas", "Tiros Campo Fallados",
                    "Tiros Libres Fallados", "Perdidas", "Tapones Recibidos", "Faltas Realizadas", "TS%", "%FG", "%eFG", "Resultado"};

            for (int i = 0; i < columnas.length; i++) {
                filaEncabezadoJugador.createCell(i).setCellValue(columnas[i]);
            }
        }

        // Encuentra la próxima fila vacía para agregar nuevos datos
        int filaJugadorIndex = hojaJugador.getPhysicalNumberOfRows();
        Row filaJugador = hojaJugador.createRow(filaJugadorIndex);

        Object[] datosJugador = {tirosRealizados, tirosMetidos2, tirosMetidos3, tirosLibresHechos, tirosLibresMetidos,
                puntosTotales, asistencias, robos, rebotes, taponesFavor, faltasRecibidas, tirosCampoFallados,
                tirosLibresFallados, perdidas, taponesRecibidos, faltasRealizadas, tsPorcentaje, porcentajeFG, porcentajeEFG, resultado};

        for (int i = 0; i < datosJugador.length; i++) {
            if (datosJugador[i] instanceof Integer) {
                filaJugador.createCell(i).setCellValue((Integer) datosJugador[i]);
            } else if (datosJugador[i] instanceof Double) {
                filaJugador.createCell(i).setCellValue((Double) datosJugador[i]);
            }
        }

        // Actualiza los promedios en la hoja "Medias"
        Sheet hojaMedias = libroTrabajo.getSheet("Medias");
        if (hojaMedias == null) {
            hojaMedias = libroTrabajo.createSheet("Medias");

            // Encabezado para la hoja "Medias"
            String[] encabezadoMedias = {"Jugador", "Promedio Puntos", "Promedio Rebotes", "Promedio Asistencias", "Promedio Robos", "Promedio Tapones"};
            Row filaEncabezado = hojaMedias.createRow(0);
            for (int i = 0; i < encabezadoMedias.length; i++) {
                filaEncabezado.createCell(i).setCellValue(encabezadoMedias[i]);
            }
        }

        // Calcula los nuevos promedios basados en la hoja del jugador
        int totalFilas = hojaJugador.getPhysicalNumberOfRows();
        double sumaPuntos = 0, sumaRebotes = 0, sumaAsistencias = 0, sumaRobos = 0, sumaTapones = 0;

        for (int i = 1; i < totalFilas; i++) {
            Row fila = hojaJugador.getRow(i);
            sumaPuntos += fila.getCell(5).getNumericCellValue();  // Puntos Totales
            sumaRebotes += fila.getCell(8).getNumericCellValue(); // Rebotes
            sumaAsistencias += fila.getCell(6).getNumericCellValue(); // Asistencias
            sumaRobos += fila.getCell(7).getNumericCellValue(); // Robos
            sumaTapones += fila.getCell(9).getNumericCellValue(); // Tapones Favor
        }

        // Calcula los promedios
        double promedioPuntos = sumaPuntos / (totalFilas - 1);
        double promedioRebotes = sumaRebotes / (totalFilas - 1);
        double promedioAsistencias = sumaAsistencias / (totalFilas - 1);
        double promedioRobos = sumaRobos / (totalFilas - 1);
        double promedioTapones = sumaTapones / (totalFilas - 1);

        // Busca la fila del jugador en la hoja "Medias" o añade una nueva
        boolean encontrado = false;
        for (int i = 1; i < hojaMedias.getPhysicalNumberOfRows(); i++) {
            Row filaMedia = hojaMedias.getRow(i);
            if (filaMedia.getCell(0).getStringCellValue().equals(nombreJugador)) {
                filaMedia.getCell(1).setCellValue(promedioPuntos);
                filaMedia.getCell(2).setCellValue(promedioRebotes);
                filaMedia.getCell(3).setCellValue(promedioAsistencias);
                filaMedia.getCell(4).setCellValue(promedioRobos);
                filaMedia.getCell(5).setCellValue(promedioTapones);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            int filaMediaIndex = hojaMedias.getPhysicalNumberOfRows();
            Row nuevaFilaMedia = hojaMedias.createRow(filaMediaIndex);
            nuevaFilaMedia.createCell(0).setCellValue(nombreJugador);
            nuevaFilaMedia.createCell(1).setCellValue(promedioPuntos);
            nuevaFilaMedia.createCell(2).setCellValue(promedioRebotes);
            nuevaFilaMedia.createCell(3).setCellValue(promedioAsistencias);
            nuevaFilaMedia.createCell(4).setCellValue(promedioRobos);
            nuevaFilaMedia.createCell(5).setCellValue(promedioTapones);
        }

        // Guarda el archivo
        FileOutputStream archivoSalida = new FileOutputStream(new File(nombreArchivo));
        libroTrabajo.write(archivoSalida);
        archivoSalida.close();
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
    private javax.swing.JLabel Equipo;
    private javax.swing.JButton jButtonGrafico;
    private javax.swing.JComboBox<String> jComboBoxEquipo;
    private javax.swing.JComboBox<String> jComboBoxJugador;
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
    private javax.swing.JSeparator jSeparator1;
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
    private javax.swing.JLabel jugador;
    // End of variables declaration//GEN-END:variables
}

