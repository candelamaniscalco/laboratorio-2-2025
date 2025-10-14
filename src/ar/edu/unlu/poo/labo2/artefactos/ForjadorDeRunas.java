package ar.edu.unlu.poo.labo2.artefactos;

public class ForjadorDeRunas implements  EstrategiaDeMejora {

    public ForjadorDeRunas(){

    }

    @Override
    public void mejorar(Artefacto artefacto) {
        if(artefacto.getTipo().equals("Varita")){
            artefacto.setPoder(artefacto.getPoder() + 15);
        }
    }
}