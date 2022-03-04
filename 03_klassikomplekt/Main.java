public class Main {
    public static void main(String[] args) {
        //Arvuti arvuti = new Arvuti(new Info("abg", "Add", "ggg", 16, 500), 1999);
       // System.out.println(arvuti.getInfo());

        Relv relv = new Relv("Mõõk", 20);

        Mangija mangija = new Mangija("Kalev", 100, relv);
        Mangija mangija2 = new Mangija("Munev", 500, new Relv("Nuga", 200), relv);

        Vaenlane vaenlane = new Vaenlane("Koll", 1000, new Relv("Kepp", 10));



        mangija.playerWeapon();
        mangija.relv.dealDamage(vaenlane);

        System.out.println();

        mangija2.playerWeapon();
        mangija2.relv.dealDamage(vaenlane);
        mangija2.relv2.dealDamage(vaenlane);
    }

}
