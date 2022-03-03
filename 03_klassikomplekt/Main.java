public class Main {
    public static void main(String[] args) {
        //Arvuti arvuti = new Arvuti(new Info("abg", "Add", "ggg", 16, 500), 1999);
       // System.out.println(arvuti.getInfo());

        Ese relv = new Ese("Mõõk", 20);
        Mangija mangija = new Mangija("Kalev", 100, relv);
        Mangija mangija2 = new Mangija("Sulev", 200, new Ese("Kirves", 50));

        mangija.relv.dealDamage();
        mangija2.relv.dealDamage();
    }

}
