package ar.edu.unlu.poo.labo2.artefactos;

import ar.edu.unlu.poo.labo2.estrategias.EstrategiaDeMejora;

import java.util.*;

public class CatalogoArtefactos{
    //COLECCION QUE EVITA DUPLICADOS
    Set<Artefacto> inventario = new HashSet<>();
    private EstrategiaDeMejora estrategia;
    //private ValidadorDeArtefactos miValidador;

    //METODOS

    public CatalogoArtefactos(EstrategiaDeMejora estrategia){
        this.estrategia = estrategia;


    }

    public void agregarArtefacto(Artefacto artefacto) {
        inventario.add(artefacto);
        //System.out.printf("Artefacto: %s agregado al inventario con éxito.\n", artefacto.getNombre().toUpperCase(Locale.ROOT));
    }

    public Set obtenerArtefactosUnicos() {
        return inventario;
    }

    public List<Artefacto> buscarArtefactosPorTipo(String tipo) {
        //Devuelve una lista de artefactos que coincidan con el tipo especificado.
        //La lista debe estar ordenada de mayor a menor poder.
        List<Artefacto> artefactosCoincidentes = new ArrayList<>();
        for (Artefacto artefacto : inventario) {
            String tipoBuscado = artefacto.getTipo();
            if (tipoBuscado.equals(tipo)) {
                artefactosCoincidentes.add(artefacto);
            }
        }

        Collections.sort(artefactosCoincidentes, new Comparator<Artefacto>() {
            @Override
            public int compare(Artefacto a1, Artefacto a2) {
                return Integer.compare(a2.getPoder(), a1.getPoder());
                //escribo primero el segundo elemento pq de esta manera ordena del mayor a menor, si fuera al reves ordena de menor a mayor
            }
        });
        return artefactosCoincidentes;
    }

    public Map<String, Integer> contarArtefactosPorTipo() {
        Map<String, Integer> cantArtefactosPorTipo = new HashMap<>();

        for (Artefacto artefacto : inventario) {
            String tipo = artefacto.getTipo();
            //int conteoActual = cantArtefactosPorTipo.get(tipo); //en la primer vuelta almacena null
            //cantArtefactosPorTipo.put(tipo, conteoActual + 1);
            cantArtefactosPorTipo.put(tipo, (cantArtefactosPorTipo.getOrDefault(tipo, 0)) + 1);
            //getOrDefault(tipo, defaultValue) va a devolver el valor actual si es que existe o 0 si todavia no estaba en el Map.
        }
        return cantArtefactosPorTipo;
    }

    public Artefacto obtenerArtefactoMasPoderoso() {
        if (inventario.isEmpty()) {
            return null;
        }
        Artefacto mayorAux = null;
        for (Artefacto artefacto : inventario) {
            if (mayorAux == null || (artefacto.getPoder() > mayorAux.getPoder())) {
                mayorAux = artefacto;
            }
        }
        return mayorAux;
    }

    public void aplicarMejoras() {
        for (Artefacto artefacto : inventario) {
            this.estrategia.mejorar(artefacto);
        }
    }


}