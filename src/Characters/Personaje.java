package Characters;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Personaje extends JPanel implements KeyListener {

    private String nombre;
    private int vida;
    private int damage;
    private int resistencia;
    private double velocidad;
    private JLabel move = new JLabel();

    public Personaje(){
        addKeyListener(this);
        setFocusable(true);
        add(move);
    }

    /**---Get&Set---*/
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    /**---Methods---*/
    public static void caminar(){

    }

    public static void atacar(){

    }

    public static void abrircasa(){

    }


    @Override
    public void keyTyped(KeyEvent e) {
        if(e.getKeyChar() == 'w' || e.getKeyChar() == 'W' || e.getExtendedKeyCode() == KeyEvent.VK_UP){
            move.setLocation(move.getX(), move.getY() -5);
        }
        if(e.getKeyChar() == 's' || e.getKeyChar() == 'S' || e.getExtendedKeyCode() == KeyEvent.VK_DOWN){
            move.setLocation(move.getX(), move.getY() +5);
        }
        if(e.getKeyChar() == 'd' || e.getKeyChar() == 'D' || e.getExtendedKeyCode() == KeyEvent.VK_RIGHT){
            move.setLocation(move.getX() + 5, move.getY());
        }
        if(e.getKeyChar() == 'a' || e.getKeyChar() == 'A' || e.getExtendedKeyCode() == KeyEvent.VK_LEFT){
            move.setLocation(move.getX() - 5, move.getY());
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
