public class Restaurant {

    public String numeRestaurant;
    private static double totalPlata;
    public static String cosCumparaturi;

    public Restaurant(String numeRestaurant){
        this.numeRestaurant = numeRestaurant;
    }

    public void setTotalPlata(double pret) {
        totalPlata += pret;
    }

    public double getTotalPlata(){
        return totalPlata;
    }

    public static void cosCumparaturi(String produs){
        cosCumparaturi += produs;
    }

    public static void stergereCosCumparaturi(){
        cosCumparaturi = "";
        totalPlata = 0;
    }
}
