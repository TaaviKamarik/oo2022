package Kodutoo;

public abstract class EnemyClass {
    String name;
    int health;
    int attack;

    public EnemyClass(int health, int attack, String name) {
        this.health = health;
        this.attack = attack;
        this.name = name;
    }


    public int attack(){
        return this.attack;
    }

    public void takeDamage(){
        this.health -= 20;
    }

    public String die(){
        return this.name + " died.";
    }


}