package teine_osa;

public class Joogipudel {
    double maht;
    String pudelityyp;
    double mass;
    double taaraMaksumus;
    Jook jook;

    public Joogipudel(double maht, String pudelityyp, double mass, double taaraMaksumus) {
        this.maht = maht;
        this.pudelityyp = pudelityyp;
        this.mass = mass;
        this.taaraMaksumus = taaraMaksumus;
    }

    public  double getMass(){
        if(jook == null){
            return mass;
        }else{
            return mass + jook.erikaal;
        }
    }

    public double getKoguhind(){
        if(jook == null){
            return taaraMaksumus;
        }else{
            return taaraMaksumus + jook.erikaal * jook.omahind;
        }
    }
}
