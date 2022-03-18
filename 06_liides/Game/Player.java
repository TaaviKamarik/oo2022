package Game;

public class  Player extends Character implements WorldObject{


    Direction direction;
    Item item;


    //Constructor
    public Player(int worldHeight, int worldWidth){
        super(worldHeight, worldWidth);
        this.direction = Direction.UP;
    }

    public void addItem(Item item){
        this.item = item;
        System.out.println("Mängija sai eseme " + item.itemType);
    }



    public void movePlayer(String input, int worldHeight, int worldWidth){
        //kontrollib ühte muutujat mingite väärtuste vastu
        switch (input){
            case "a":
                direction = Direction.LEFT;
                break;
            case "s":
                direction = Direction.DOWN;;
                break;
            case "d":
                direction = Direction.RIGHT;;
                break;
            case "w":
                direction = Direction.UP;;
                break;
        }
        switch (direction){
            case LEFT:
                if (coordinateX > 1){
                    coordinateX--;
                }
                break;
            case DOWN:
                if (coordinateY < worldHeight -2){
                    coordinateY++;
                }
                break;
            case RIGHT:
                if (coordinateX < worldWidth-2){
                    coordinateX++;
                }
                break;
            case UP:
                if (coordinateY > 1){
                    coordinateY--;
                }
                break;
        }
    }

}


//Tellimus - id, tooted, kasutaja
//Kasutaja - frontendis registreerumise järgselt
//Üks toode
//kategooriad