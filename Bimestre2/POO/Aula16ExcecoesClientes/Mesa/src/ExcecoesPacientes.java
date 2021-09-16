package Aula16ExcecoesClientes.Mesa.src;

public class ExcecoesPacientes extends Exception{

    public ExcecoesPacientes() {
    }

    public ExcecoesPacientes(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "A seguinte excessão ocorreu: " + getClass().getName() + "Mensagem: " + getMessage();
    }
}
