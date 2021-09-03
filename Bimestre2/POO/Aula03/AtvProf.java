package Aula03;

import java.util.Scanner;

public class AtvProf {

    public static int quantosPacotes(float quant, Scanner entrada){

        float kilo = 0.0f;
        int cont = 0;

        while(kilo < quant){
            System.out.println("digite o peso do pacote: ");
            String entradaAux = entrada.nextLine();
            float aux = Float.parseFloat(entradaAux);

            kilo = kilo + aux;
            cont = cont + 1 ;

        }

        return cont;
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o nome do cachorrinho: ");
        String nome = entrada.nextLine();

        System.out.println("Digite a quantidade de ração: ");
        String quantAux = entrada.nextLine();
        float quant = Float.parseFloat(quantAux); // convertendo String para Float

        System.out.println( nome + " precisa de " + quantosPacotes(quant, entrada) + " pacotes de ração");

    }

}
