package Aula06.Exercicio;

public class AdotarCachorro {

    public static void main(String[] args) {
        Adocao cachorro = new Adocao("Laika", "pug", 1, 6, "femea", true, false);
        System.out.println(cachorro.getNome());
        cachorro.disponivelAdocao();
        Adocao cachorro2 = new Adocao("Ted", "caramelo", 2, 6, "macho", false, false);
        System.out.println(cachorro2.getNome());
        cachorro2.disponivelAdocao();
    }
}
