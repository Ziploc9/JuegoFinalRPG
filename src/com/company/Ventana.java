package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

import Characters.Personaje;

public class Ventana extends JFrame {

    public Ventana(){
        setDefaultCloseOperation(EXIT_ON_CLOSE); // termina el programa automaticamente
        setTitle("WarriorFarmer");
        setSize(800,500); // tamanio de la ventana
        setLocationRelativeTo(null); // centra la ventana a la pantalla
        iniciarComp();
    }

    private void iniciarComp(){
        /**---Panel / hoja par escribir---**/
        JPanel panel = new JPanel(); //Se usa para crear una "hoja" (panel) y no escribir directamente sobre la "mesa"
        this.getContentPane().add(panel); //agrega panel a la ventana para trabajar en el
        panel.setLayout(null); //desactivar diseño default del panel

        /**---Texto---**/
        JLabel frase = new JLabel();
        frase.setText("Lejanas eran las tierras, a las que un hombre decidio irse, pero no creia en los dichos, que los pueblerinos dijeron al irse.");
        frase.setBounds(10, 0, 900,800); //ubicacion del texto
        frase.setFont(new Font("Arial", Font.BOLD,12));
        panel.add(frase); //Agrega texto al panel

        /**---Imagen de fondo--**/
        ImageIcon imag = new ImageIcon("src/imagenes/villa.jpg");
        JLabel imagen = new JLabel();
        imagen.setBounds(0,0,800,500);
        imagen.setIcon(new ImageIcon(imag.getImage().getScaledInstance(imagen.getWidth(),imagen.getHeight(),1)));
        panel.add(imagen);

    }



}
