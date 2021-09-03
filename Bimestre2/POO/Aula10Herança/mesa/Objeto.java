package Aula10Mesa;

public class Objeto{
    private int posx;
    private int posy;
    private char direcao;

    public Objeto(int posx, int posy, char direcao){
        this.posx = posx;
        this.posy = posy;
        this.direcao = direcao;
    }

    public char getDirecao(){
        return this.direcao;
    }

    public void irPara(int posx, int posy, char direcao) {
        this.posx = posx;
        this.posy = posy;
        this.direcao = direcao;
    }

}
