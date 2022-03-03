public class Ese {
    String name;
    int power;


    public Ese(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public void dealDamage(){
        System.out.println(name + " rünnaku tugevus on " + this.power);
    }
}
