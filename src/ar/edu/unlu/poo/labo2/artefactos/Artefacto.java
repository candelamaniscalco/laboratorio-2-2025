package ar.edu.unlu.poo.labo2.artefactos;
import java.util.Objects;

public  class Artefacto {
    private String nombre;
    private int poder; //VALIDAR QUE ESTE ENTRE 1 Y 100
    private String tipo; //POCION-PERGAMINO-AMULETO-VARITA

    private ModoComparacion modoComparacion;


    public Artefacto(String nombre, int poder, String tipo) {
        this.nombre = nombre;
        this.poder = poder;
        this.tipo = tipo;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPoder() {
        return poder;
    }

    public String getTipo() {
        return tipo;
    }


    public void setModoComparacion(ModoComparacion nuevoModo){
        this.modoComparacion = nuevoModo;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Artefacto artefacto = (Artefacto) o;

        return switch (modoComparacion) {
            case POR_NOMBRE -> Objects.equals(nombre, artefacto.nombre);
            case POR_TIPO -> Objects.equals(tipo, artefacto.tipo);
            default -> false;
        };
    }

    @Override
    public int hashCode() {
        return switch(modoComparacion){
            case POR_NOMBRE -> Objects.hash(nombre);
            case POR_TIPO -> Objects.hash(tipo);
        };
    }



}