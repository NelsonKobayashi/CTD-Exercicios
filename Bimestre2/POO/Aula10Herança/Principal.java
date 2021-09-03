package Aula10Herança;

public class Principal {
    public static void main(String[] args) {
        Associado associado = new Associado("123", "Nelson", 99, "Musculação");
        AssociadoHabilitado associadoHabilitado = new AssociadoHabilitado("356", "Yana", "Musculação", 99, 25);
        associadoHabilitado.setHabilitado(true);

        System.out.println(associadoHabilitado.custoMensal());
    }
}
