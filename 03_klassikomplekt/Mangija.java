public class Mangija {
    String name;
    int elud;
    Ese relv;
    Ese relv2;

    public Mangija(String name, int elud, Ese relv) {
        this.name = name;
        this.elud = elud;
        this.relv = relv;
    }

    public Mangija(String name, int elud, Ese relv, Ese relv2) {
        this.name = name;
        this.elud = elud;
        this.relv = relv;
        this.relv2 = relv2;
    }

    public void playerWeapon(){
        System.out.print(name + " on relvaga " + relv.name);
        if (relv2 != null){
            System.out.print(" ja " + relv2.name);
        }
        System.out.println();
    }
}
