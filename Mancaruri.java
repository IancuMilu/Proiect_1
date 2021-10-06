public class Mancaruri {

    public String numeMancare;
    public double pretMancare;
    private int inventarMancare;

    public Mancaruri(String numeMancare, double pretMancare, int inventarMancare){
        this.numeMancare = numeMancare;
        this.pretMancare = pretMancare;
        this.inventarMancare = inventarMancare;
    }

    public int getInventarMancare(){
        return inventarMancare;
    }

    public void setInventarMancare(){
        inventarMancare--;
    }

    public boolean lipsaStocMancare(){
        if(getInventarMancare() < 1)
            return true;

        return false;
    }
}
