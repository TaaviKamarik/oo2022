package Kodutoo;

public class Main {
    public static void main(String[] args) {
        Enemy1 vastane1 = new Enemy1();
        Enemy2 vastane2 = new Enemy2();

        System.out.println(vastane1.attack());
        System.out.println(vastane2.attack());
        System.out.println(vastane1.die());
        System.out.println(vastane2.die());
    }
}
