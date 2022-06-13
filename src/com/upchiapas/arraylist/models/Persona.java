package com.upchiapas.arraylist.models;

public class Persona {
    private String nombre;
    private String apellidoPaterno;
    private char genero;
    private byte edad;

    public Persona(String nombre, String apellidoPaterno, char genero, byte edad) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.genero = genero;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }
}
