package ar.edu.unlu.poo.labo2.estrategias;

import ar.edu.unlu.poo.labo2.artefactos.Artefacto;

public class JoyeroElfico implements EstrategiaDeMejora {

    public JoyeroElfico(){

    }

    @Override
    public void mejorar(Artefacto artefacto) {
        if(artefacto.getTipo().equals("Amuleto")){
            if ((artefacto.getPoder() < 50)) {
                artefacto.setPoder(artefacto.getPoder() * 2);
            } else {
                artefacto.setPoder((int) (artefacto.getPoder() * 1.25));
            }
        }
    }
}
