public class Main {
    public static void main(String[] args) {
        //Arvuti arvuti = new Arvuti(new Info("abg", "Add", "ggg", 16, 500), 1999);
       // System.out.println(arvuti.getInfo());

        Ese relv = new Ese("Mõõk", 20);
        Mangija mangija = new Mangija("Kalev", 100, relv);

        Mangija mangija2 = new Mangija("Munev", 500, new Ese("Nuga", 200), relv);

        mangija.playerWeapon();
        mangija.relv.dealDamage();

        System.out.println();

        mangija2.playerWeapon();
        mangija2.relv.dealDamage();
        mangija2.relv2.dealDamage();
    }

}
