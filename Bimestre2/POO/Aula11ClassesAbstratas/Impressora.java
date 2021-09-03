package Aula11ClassesAbstratas;

import java.time.LocalDate;

public abstract class Impressora {

    private String modelo;
    private String tipoConexao;
    private LocalDate dataFabricacao;
    private int folhasDesponiveis;
    private double porcTinta;
}
