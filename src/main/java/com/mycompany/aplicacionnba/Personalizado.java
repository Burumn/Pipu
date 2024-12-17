package com.mycompany.aplicacionnba;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author jmari
 */

public class Personalizado extends JLabel {
    

    public Personalizado() {
        super("Texto por defecto"); // Texto predeterminado
        configurarEstilo();
    }


    public Personalizado(String texto) {
        super(texto);
        configurarEstilo();
    }

    private void configurarEstilo() {
        setForeground(Color.white); 
        setOpaque(true); 
        setHorizontalAlignment(SwingConstants.CENTER); // Centrar texto
        setFont(new Font("Arial", Font.BOLD, 16)); // Fuente personalizada
    }


    public void cambiarTamaño(int sizeOption) {
        switch (sizeOption) {
            case 1:
                setFont(new Font(getFont().getName(), Font.PLAIN, 10));
                break;
            case 2:
                setFont(new Font(getFont().getName(), Font.PLAIN, 15));
                break;
            case 3: 
                setFont(new Font(getFont().getName(), Font.PLAIN, 20));
                break;
            default:
                throw new IllegalArgumentException("Opción de tamaño inválida. Use 1, 2 o 3.");
        }
    }
}
