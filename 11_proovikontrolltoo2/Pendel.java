public class Pendel {

    double pikkus;
    Hammasratas hammasratas;
    Hammasratas hammasratas2;
    Hammasratas hammasratas3;
    public Hammasratas getHammasratas() {
        return hammasratas;
    }

    public Pendel(double _pikkus, Hammasratas hammasratas, Hammasratas hammasratas2, Hammasratas hammasratas3){
        this.pikkus = _pikkus;
        this.hammasratas = hammasratas;
        this.hammasratas2 = hammasratas2;
        this.hammasratas3 = hammasratas3;
    }

    public double getPikkus() {
        return pikkus;
    }

    public double vonkeperiood() {
        return 2*Math.PI * Math.sqrt(getPikkus()/9.8);
    }
}
