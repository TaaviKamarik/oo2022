public class Toiduaine {
    String nimetus;
    int rasv;
    int valk;
    int sysivesik;

    public Toiduaine(String nimetus, int rasv, int valk, int sysivesik) {

        if(rasv + valk + sysivesik > 100){
            System.out.println("Palun sisesta õiged väärtused.");
        }else{
            this.nimetus = nimetus;
            this.rasv = rasv;
            this.valk = valk;
            this.sysivesik = sysivesik;
        }

    }
}
