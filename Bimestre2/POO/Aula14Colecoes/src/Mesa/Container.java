package Aula14Colecoes.Mesa;

public class Container implements Comparable<Container> {
    private int id;
    private String paisOrigem;
    private boolean perigoso;

    public Container(int id, String paisOrigem, boolean perigoso) {
        this.id = id;
        this.paisOrigem = paisOrigem;
        this.perigoso = perigoso;
    }


    @Override
    public int compareTo(Container container) {
        return id == container.id ? 0 : id < container.id ? -1 : 1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPaisOrigem() {
        return paisOrigem;
    }

    public void setPaisOrigem(String paisOrigem) {
        this.paisOrigem = paisOrigem;
    }

    public boolean isPerigoso() {
        return perigoso;
    }

    public void setPerigoso(boolean perigoso) {
        this.perigoso = perigoso;
    }

    @Override
    public String toString() {
        return id +" "+paisOrigem ;
    }
}
