package com.upchiapas.arraylist;

import com.upchiapas.arraylist.models.Directorio;
import com.upchiapas.arraylist.models.Persona;

public class Main {
    public static void main(String[] args) {

        Directorio directorio = new Directorio();
        //Elemento 01
        directorio.addPersona(new Persona(
                "Cesar",
                "Gómez",
                'M',
                (byte)20));
        //Elemento 02
        directorio.addPersona(new Persona(
                "Rocio",
                "Ballinas",
                'f',
                (byte)20));
        //Elemento 03
        directorio.addPersona(new Persona(
                "Darío",
                "Gutiérrez",
                'm',
                (byte)20));

        System.out.println("Promedio: " + directorio.calcularPromedioEdad());
        System.out.println("Total Masculino: "+ directorio.contarGeneroMasculino());
        System.out.println("Total Femenino: "+ directorio.contarGeneroFemenino());
    }
}
