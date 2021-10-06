public class Bauturi {

    public String numeBautura;
    public double pretBautura;
    private int inventarBautura;

    public Bauturi(String numeBautura, double pretBautura, int inventarBautura){
        this.numeBautura = numeBautura;
        this.pretBautura = pretBautura;
        this.inventarBautura = inventarBautura;
    }

    public int getInventarBautura(){
        return inventarBautura;
    }

    public void setInventarBautura(){
        inventarBautura --;
    }

    public boolean lipsaStocBautura(){
        if(getInventarBautura() < 1)
            return true;

        return false;
    }
}
