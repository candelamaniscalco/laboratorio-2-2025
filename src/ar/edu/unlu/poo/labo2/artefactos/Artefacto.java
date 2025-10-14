package ar.edu.unlu.poo.labo2.artefactos;
import java.util.Objects;

public  class Artefacto {
    private String nombre;
    private int poder; //VALIDAR QUE ESTE ENTRE 1 Y 100
    private String tipo; //POCION-PERGAMINO-AMULETO-VARITA

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Artefacto artefacto = (Artefacto) o;
        return Objects.equals(nombre, artefacto.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    public Object getNivelDePoder() {
        return null;
    }
}