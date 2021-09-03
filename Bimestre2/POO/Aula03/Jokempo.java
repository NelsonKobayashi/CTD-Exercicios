package Aula03;

import java.util.Scanner;

public class Jokempo {
    public static void main(String[] args) {

        int contJogador1 = 0;
        int contJogador2 = 0;
        String resultado;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Vamos jogar Jokempo?");
        System.out.println("""
                Escolha uma opção:
                pedra
                papel
                tesoura
                """);

        System.out.println("Digite o nome do jogador 1: ");
        String jogador1 = entrada.nextLine();
        System.out.println("Digite o nome do jogador 2: ");
        String jogador2 = entrada.nextLine();

        while (contJogador1 < 3 && contJogador2 < 3) {
            System.out.println(jogador1 + " escolha uma opção: ");
            String valorEscolhido1 = entrada.nextLine();
            System.out.println(jogador2 + " escolha uma opção: ");
            String valorEscolhido2 = entrada.nextLine();
            valorEscolhido1 = valorEscolhido1.toLowerCase();
            valorEscolhido2 = valorEscolhido2.toLowerCase();

            if (valorEscolhido1.equals(valorEscolhido2)) {
                System.out.println("Empate");
                continue;
            }

            resultado = (valorEscolhido1.equals("pedra") && valorEscolhido2.equals("tesoura")) ? ++contJogador1 + " ponto para o " + jogador1 :
                    (valorEscolhido1.equals("papel") && valorEscolhido2.equals("pedra")) ? ++contJogador1 + " ponto para o " + jogador1 :
                    (valorEscolhido1.equals("tesoura") && valorEscolhido2.equals("papel")) ? ++contJogador1 + " ponto para o " + jogador1 : ++contJogador2 + " ponto para o " + jogador2;
            System.out.println(resultado);
            System.out.println("Placar: " + jogador1 + ": " + contJogador1 + " " + jogador2 + ": " + contJogador2);
        }

        if (contJogador1 == 3) {
            System.out.println(jogador1 + " você ganhou!");
        } else {
            System.out.println(jogador1 + " você ganhou!");
        }
    }
}