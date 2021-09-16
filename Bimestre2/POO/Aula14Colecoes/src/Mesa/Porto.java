package Aula14Colecoes.Mesa;

import java.util.ArrayList;

public class Porto {
    private String nome;
    private ArrayList<Container> containerList = new ArrayList<>();

    public Porto(String nome) {
        this.nome = nome;
    }

    public ArrayList<Container> getContainerList() {
        return containerList;
    }

    public void addContainer(Container container) {
        this.containerList.add(container);
    }

    public void imprimirContainerOrdem(){
        containerList.sort((a,b) -> (a.compareTo(b)));
        for (Container container: containerList) {
            System.out.println(container);
        }

    }

    public void imprimirPerigososDesconhecidos(){
        for (Container container: containerList) {
            if(container.getPaisOrigem().equals("Desconhecido") && container.isPerigoso()){
                System.out.println(container);
            }

        }

    }
}
