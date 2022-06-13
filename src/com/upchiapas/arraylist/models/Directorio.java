package com.upchiapas.arraylist.models;

import java.util.ArrayList;

public class Directorio {
    private ArrayList<Persona> directorio = new ArrayList<>();
    public boolean addPersona(Persona persona) {
        boolean estado;

        if (directorio.add(persona))
            estado = true;
        else
            estado = false;
        return estado;
    }
    public byte calcularPromedioEdad(){
        byte total = 0;
        byte promedio = 0;
        for (int i=0;i<directorio.size();i++){
            //Método 1
            Persona persona = directorio.get(i);
            total += persona.getEdad();
        }
        promedio = (byte)(total / directorio.size());

        return promedio;
    }
    public byte contarGeneroMasculino() {
        byte total = 0;
        for (int i=0;i<directorio.size();i++){
            Persona persona = directorio.get(i);
            if (Character.toLowerCase(persona.getGenero()) == 'm')
                total++;
        }
        return total;
    }
    public byte contarGeneroFemenino() {
        byte total = 0;
        for (int i=0;i<directorio.size();i++){
            Persona persona = directorio.get(i);
            if (Character.toLowerCase(persona.getGenero()) == 'f')
                total++;
        }
        return total;
    }
}
