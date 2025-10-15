package ar.edu.unlu.poo.labo2.artefactos;

public class AlquimistaExperto implements EstrategiaDeMejora{


    @Override
    public void mejorar(Artefacto artefacto) {
        if(artefacto.getTipo().equals("Pocion")){
            if(artefacto.getPoder() > 80){
                artefacto.setPoder(100);
            }else artefacto.setPoder(artefacto.getPoder() + 20);
        }
    }
}
