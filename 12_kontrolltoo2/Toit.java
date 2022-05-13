import java.util.ArrayList;

public class Toit {
    String nimetus;
    ArrayList<Toidukomponent> toidukomponentList = new ArrayList<>();

    public Toit(String nimetus) {
        this.nimetus = nimetus;
    }

    public void lisaToidukomponent(Toidukomponent toidukomponent){
        toidukomponentList.add(toidukomponent);
    }

    public String toiduInfo(){
        int koguRasv = 0;
        int koguSysivesik = 0;
        int koguValk = 0;
        for (int i = 0; i < toidukomponentList.size(); i++) {
            koguRasv += toidukomponentList.get(i).rasvakogus();
            koguSysivesik += toidukomponentList.get(i).sysivesikukogus();
            koguValk += toidukomponentList.get(i).valgukogus();
        }
        return "Valgud: " + koguValk + " Rasvad: " + koguRasv + " Süsivesikud: " + koguSysivesik;
    }
}
