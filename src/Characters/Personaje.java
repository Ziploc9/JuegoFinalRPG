package Characters;

import javax.swing.*;


public class Personaje {

    private String nombre;
    private int vida;
    private int damage;
    private int resistencia;
    private double velocidad;
    public Personaje(){

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

}
