package ar.edu.unlu.poo.labo2.estrategias;

import ar.edu.unlu.poo.labo2.artefactos.Artefacto;
import ar.edu.unlu.poo.labo2.artefactos.ModoComparacion;

import java.util.Objects;

public class ForjadorDeRunas implements EstrategiaDeMejora {

    public ForjadorDeRunas(){

    }





    @Override
    public void mejorar(Artefacto artefacto) {
        artefacto.setModoComparacion(ModoComparacion.POR_TIPO); //verificar si esta linea funciona
        if(artefacto.getTipo().equals("Varita")){
            artefacto.setPoder(artefacto.getPoder() + 15);
        }
    }
}