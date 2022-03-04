public class Mangija {
    String name;
    int elud;
    Relv relv;
    Relv relv2;

    public Mangija(String name, int elud, Relv relv) {
        this.name = name;
        this.elud = elud;
        this.relv = relv;
    }

    public Mangija(String name, int elud, Relv relv, Relv relv2) {
        this.name = name;
        this.elud = elud;
        this.relv = relv;
        this.relv2 = relv2;
    }

    public void playerWeapon(){
        System.out.print(name);
        if (relv2 != null){
            System.out.println(" on relvadega " + relv.name + " ja " + relv2.name);
        }else{
            System.out.println(" on relvaga " + relv.name);
        }
    }
}
