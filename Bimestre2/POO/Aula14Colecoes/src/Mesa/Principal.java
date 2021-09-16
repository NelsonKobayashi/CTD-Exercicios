package Aula14Colecoes.Mesa;



public class Principal {

    public static void main(String[] args) {

        Container container1 = new Container(1,"Brasil",true);
        Container container2 = new Container(2,"Argentina",true);
        Container container3 = new Container(3,"Chile",false);
        Container container4 = new Container(4,"Desconhecido",true);
        Container container5 = new Container(5,"Desconhecido",false);

        Porto santos = new Porto("santos");
        santos.addContainer(container1);
        santos.addContainer(container2);
        santos.addContainer(container3);
        santos.addContainer(container4);
        santos.addContainer(container5);
    //  santos.imprimirContainerOrdem();
        santos.imprimirPerigososDesconhecidos();
    }

}
