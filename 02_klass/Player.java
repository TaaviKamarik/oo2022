public class Player {

    int playerCoordinateY;
    int playerCoordinateX;
    Direction direction;


    //Constructor
    public Player(int worldHeight, int worldWidth){
        this.playerCoordinateY = generateRandomCoordinate(worldHeight);
        this.playerCoordinateX = generateRandomCoordinate(worldWidth);
        this.direction = Direction.UP;
    }

    public int generateRandomCoordinate(int worldSize){
        return (int) (Math.random()*(worldSize-2))+1;
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
                if (playerCoordinateX > 1){
                    playerCoordinateX--;
                }
                break;
            case DOWN:
                if (playerCoordinateY < worldHeight -2){
                    playerCoordinateY++;
                }
                break;
            case RIGHT:
                if (playerCoordinateX < worldWidth-2){
                    playerCoordinateX++;
                }
                break;
            case UP:
                if (playerCoordinateY > 1){
                    playerCoordinateY--;
                }
                break;
        }
    }

}


//Tellimus - id, tooted, kasutaja
//Kasutaja - frontendis registreerumise järgselt
//Üks toode
//kategooriad