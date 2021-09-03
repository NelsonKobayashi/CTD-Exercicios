package Aula10Mesa;

public class Nave extends Objeto{
    private double velocidade;
    private int vida;

    public Nave(int posx, int posy, char direcao, double velocidade){
        super(posx, posy, direcao);
        this.velocidade = velocidade;

    }
    public void irPara(int posx, int posy, char direcao){
        System.out.println("A nave foi para: "+ posx + posy + direcao);
//        if(girar() == (direcao))
//            return direcao;
//        else
//            return girar();
    }
    public char girar(){
        return super.getDirecao();
    }

}
