public class Ese {
    String name;
    int power;


    public Ese(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public void dealDamage(){
        System.out.println("Rünnaku tugevus on " + this.power);
    }
}
