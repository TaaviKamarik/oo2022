public class Human {
    String nimi;
    int vanus;
    double pikkus;
    boolean mees;

    public Human(String nimi, int vanus, double pikkus, boolean mees) {
        this.nimi = nimi;
        this.vanus = vanus;
        this.pikkus = pikkus;
        this.mees = mees;
    }

    public void sayHello(){
        System.out.println("Tere");
    }
    //to ---> toString()
    @Override
    public String toString() {
        return "human{" +
                "nimi='" + nimi + '\'' +
                ", vanus=" + vanus +
                ", pikkus=" + pikkus +
                ", mees=" + mees +
                '}';
    }
}
