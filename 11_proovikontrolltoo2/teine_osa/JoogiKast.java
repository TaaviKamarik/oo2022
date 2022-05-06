package teine_osa;

public class JoogiKast {
    String kastiTyyp;
    double kastiHind;
    double kastiMass;
    int pesadeArv;
    Joogipudel joogipudel;

    public JoogiKast(String kastiTyyp, double kastiHind, double kastiMass, int pesadeArv) {
        this.kastiTyyp = kastiTyyp;
        this.kastiHind = kastiHind;
        this.kastiMass = kastiMass;
        this.pesadeArv = pesadeArv;
    }

    public  double getMass(int jookideArv){
        if(jookideArv > pesadeArv){
            jookideArv = pesadeArv;
            System.out.println("Jookide arv oli suurem kui pesade arv, " +
                    "võtan kasutusele " + pesadeArv + " jooki.");
        }
        if(joogipudel == null){
            return kastiMass;
        }else{
            return kastiMass + (joogipudel.mass + joogipudel.jook.erikaal) *joogipudel.maht * jookideArv;
        }
    }

    public double getHind(int jookideArv){
        if(jookideArv > pesadeArv){
            jookideArv = pesadeArv;
            System.out.println("Jookide arv oli suurem kui pesade arv, " +
                    "võtan kasutusele " + pesadeArv + " jooki.");
        }
        if(joogipudel == null){
            return kastiHind;
        }else{
            return kastiHind + (joogipudel.taaraMaksumus + joogipudel.jook.erikaal * joogipudel.jook.omahind) * joogipudel.maht * jookideArv;
        }
    }

    public int villiKastiPudelid(Joogivaat joogivaat){
        int loendur = 0;
        while(joogivaat.liitritesJooki >= joogipudel.maht){
            joogivaat.liitritesJooki -= joogipudel.maht;
            loendur++;
            if(loendur == pesadeArv){
                System.out.println("Lõpetasin villimise, kuna sai täis.");
                break;
            }
        }
        System.out.println("Villisid " + loendur);
        return loendur;
    }
}
