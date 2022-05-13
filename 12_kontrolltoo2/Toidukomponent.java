public class Toidukomponent {
    int kogus;
    int rasvaKogus;
    int valguKogus;
    int sysivesikuKogus;
    Toiduaine toiduaine;

    public Toidukomponent(int kogus, Toiduaine toiduaine) {
        this.kogus = kogus;
        this.toiduaine = toiduaine;
    }

    public int rasvakogus(){
        return this.kogus * this.toiduaine.rasv / 100;
    }

    public int valgukogus(){
        return this.kogus * this.toiduaine.valk / 100;
    }

    public int sysivesikukogus(){
        return this.kogus * this.toiduaine.sysivesik / 100;
    }
}
