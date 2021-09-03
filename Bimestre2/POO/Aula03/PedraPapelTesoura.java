package Aula03;

import java.util.Scanner;

public class PedraPapelTesoura {

    public static void whichWin(String jogador1, int contJogador1, String jogador2, int contJogador2) {
        String valorEscolhido1 = "lalala";
        while (valorEscolhido1 != "*") {
            Scanner entrada = new Scanner(System.in);
            System.out.println(jogador1 + " escolha uma opção: ");
            valorEscolhido1 = entrada.nextLine();
            System.out.println(jogador2 + " escolha uma opção: ");
            String valorEscolhido2 = entrada.nextLine();
            valorEscolhido1 = valorEscolhido1.toLowerCase();
            valorEscolhido2 = valorEscolhido2.toLowerCase();

            if (valorEscolhido1.equals("*")) {
                System.out.println("Fim do Jogo");
                System.out.println("Placar Final: " + jogador1 + ": " + contJogador1 + " " + jogador2 + ": " + contJogador2);
                break;
            }

            String resultado = (valorEscolhido1.equals("pedra") && valorEscolhido2.equals("tesoura")) ? "1" :
                               (valorEscolhido1.equals("papel") && valorEscolhido2.equals("pedra")) ? "1" :
                               (valorEscolhido1.equals("tesoura") && valorEscolhido2.equals("papel")) ? "1" : "2";

            if (valorEscolhido1.equals(valorEscolhido2)) {
                resultado = "0";
            }

            if (resultado.equals("1")){
                System.out.println("Ponto do " + jogador1);
                contJogador1++;
                System.out.println("Placar: " + jogador1 + ": " + contJogador1 + " " + jogador2 + ": " + contJogador2);
            } else if (resultado.equals("2")) {
                System.out.println("Ponto do " + jogador2);
                contJogador2++;
                System.out.println("Placar: " + jogador1 + ": " + contJogador1 + " " + jogador2 + ": " + contJogador2);
            } else {
                System.out.println("Empate");
                System.out.println("Placar: " + jogador1 + ": " + contJogador1 + " " + jogador2 + ": " + contJogador2);
            }
        }
    }

    public static void main(String[] args) {
        int contJogador1 = 0;
        int contJogador2 = 0;

        System.out.println("Vamos jogar Jokempo?");
        System.out.println("""
                Escolha uma opção:
                pedra
                papel
                tesoura
                
                caso queira terminar, digite *.
                """);
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o nome do jogador 1: ");
        String jogador1 = entrada.nextLine();
        System.out.println("Digite o nome do jogador 2: ");
        String jogador2 = entrada.nextLine();

        whichWin(jogador1, contJogador1, jogador2, contJogador2);
    }
}