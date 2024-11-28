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
        BotonCalcular = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSpinnerRealizados2 = new javax.swing.JSpinner();
        jSpinnerTiros3 = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        jSpinnerTiros2 = new javax.swing.JSpinner();
        Jugador = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSpinnerLibresHechos = new javax.swing.JSpinner();
        jSpinnerLibresMetidos = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        jSpinnerRealizados3 = new javax.swing.JSpinner();
        jSpinnertirosRealizados = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        BotonCalcular.setText("Calcular");
        BotonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCalcularActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre del jugador");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tiros realizados de 2");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tiros metidos de 2");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Tiros metidos de 3");

        Jugador.setBackground(new java.awt.Color(255, 255, 255));
        Jugador.setForeground(new java.awt.Color(0, 0, 0));
        Jugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JugadorActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tiros Realizados");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Tiros libres metidos");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Tiros realizados de 3");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Tiros libres hechos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Jugador, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(197, 197, 197)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSpinnerLibresHechos, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                            .addComponent(jSpinnerLibresMetidos)
                            .addComponent(jSpinnerRealizados2)
                            .addComponent(jSpinnerTiros2)
                            .addComponent(jSpinnerRealizados3)
                            .addComponent(jSpinnerTiros3)
                            .addComponent(jSpinnertirosRealizados))))
                .addGap(33, 33, 33))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(BotonCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(Jugador))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnertirosRealizados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinnerLibresHechos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerLibresMetidos, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSpinnerRealizados2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinnerTiros2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSpinnerRealizados3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerTiros3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(BotonCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

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
    
        
    private void BotonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCalcularActionPerformed
           procesarYGenerarExcel(); 
    }//GEN-LAST:event_BotonCalcularActionPerformed

    private void JugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JugadorActionPerformed
    }//GEN-LAST:event_JugadorActionPerformed
    
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
                          tirosLibresMetidos, puntosTotales, tsPorcentaje, porcentajeFG, porcentajeEFG);

        // Confirmación
        JOptionPane.showMessageDialog(null, "Informe generado exitosamente: EstadisticasNBA.xlsx");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error al procesar los datos: " + ex.getMessage());
        }
}

private void crearInformeExcel(String nombreArchivo, String nombreJugador, int tirosRealizados, 
    int tirosMetidos2, int tirosMetidos3, int tirosLibresHechos, int tirosLibresMetidos, 
    int puntosTotales, double tsPorcentaje, double porcentajeFG, double porcentajeEFG) throws IOException {
   
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

    // Calcular medias generales de las columnas numéricas
    Row filaMedia = hoja.createRow(ultimaFilaDatos + 2); // La fila siguiente a los datos del jugador
    filaMedia.createCell(0).setCellValue("MEDIA");

    int totalFilasDatos = ultimaFilaDatos + 1; // Incluye la fila recién agregada
    for (int col = 1; col <= 9; col++) { // Columnas numéricas de la 1 a la 9
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner jSpinnerLibresHechos;
    private javax.swing.JSpinner jSpinnerLibresMetidos;
    private javax.swing.JSpinner jSpinnerRealizados2;
    private javax.swing.JSpinner jSpinnerRealizados3;
    private javax.swing.JSpinner jSpinnerTiros2;
    private javax.swing.JSpinner jSpinnerTiros3;
    private javax.swing.JSpinner jSpinnertirosRealizados;
    // End of variables declaration//GEN-END:variables
}
