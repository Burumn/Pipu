package com.mycompany.aplicacionnba;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.geom.PageSize;
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
import java.awt.Color;

import java.util.Iterator;
import org.jfree.chart.ChartUtils;
import org.jfree.data.category.DefaultCategoryDataset;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.properties.TextAlignment;
import java.awt.Component;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;



/**
 *
 * @author jmari
 */
public class IntefazNBA extends javax.swing.JFrame {
    
    // Define equipos y jugadores
    String[] equipo1 = {"Russell Westbrook", "Christian Braun", "Michael Porter Jr.", "Aaron Gordon", "Nikola Jokic"};
    String[] equipo2 = {"Immanuel Quickley", "Garrett Temple", "Bruce Broen", "Chris Boucher", "Jakob Poeltl"};
    
    
    FrameCondiciones frameCondiciones = new FrameCondiciones();

    public IntefazNBA() {
        
        initComponents();
        this.setLocationRelativeTo(null);
        jComboBoxEquipo.addActionListener(e -> incluirJugadores());
        
        // Llena el JComboBox con los equipos
        jComboBoxEquipo.addItem("Denver Nuggets");
        jComboBoxEquipo.addItem("Toronto Raptors");
        
        jButtonGrafico.addActionListener(this::jButtonGrafico);
        
        jMenuItemPequeño.addActionListener(e-> cambiarTamaño());
        jMenuItemMediano.addActionListener(e-> cambiarTamaño());
        jMenuItemGrande.addActionListener(e-> cambiarTamaño());
        cambiarTamaño();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jSeparator1 = new javax.swing.JSeparator();
        jMenuItem1 = new javax.swing.JMenuItem();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jTabbedTiros = new javax.swing.JTabbedPane();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jSpinnertirosRealizados = new javax.swing.JSpinner();
        jSpinnerLibresHechos = new javax.swing.JSpinner();
        jSpinnerLibresMetidos = new javax.swing.JSpinner();
        jSpinnerRealizados2 = new javax.swing.JSpinner();
        jSpinnerTiros2 = new javax.swing.JSpinner();
        jSpinnerRealizados3 = new javax.swing.JSpinner();
        jSpinnerTiros3 = new javax.swing.JSpinner();
        jComboBoxJugador = new javax.swing.JComboBox<>();
        jComboBoxEquipo = new javax.swing.JComboBox<>();
        personalizado1 = new Personalizado();
        personalizado2 = new Personalizado();
        personalizado3 = new Personalizado();
        personalizado4 = new Personalizado();
        personalizado5 = new Personalizado();
        personalizado6 = new Personalizado();
        personalizado7 = new Personalizado();
        personalizado8 = new Personalizado();
        personalizado9 = new Personalizado();
        jPanel2 = new javax.swing.JPanel();
        jSpinnerRebotes = new javax.swing.JSpinner();
        jSpinnerAsistencias = new javax.swing.JSpinner();
        jSpinnerRobos = new javax.swing.JSpinner();
        jSpinnerTaponesFavor = new javax.swing.JSpinner();
        jSpinnerTirosCampoFallados = new javax.swing.JSpinner();
        jSpinnerTirosLibresFallados = new javax.swing.JSpinner();
        jSpinnerTaponesRecibidos = new javax.swing.JSpinner();
        jSpinnerPerdidas = new javax.swing.JSpinner();
        BotonCalcular = new javax.swing.JButton();
        jSpinnerFaltasRecibidas = new javax.swing.JSpinner();
        jSpinnerFaltasRealizadas = new javax.swing.JSpinner();
        jButtonGrafico = new javax.swing.JButton();
        PDF = new javax.swing.JButton();
        personalizado10 = new Personalizado();
        personalizado11 = new Personalizado();
        personalizado12 = new Personalizado();
        personalizado13 = new Personalizado();
        personalizado14 = new Personalizado();
        personalizado15 = new Personalizado();
        personalizado16 = new Personalizado();
        personalizado17 = new Personalizado();
        personalizado18 = new Personalizado();
        personalizado19 = new Personalizado();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemPequeño = new javax.swing.JRadioButtonMenuItem();
        jMenuItemMediano = new javax.swing.JRadioButtonMenuItem();
        jMenuItemGrande = new javax.swing.JRadioButtonMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(251, 251, 251));

        jTabbedTiros.setBackground(new java.awt.Color(251, 251, 251));

        jLayeredPane1.setBackground(new java.awt.Color(251, 251, 251));
        jLayeredPane1.setMaximumSize(new java.awt.Dimension(423, 751));
        jLayeredPane1.setMinimumSize(new java.awt.Dimension(423, 751));
        jLayeredPane1.setOpaque(true);
        jLayeredPane1.setPreferredSize(new java.awt.Dimension(481, 751));
        jLayeredPane1.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 28;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTHEAST;
        gridBagConstraints.insets = new java.awt.Insets(29, 18, 0, 0);
        jLayeredPane1.add(jSpinnertirosRealizados, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        gridBagConstraints.insets = new java.awt.Insets(19, 18, 0, 0);
        jLayeredPane1.add(jSpinnerLibresHechos, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        gridBagConstraints.insets = new java.awt.Insets(12, 18, 0, 0);
        jLayeredPane1.add(jSpinnerLibresMetidos, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(17, 18, 0, 0);
        jLayeredPane1.add(jSpinnerRealizados2, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 18, 0, 0);
        jLayeredPane1.add(jSpinnerTiros2, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(14, 18, 0, 0);
        jLayeredPane1.add(jSpinnerRealizados3, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(16, 18, 0, 0);
        jLayeredPane1.add(jSpinnerTiros3, gridBagConstraints);

        jComboBoxJugador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        jComboBoxJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxJugadorActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 58;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(45, 32, 0, 0);
        jLayeredPane1.add(jComboBoxJugador, gridBagConstraints);

        jComboBoxEquipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 59;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(44, 45, 0, 0);
        jLayeredPane1.add(jComboBoxEquipo, gridBagConstraints);

        personalizado1.setBackground(new java.awt.Color(0, 0, 0));
        personalizado1.setText("Equipo");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 38;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(44, 45, 0, 0);
        jLayeredPane1.add(personalizado1, gridBagConstraints);

        personalizado2.setBackground(new java.awt.Color(0, 0, 0));
        personalizado2.setText("Jugador");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 39;
        gridBagConstraints.ipady = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(44, 71, 0, 0);
        jLayeredPane1.add(personalizado2, gridBagConstraints);

        personalizado3.setBackground(new java.awt.Color(0, 0, 0));
        personalizado3.setText("Tiros Realizados");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 44;
        gridBagConstraints.ipady = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(45, 41, 0, 1);
        jLayeredPane1.add(personalizado3, gridBagConstraints);

        personalizado4.setBackground(new java.awt.Color(0, 0, 0));
        personalizado4.setText("Tiros Libres Hechos");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTH;
        gridBagConstraints.insets = new java.awt.Insets(1, 41, 3, 0);
        jLayeredPane1.add(personalizado4, gridBagConstraints);

        personalizado5.setBackground(new java.awt.Color(0, 0, 0));
        personalizado5.setText("Tiros realizados de 2");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.ipady = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(16, 41, 0, 0);
        jLayeredPane1.add(personalizado5, gridBagConstraints);

        personalizado6.setBackground(new java.awt.Color(0, 0, 0));
        personalizado6.setText("Tiros realizados de 3");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(17, 41, 0, 0);
        jLayeredPane1.add(personalizado6, gridBagConstraints);

        personalizado7.setBackground(new java.awt.Color(0, 0, 0));
        personalizado7.setText("Tiros libres metidos");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 64;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(19, 42, 0, 0);
        jLayeredPane1.add(personalizado7, gridBagConstraints);

        personalizado8.setBackground(new java.awt.Color(0, 0, 0));
        personalizado8.setText("Tiros metidos de 2");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 74;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 42, 0, 0);
        jLayeredPane1.add(personalizado8, gridBagConstraints);

        personalizado9.setBackground(new java.awt.Color(0, 0, 0));
        personalizado9.setText("Tiros metidos de 3");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 74;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(17, 42, 0, 0);
        jLayeredPane1.add(personalizado9, gridBagConstraints);

        jTabbedTiros.addTab("Tiros", jLayeredPane1);

        jPanel2.setBackground(new java.awt.Color(251, 251, 251));
        jPanel2.setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(49, 39, 0, 0);
        jPanel2.add(jSpinnerRebotes, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(32, 39, 0, 0);
        jPanel2.add(jSpinnerAsistencias, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(32, 39, 0, 0);
        jPanel2.add(jSpinnerRobos, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(32, 12, 0, 96);
        jPanel2.add(jSpinnerTaponesFavor, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(49, 12, 0, 96);
        jPanel2.add(jSpinnerTirosCampoFallados, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(32, 12, 0, 96);
        jPanel2.add(jSpinnerTirosLibresFallados, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(32, 12, 0, 96);
        jPanel2.add(jSpinnerTaponesRecibidos, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(32, 39, 0, 0);
        jPanel2.add(jSpinnerPerdidas, gridBagConstraints);

        BotonCalcular.setText("Calcular");
        BotonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCalcularActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.ipadx = 38;
        gridBagConstraints.ipady = 17;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(40, 85, 0, 0);
        jPanel2.add(BotonCalcular, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(32, 39, 0, 0);
        jPanel2.add(jSpinnerFaltasRecibidas, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(31, 12, 0, 96);
        jPanel2.add(jSpinnerFaltasRealizadas, gridBagConstraints);

        jButtonGrafico.setText(" Grafica");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.ipadx = 39;
        gridBagConstraints.ipady = 17;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(40, 8, 0, 0);
        jPanel2.add(jButtonGrafico, gridBagConstraints);

        PDF.setText("PDF");
        PDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PDFActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 42;
        gridBagConstraints.ipady = 19;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(39, 104, 55, 96);
        jPanel2.add(PDF, gridBagConstraints);

        personalizado10.setBackground(new java.awt.Color(0, 0, 0));
        personalizado10.setText("Rebotes");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 99;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(50, 44, 0, 0);
        jPanel2.add(personalizado10, gridBagConstraints);

        personalizado11.setBackground(new java.awt.Color(0, 0, 0));
        personalizado11.setText("Asistencias");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 75;
        gridBagConstraints.ipady = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(31, 44, 0, 0);
        jPanel2.add(personalizado11, gridBagConstraints);

        personalizado12.setBackground(new java.awt.Color(0, 0, 0));
        personalizado12.setText("Robos");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 112;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(33, 44, 0, 0);
        jPanel2.add(personalizado12, gridBagConstraints);

        personalizado13.setBackground(new java.awt.Color(0, 0, 0));
        personalizado13.setText("Perdidas");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 95;
        gridBagConstraints.ipady = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(31, 44, 0, 0);
        jPanel2.add(personalizado13, gridBagConstraints);

        personalizado14.setBackground(new java.awt.Color(0, 0, 0));
        personalizado14.setText("Faltas Recibidas");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 37;
        gridBagConstraints.ipady = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(31, 44, 0, 0);
        jPanel2.add(personalizado14, gridBagConstraints);

        personalizado15.setBackground(new java.awt.Color(0, 0, 0));
        personalizado15.setText("Tiros de campo fallados");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 41;
        gridBagConstraints.ipady = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(48, 30, 0, 0);
        jPanel2.add(personalizado15, gridBagConstraints);

        personalizado16.setBackground(new java.awt.Color(0, 0, 0));
        personalizado16.setText("Tapones a Favor");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 64;
        gridBagConstraints.ipady = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(31, 30, 0, 0);
        jPanel2.add(personalizado16, gridBagConstraints);

        personalizado17.setBackground(new java.awt.Color(0, 0, 0));
        personalizado17.setText("Tiros libres fallados");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 74;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(33, 29, 0, 0);
        jPanel2.add(personalizado17, gridBagConstraints);

        personalizado18.setBackground(new java.awt.Color(0, 0, 0));
        personalizado18.setText("Tapones recibidos");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(33, 29, 0, 0);
        jPanel2.add(personalizado18, gridBagConstraints);

        personalizado19.setBackground(new java.awt.Color(0, 0, 0));
        personalizado19.setText("Faltas Realizadas");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 58;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(32, 32, 0, 0);
        jPanel2.add(personalizado19, gridBagConstraints);

        jTabbedTiros.addTab("Más Datos", jPanel2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTabbedTiros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedTiros, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jMenu1.setText("Tamaño");

        buttonGroup1.add(jMenuItemPequeño);
        jMenuItemPequeño.setSelected(true);
        jMenuItemPequeño.setText("Pequeño");
        jMenuItemPequeño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPequeñoActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItemPequeño);

        buttonGroup1.add(jMenuItemMediano);
        jMenuItemMediano.setText("Mediano");
        jMenu1.add(jMenuItemMediano);

        buttonGroup1.add(jMenuItemGrande);
        jMenuItemGrande.setText("Grande");
        jMenu1.add(jMenuItemGrande);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Condiciones de Servicio");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
            
    private void incluirJugadores() {
        String equipoSeleccionado = (String) jComboBoxEquipo.getSelectedItem();

        jComboBoxJugador.removeAllItems();  // Limpia el JComboBox de jugadores

        if (equipoSeleccionado.equals("Denver Nuggets")) {
            // Agrega jugadores del equipo Los Ángeles Lakers
            for (String jugador : equipo1) {
                jComboBoxJugador.addItem(jugador);
            }
        } else if (equipoSeleccionado.equals("Toronto Raptors")) {
            // Agrega jugadores del equipo Golden State Warriors
            for (String jugador : equipo2) {
                jComboBoxJugador.addItem(jugador);
            }
        }
    }
    
    // Método para leer los puntos de un archivo Excel para un jugador
    private int[] puntosExcel(String jugadorSeleccionado, String equipoSeleccionado) {
        try {
            // Ruta del archivo Excel (se asume que el archivo se encuentra en el disco)
            String filePath = "EstadisticasNBA" + equipoSeleccionado + ".xlsx";

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

    
    private int[] rebotesExcel(String jugadorSeleccionado, String equipoSeleccionado) {
        try {
            String filePath = "EstadisticasNBA"  + equipoSeleccionado + ".xlsx";
            FileInputStream fileInputStream = new FileInputStream(new File(filePath));
            Workbook workbook = new XSSFWorkbook(fileInputStream);

            
            Sheet sheet = workbook.getSheet(jugadorSeleccionado);
            if (sheet == null) {
                JOptionPane.showMessageDialog(this, "No se encontró la hoja para el jugador seleccionado.");
                return new int[0]; 
            }

           
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
    
    private void generarGraficoJugadorEspecifico(String jugadorSeleccionado, int[] puntosPorPartido, int[] rebotesPorPartido) {
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

        
        double sumaPuntos = 0;
        for (int puntos : puntosPorPartido) {
            sumaPuntos += puntos;
        }
        double mediaPuntos = sumaPuntos / puntosPorPartido.length;

        
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

        
        JFreeChart graficoPuntos = ChartFactory.createBarChart(
            "Rendimiento de Puntos de " + jugadorSeleccionado,"Partidos","Puntos",datasetPuntos
        );

        
        CategoryPlot plotPuntos = graficoPuntos.getCategoryPlot();
        plotPuntos.setDataset(1, datasetMediaPuntos);
        plotPuntos.mapDatasetToRangeAxis(1, 0);

        
        org.jfree.chart.renderer.category.LineAndShapeRenderer rendererMedia = new org.jfree.chart.renderer.category.LineAndShapeRenderer();
        rendererMedia.setSeriesPaint(0, Color.RED);
        plotPuntos.setRenderer(1, rendererMedia);

        
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
        int[] puntosPorPartido = puntosExcel(jugadorSeleccionado, equipoSeleccionado);
        int[] rebotesPorPartido = rebotesExcel(jugadorSeleccionado, equipoSeleccionado);

        // Generar el gráfico con los puntos y rebotes obtenidos
        generarGraficoJugadorEspecifico(jugadorSeleccionado, puntosPorPartido, rebotesPorPartido);
    }
               
    private int calcularPuntos() {
        try {
            
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

            
            int resultado = (puntos + rebotes + asistencias + robos + taponesFavor + faltasRecibidas)
                    - (tirosCampoFallados + tirosLibresFallados + perdidas + taponesRecibidos + faltasRealizadas);

            return resultado;  

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al calcular la fórmula: " + e.getMessage());
            return 0;  // Si ocurre un error, retornar 0 
        }
    }
    
    private void generarExcel() {
       
        try {
            
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

            
            int resultado = calcularPuntos();

            
            double porcentajeFG = ((double) (tirosMetidos2 + tirosMetidos3) / tirosRealizados) * 100;
            double porcentajeEFG = ((double) (tirosMetidos2 + 1.5 * tirosMetidos3) / tirosRealizados) * 100;

            
            int puntosTotales = (2 * tirosMetidos2) + (3 * tirosMetidos3) + tirosLibresMetidos;
            double tsPorcentaje = (double) puntosTotales / (2 * (tirosRealizados2 + tirosRealizados3 + (0.44 * tirosRealizados))) * 100;

            
            String filePath = "EstadisticasNBA" + jComboBoxEquipo.getSelectedItem() + ".xlsx";
          
            // Crea el archivo Excel con hojas para cada jugador y medias
            Excel(filePath, equipoSeleccionado, jugadorSeleccionado, tirosRealizados, tirosMetidos2, tirosMetidos3, tirosLibresHechos,
                tirosLibresMetidos, puntosTotales, asistencias, robos, rebotes, taponesFavor, faltasRecibidas,
                tirosCampoFallados, tirosLibresFallados, perdidas, taponesRecibidos, faltasRealizadas,
                tsPorcentaje, porcentajeFG, porcentajeEFG, resultado);

            JOptionPane.showMessageDialog(null, "Informe generado exitosamente.");

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

        generarExcel();
        calcularPuntos();
    }//GEN-LAST:event_BotonCalcularActionPerformed
    
    // Método para generar el PDF del jugador seleccionado
    private void generarPDFJugadorEspecifico(String jugadorSeleccionado, String equipoSeleccionado) {
        try {
            String directorioPDF = "./PDF/" + equipoSeleccionado + "/";
            new File(directorioPDF).mkdirs();
            String rutaPDF = directorioPDF + jugadorSeleccionado + ".pdf";

            
            PdfWriter writer = new PdfWriter(rutaPDF);
            PdfDocument pdf = new PdfDocument(writer);
            Document document = new Document(pdf, PageSize.A4, false);
            document.setMargins(10, 10, 10, 10);

            
            document.add(new Paragraph("Estadísticas de " + jugadorSeleccionado + " - " + equipoSeleccionado)
                    .setFontSize(16).setBold().setTextAlignment(TextAlignment.CENTER));
            document.add(new Paragraph("\n"));

            
            int[] puntos = puntosExcel(jugadorSeleccionado, equipoSeleccionado);
            int[] rebotes = rebotesExcel(jugadorSeleccionado, equipoSeleccionado);
            int[] asistencias = asistenciasExcel(jugadorSeleccionado, equipoSeleccionado);

            
            String directorioGraficos = "graficos/" + jugadorSeleccionado;
            new File(directorioGraficos).mkdirs();

            
            guardarGraficoPuntos(puntos, jugadorSeleccionado, directorioGraficos);
            guardarGraficoRebotes(rebotes, jugadorSeleccionado, directorioGraficos);
            guardarGraficoAsistencias(asistencias, jugadorSeleccionado, directorioGraficos);

            
            agregarGraficoPDF(document, directorioGraficos + "/grafico_puntos.jpg", "Gráfico de Puntos");
            agregarGraficoPDF(document, directorioGraficos + "/grafico_rebotes.jpg", "Gráfico de Rebotes");
            agregarGraficoPDF(document, directorioGraficos + "/grafico_asistencias.jpg", "Gráfico de Asistencias");

            
            document.add(new Paragraph("\nOtras estadísticas:").setBold());
            double mediaTriplesMetidos = mediaExcel(jugadorSeleccionado, equipoSeleccionado, 6);
            double mediaFG = mediaExcel(jugadorSeleccionado, equipoSeleccionado, 7);
            double mediaEFG = mediaExcel(jugadorSeleccionado, equipoSeleccionado, 8);
            double mediaTS = mediaExcel(jugadorSeleccionado, equipoSeleccionado, 9);

            
            document.add(new Paragraph(String.format("Triples metidos por partido: %.2f    FG%%: %.2f%%", mediaTriplesMetidos, mediaFG)));
            document.add(new Paragraph(String.format("eFG%%: %.2f%%    TS%%: %.2f%%", mediaEFG, mediaTS)));

            
            document.close();
            JOptionPane.showMessageDialog(this, "PDF generado exitosamente en: " + rutaPDF);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al generar el PDF: " + e.getMessage());
        }
    }

    
    private double mediaExcel(String jugadorSeleccionado, String equipoSeleccionado, int columna) {
        double suma = 0;
        int contador = 0;

        try {
            
            String filePath = "EstadisticasNBA" + equipoSeleccionado + ".xlsx";
            FileInputStream fileInputStream = new FileInputStream(new File(filePath));
            Workbook workbook = new XSSFWorkbook(fileInputStream);

            
            Sheet sheet = workbook.getSheet(jugadorSeleccionado);
            if (sheet == null) {
                JOptionPane.showMessageDialog(this, "No se encontró la hoja para el jugador seleccionado.");
                return 0;
            }

            
            Iterator<Row> rowIterator = sheet.iterator();
            rowIterator.next(); // Salta la fila de encabezado
            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();
                Cell cell = row.getCell(columna);
                if (cell != null && cell.getCellType() == CellType.NUMERIC) {
                    suma += cell.getNumericCellValue();
                    contador++;
                }
            }

            workbook.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al calcular la media desde Excel: " + e.getMessage());
        }

        return contador > 0 ? suma / contador : 0;
    }
    
    
    private int[] asistenciasExcel(String jugadorSeleccionado, String equipoSeleccionado) {
        try {
            // Ruta del archivo Excel
            String filePath = "EstadisticasNBA" + equipoSeleccionado + ".xlsx";
            FileInputStream fileInputStream = new FileInputStream(new File(filePath));
            Workbook workbook = new XSSFWorkbook(fileInputStream);

            
            Sheet sheet = workbook.getSheet(jugadorSeleccionado);
            if (sheet == null) {
                JOptionPane.showMessageDialog(this, "No se encontró la hoja para el jugador seleccionado.");
                return new int[0]; 
            }


            int numPartidos = sheet.getPhysicalNumberOfRows() - 1; // Excluir la fila de encabezado
            int[] asistenciasPorPartido = new int[numPartidos];

            Iterator<Row> rowIterator = sheet.iterator();
            rowIterator.next(); // Salta la fila de encabezado
            int i = 0;
            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();
                Cell cell = row.getCell(7); // asistencias están en la columna 7
                if (cell != null && cell.getCellType() == CellType.NUMERIC) {
                    asistenciasPorPartido[i++] = (int) cell.getNumericCellValue();
                }
            }

            workbook.close();
            return asistenciasPorPartido;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al leer asistencias desde Excel: " + e.getMessage());
            return new int[0]; // Retorna un array vacío en caso de error
        }
    }


    
    private void guardarGraficoPuntos(int[] datos, String jugador, String directorio) throws IOException {
        
        DefaultCategoryDataset datasetPuntos = new DefaultCategoryDataset();
        for (int i = 0; i < datos.length; i++) {
            datasetPuntos.addValue(datos[i], "Puntos", "Partido " + (i + 1));
        }

        
        double suma = 0;
        for (int valor : datos) {
            suma += valor;
        }
        double media = datos.length > 0 ? suma / datos.length : 0;

        
        DefaultCategoryDataset datasetMedia = new DefaultCategoryDataset();
        for (int i = 0; i < datos.length; i++) {
            datasetMedia.addValue(media, "Media", "Partido " + (i + 1));
        }

        
        JFreeChart chart = ChartFactory.createBarChart(
            "Puntos de " + jugador,
            "Partidos",
            "Puntos",
            datasetPuntos
        );

        
        CategoryPlot plot = chart.getCategoryPlot();
        plot.setDataset(1, datasetMedia); // Añade el dataset de la media
        plot.mapDatasetToRangeAxis(1, 0); // Vincula el dataset de la media al mismo eje

        
        LineAndShapeRenderer lineRenderer = new LineAndShapeRenderer();
        lineRenderer.setSeriesPaint(0, Color.RED); // Color de la línea de media
        plot.setRenderer(1, lineRenderer);

        
        ChartUtils.saveChartAsJPEG(new File(directorio + "/grafico_puntos.jpg"), chart, 800, 600);
    }

    private void guardarGraficoRebotes(int[] datos, String jugador, String directorio) throws IOException {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (int i = 0; i < datos.length; i++) {
            dataset.addValue(datos[i], "Rebotes", "Partido " + (i + 1));
        }
        JFreeChart chart = ChartFactory.createLineChart("Rebotes de " + jugador, "Partidos", "Rebotes", dataset);
        ChartUtils.saveChartAsJPEG(new File(directorio + "/grafico_rebotes.jpg"), chart, 800, 600);
    }

    private void guardarGraficoAsistencias(int[] datos, String jugador, String directorio) throws IOException {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (int i = 0; i < datos.length; i++) {
            dataset.addValue(datos[i], "Asistencias", "Partido " + (i + 1));
        }
        JFreeChart chart = ChartFactory.createBarChart("Asistencias de " + jugador, "Partidos", "Asistencias", dataset);
        ChartUtils.saveChartAsJPEG(new File(directorio + "/grafico_asistencias.jpg"), chart, 800, 600);
    }

    
    private void agregarGraficoPDF(Document document, String rutaGrafico, String titulo) throws IOException {
        ImageData imageData = ImageDataFactory.create(rutaGrafico);
        Image image = new Image(imageData).scaleToFit(400, 300);
        document.add(new Paragraph(titulo + ":"));
        document.add(image);
    }

    private void PDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PDFActionPerformed
      
         
        String jugadorSeleccionado = (String) jComboBoxJugador.getSelectedItem();
        if (jugadorSeleccionado == null || jugadorSeleccionado.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un jugador.");
            return;
        }

        
        String equipoSeleccionado = (String) jComboBoxEquipo.getSelectedItem();
        if (equipoSeleccionado == null || equipoSeleccionado.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un equipo.");
            return;
        }

        
        generarPDFJugadorEspecifico(jugadorSeleccionado, equipoSeleccionado);
        
    }//GEN-LAST:event_PDFActionPerformed

    private void jComboBoxJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxJugadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxJugadorActionPerformed

    private void jMenuItemPequeñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPequeñoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItemPequeñoActionPerformed

    
    //abrir ventana jframe 
    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked

        frameCondiciones.setVisible(true);
        
    }//GEN-LAST:event_jMenu2MouseClicked
    
    private void Excel(String nombreArchivo, String equipo, String nombreJugador, int tirosRealizados, int tirosMetidos2, int tirosMetidos3,
                               int tirosLibresHechos, int tirosLibresMetidos, int puntosTotales, int asistencias, int robos, int rebotes,
                               int taponesFavor, int faltasRecibidas, int tirosCampoFallados, int tirosLibresFallados, int perdidas,
                               int taponesRecibidos, int faltasRealizadas, double tsPorcentaje, double porcentajeFG, double porcentajeEFG,
                               int resultado) throws IOException {

        
        Workbook libroTrabajo;
        File archivo = new File(nombreArchivo);
        if (archivo.exists()) {
            libroTrabajo = new XSSFWorkbook(new FileInputStream(archivo));
        } else {
            libroTrabajo = new XSSFWorkbook();
        }

        
        Sheet hojaJugador = libroTrabajo.getSheet(nombreJugador);
        if (hojaJugador == null) {
            hojaJugador = libroTrabajo.createSheet(nombreJugador);
            Row filaEncabezadoJugador = hojaJugador.createRow(0);

            
            String[] columnas = {"Tiros Realizados", "Tiros Metidos 2", "Tiros Metidos 3", "Tiros Libres Hechos", "Tiros Libres Metidos",
                    "Puntos Totales", "Asistencias", "Robos", "Rebotes", "Tapones Favor", "Faltas Recibidas", "Tiros Campo Fallados",
                    "Tiros Libres Fallados", "Perdidas", "Tapones Recibidos", "Faltas Realizadas", "TS%", "%FG", "%eFG", "Resultado"};

            for (int i = 0; i < columnas.length; i++) {
                filaEncabezadoJugador.createCell(i).setCellValue(columnas[i]);
            }
        }

        
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

        
        Sheet hojaMedias = libroTrabajo.getSheet("Medias");
        if (hojaMedias == null) {
            hojaMedias = libroTrabajo.createSheet("Medias");

            
            String[] encabezadoMedias = {"Jugador", "Promedio Puntos", "Promedio Rebotes", "Promedio Asistencias", "Promedio Robos", "Promedio Tapones"};
            Row filaEncabezado = hojaMedias.createRow(0);
            for (int i = 0; i < encabezadoMedias.length; i++) {
                filaEncabezado.createCell(i).setCellValue(encabezadoMedias[i]);
            }
        }

        
        int totalFilas = hojaJugador.getPhysicalNumberOfRows();
        double sumaPuntos = 0, sumaRebotes = 0, sumaAsistencias = 0, sumaRobos = 0, sumaTapones = 0;

        for (int i = 1; i < totalFilas; i++) {
            Row fila = hojaJugador.getRow(i);
            sumaPuntos += fila.getCell(5).getNumericCellValue();
            sumaRebotes += fila.getCell(8).getNumericCellValue();
            sumaAsistencias += fila.getCell(6).getNumericCellValue();
            sumaRobos += fila.getCell(7).getNumericCellValue(); 
            sumaTapones += fila.getCell(9).getNumericCellValue(); 
        }

       
        double promedioPuntos = sumaPuntos / (totalFilas - 1);
        double promedioRebotes = sumaRebotes / (totalFilas - 1);
        double promedioAsistencias = sumaAsistencias / (totalFilas - 1);
        double promedioRobos = sumaRobos / (totalFilas - 1);
        double promedioTapones = sumaTapones / (totalFilas - 1);

      
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

        
        FileOutputStream archivoSalida = new FileOutputStream(new File(nombreArchivo));
        libroTrabajo.write(archivoSalida);
        archivoSalida.close();
    }

    

    
    private void cambiarTamaño() {
        int tamanioSeleccionado = 0;

        if (jMenuItemPequeño.isSelected()) {
            tamanioSeleccionado = 1;
        } else if (jMenuItemMediano.isSelected()) {
            tamanioSeleccionado = 2;
        } else if (jMenuItemGrande.isSelected()) {
            tamanioSeleccionado = 3;
        }

        System.out.println("Tamaño seleccionado: " + tamanioSeleccionado);

        for (Component comp : jLayeredPane1.getComponents()) {
            if (comp instanceof Personalizado) {
                Personalizado lbl = (Personalizado) comp;
                lbl.cambiarTamaño(tamanioSeleccionado);
                System.out.println("Cambiando: " + tamanioSeleccionado);
            }
        }
        
         for (Component comp : jPanel2.getComponents()) {
            if (comp instanceof Personalizado) {
                Personalizado lbl = (Personalizado) comp;
                lbl.cambiarTamaño(tamanioSeleccionado);
                System.out.println("Cambiando: " + tamanioSeleccionado);
            }
        }
    }
    
    

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String args[]) {
          java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new IntefazNBA().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCalcular;
    private javax.swing.JButton PDF;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonGrafico;
    private javax.swing.JComboBox<String> jComboBoxEquipo;
    private javax.swing.JComboBox<String> jComboBoxJugador;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JRadioButtonMenuItem jMenuItemGrande;
    private javax.swing.JRadioButtonMenuItem jMenuItemMediano;
    private javax.swing.JRadioButtonMenuItem jMenuItemPequeño;
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
    private Personalizado personalizado1;
    private Personalizado personalizado10;
    private Personalizado personalizado11;
    private Personalizado personalizado12;
    private Personalizado personalizado13;
    private Personalizado personalizado14;
    private Personalizado personalizado15;
    private Personalizado personalizado16;
    private Personalizado personalizado17;
    private Personalizado personalizado18;
    private Personalizado personalizado19;
    private Personalizado personalizado2;
    private Personalizado personalizado3;
    private Personalizado personalizado4;
    private Personalizado personalizado5;
    private Personalizado personalizado6;
    private Personalizado personalizado7;
    private Personalizado personalizado8;
    private Personalizado personalizado9;
    // End of variables declaration//GEN-END:variables
}


