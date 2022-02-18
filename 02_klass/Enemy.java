public class Enemy {

    int enemyCoordinateY;
    int enemyCoordinateX;

    public Enemy(int worldHeight, int worldWidth){
        this.enemyCoordinateY = generateRandomCoordinate(worldHeight);
        this.enemyCoordinateX = generateRandomCoordinate(worldWidth);
    }

    public int generateRandomCoordinate(int worldSize){
        return (int) (Math.random()*(worldSize-2))+1;
    }
}
