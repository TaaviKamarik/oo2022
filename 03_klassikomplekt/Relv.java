public class Relv {
    String name;
    int power;


    public Relv(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public void dealDamage(Vaenlane vaenlane){

        vaenlane.setElud(vaenlane.elud - power);
        System.out.println(name + " rünnaku tugevus on " + this.power);
        System.out.println("Vaenlase elud on " + vaenlane.elud);
    }


}
