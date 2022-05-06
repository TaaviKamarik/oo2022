package teine_osa;

public class Joogivaat {
    double ruumala;
    double liitritesJooki;

    public Joogivaat(double ruumala, double liitritesJooki) {
        this.ruumala = ruumala;
        this.liitritesJooki = liitritesJooki;
    }

    public boolean t2idaJoogipudel(Joogipudel joogipudel){
        if (liitritesJooki >= joogipudel.maht){
            System.out.println("Jooki mahub");
            return true;
        }else{
            System.out.println("Jooki ei mahu");
            return false;
        }
    }

    public int villiPudelid(Joogipudel joogipudel){
        int loendur = 0;
        while(liitritesJooki >= joogipudel.maht){
            //liitritesJooki = liitritesJooki-joogipudel.maht;
            liitritesJooki -= joogipudel.maht;
            loendur++;
        }
        System.out.println("Villisid " + loendur + " jooki.");
        return loendur;
    }
}
