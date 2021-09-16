package Aula16ExcecoesClientes.src;

import Aula16ExcecoesClientes.src.Cliente;
import Aula16ExcecoesClientes.src.ClientesException;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Rodrigo", "Brasil", "33333333333",100);
        try{
            cliente.comprar(110);
        } catch (ClientesException e) {
            System.err.println(e.toString());
        }
    }
}
