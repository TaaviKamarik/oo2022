import java.util.ArrayList;

public class ToiduainedList {
    ArrayList<Toiduaine> toiduainedList = new ArrayList<>();

    public ToiduainedList() {

    }

    public String lisaToiduaine(Toiduaine toiduaine){
        toiduainedList.add(toiduaine);
        return "Toiduaine edukalt lisatud";
    }

    public String kustutaToiduaine(Toiduaine toiduaine){
        for (int i = 0; i < toiduainedList.size(); i++) {
            Toiduaine ajutine = toiduainedList.get(i);
            if(ajutine.nimetus == toiduaine.nimetus){
                toiduainedList.remove(i);
                return "Toiduaine kustutatud";
            }
        }
        return "";
    }

    public String vaataAndmeid(Toiduaine toiduaine) {
        for (int i = 0; i < toiduainedList.size(); i++) {
            Toiduaine ajutine = toiduainedList.get(i);
            if (ajutine.nimetus == toiduaine.nimetus) {
                return "Valgud: " + ajutine.valk + " Rasvad: " + ajutine.rasv + " Süsivesikud: " + ajutine.sysivesik;

            }
        }
        return "";
    }

    public String rasvaprotsentVahemik(int minRasv, int maxRasv){
        for (int i = 0; i < toiduainedList.size(); i++) {
            Toiduaine ajutine = toiduainedList.get(i);
            if (ajutine.rasv > minRasv && ajutine.rasv < maxRasv) {
                return "Nimetus: " + ajutine.nimetus +  + ajutine.valk + " Rasvad: " + ajutine.rasv + " Süsivesikud: " + ajutine.sysivesik + "\n";
            }
        }
        return "Ükski toit ei vasta otsitule.";
    }
}
