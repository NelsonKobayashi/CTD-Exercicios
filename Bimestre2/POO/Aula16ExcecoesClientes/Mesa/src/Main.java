package Aula16ExcecoesClientes.Mesa.src;

import java.time.LocalDate;


public class Main {

    public static void main(String[] args) {
	    try{
            Paciente paciente=new Paciente("Juan","Perez","12345",new LocalDate(2021,10,05));
            System.out.println(paciente);
            try{
                paciente.darAlta(new LocalDate(121,06,10));
            } catch (ExcecoesPacientes e) {
                System.err.println(e);
            }
        } catch (ExcecoesPacientes e) {

            System.err.println(e.toString());
        }
	    try{
	        LocalDate dataAlta = paciente.dataAlta;

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
