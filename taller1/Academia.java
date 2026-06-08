package com.taller1;

import java.util.Random;

public final class Academia {

    Random rd = new Random();

    private final String nombre;
    private final int capacidadMax;
    private final int inscritos;

    public Academia(String nombre, int inscritos) {

        this.nombre = nombre;

        this.capacidadMax = rd.nextInt(16) + 20;

        if (inscritos > capacidadMax) {
            System.out.println("exede el numero " + capacidadMax);
            this.inscritos = capacidadMax;
        } else {
            this.inscritos = inscritos;
        }

    }

    public String getNombre() {
        return nombre;
    }

    public int getCapacidadMaxima() {
        return capacidadMax;
    }

    public int getInscritos() {
        return inscritos;
    }

    @Override
    public String toString() {
        return "Curso: " + nombre
                + ", Inscritos: " + inscritos
                + ", Capacidad Máxima: " + capacidadMax;
    }
}