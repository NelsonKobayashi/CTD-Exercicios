package Aula06.Exercicio;

import java.time.LocalDate;

public class Adocao {

    private String nome;
    private String raca;
    private int nasc;
    private double peso;
    private String sexo;
    private boolean chip;
    private boolean ferido;

    public Adocao(String nome, String raca, int nasc, double peso, String sexo, boolean chip, boolean ferido) {
        this.nome = nome;
        this.raca = raca;
        this.nasc = nasc;
        this.peso = peso;
        this.sexo = sexo;
        this.chip = chip;
        this.ferido = ferido;
    }

    private boolean validarChip (){
        return chip ? true : false;
    }

    public void disponivelAdocao (){
        if (peso> 5 && ferido == false && validarChip())
            System.out.println("Disponível para adoção.");
        else
            System.out.println("Infelizmente ainda não está disponível.");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public int getNasc() {
        return nasc;
    }

    public void setNasc(int nasc) {
        this.nasc = nasc;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Boolean getChip() {
        return chip;
    }

    public void setChip(Boolean chip) {
        this.chip = chip;
    }

    public Boolean getFerido() {
        return ferido;
    }

    public void setFerido(Boolean ferido) {
        this.ferido = ferido;
    }
}
