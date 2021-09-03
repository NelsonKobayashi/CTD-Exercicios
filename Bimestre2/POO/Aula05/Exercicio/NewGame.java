package Aula05.Exercicio;

import Aula05.Cliente;

public class NewGame {
    public static void main(String[] args) {
        UsuarioJogo jogador = new UsuarioJogo("Nelson", "Saitama");
        System.out.println(jogador.getNome());
        System.out.println(jogador.getNickname());
        jogador.aumentarPontuacao(50);
        System.out.println(jogador.getPontuacao());
        jogador.aumentarNivel();
        System.out.println(jogador.getNivel());
        jogador.somarBonus(37);
        System.out.println(jogador.getPontuacao());

    }
}
