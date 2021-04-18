package Consumibles;

public class Cultivo extends Vegetal{

    private int hambre_aSaciar;

    public Cultivo(){
        super();
    }

    /**--GET&SET--*/
    public int getHambre_aSaciar() {
        return hambre_aSaciar;
    }

    public void setHambre_aSaciar(int hambre_aSaciar) {
        this.hambre_aSaciar = hambre_aSaciar;
    }
}
