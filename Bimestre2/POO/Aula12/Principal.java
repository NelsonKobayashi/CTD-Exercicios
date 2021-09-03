package Aula12;

public class Principal {
    public static void main(String[] args) {
        Empresa dh = new Empresa("DH","123123123321321");
        Funcionario funcionario1 = new Gerente("Carlindo","Júnior","12354696548",10.000);
        Funcionario funcionario2 = new Vendedor("José Filho","Silva", "321654", 2000, 500);

        dh.cadastrar(funcionario1);
        dh.cadastrar(funcionario2);

        dh.listar();
    }
}
