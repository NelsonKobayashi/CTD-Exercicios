package Aula16ExcecoesClientes.Mesa.src;

import java.time.LocalDate;


public class Paciente {
    String nome;
    String sobrenome;
    String historiaClinica;
    LocalDate dataInternacao;
    LocalDate dataAlta;


    Paciente(String nome, String sobrenome, String historiaClinica, LocalDate dataInternacao) throws ExcecoesPacientes
    {   LocalDate hoje= new LocalDate();
        this.nome=nome;
        this.sobrenome=sobrenome;
        dataAlta=null;
        if (dataInternacao.before(hoje))
            this.dataInternacao=dataInternacao;
        else
            throw new ExcecoesPacientes("Data inválida, seu imbecil!");
    }

    public LocalDate getDataInternacao() {
        return dataInternacao;
    }

    public LocalDate getDataAlta() {
        return dataAlta;
    }

    public void darAlta(LocalDate dataAlta) throws ExcecoesPacientes
    {
        if (dataAlta.after(dataInternacao))
            System.out.println("Ok, você teve alta");
        else
            throw new ExcecoesPacientes("A data de alta deve estar errada, pois você foi internado no dia " + dataInternacao);
    }
}
