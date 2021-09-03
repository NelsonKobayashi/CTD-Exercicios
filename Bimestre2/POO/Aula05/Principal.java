package Aula05;

public class Principal {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(2, "Nelson");
        System.out.println(cliente.getNome());
        System.out.println(cliente.getDivida());
        cliente.aumentarDivida( 500);
        System.out.println(cliente.getDivida());
        cliente.setNome("Luiz");
        System.out.println(cliente.getNome());
    }
}
