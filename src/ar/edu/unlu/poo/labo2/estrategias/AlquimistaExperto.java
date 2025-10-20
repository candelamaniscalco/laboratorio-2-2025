package ar.edu.unlu.poo.labo2.estrategias;

import ar.edu.unlu.poo.labo2.artefactos.Artefacto;
import ar.edu.unlu.poo.labo2.artefactos.ModoComparacion;

public class AlquimistaExperto implements EstrategiaDeMejora {


    @Override
    public void mejorar(Artefacto artefacto) {
        artefacto.setModoComparacion(ModoComparacion.POR_TIPO);
        if(artefacto.getTipo().equals("Pocion")){
            if(artefacto.getPoder() > 80){
                artefacto.setPoder(100);
            }else artefacto.setPoder(artefacto.getPoder() + 20);
        }
    }
}
