package Game;

import java.util.List;

public class World {
    int height;
    int width;
    List<Item> items;

    public World(int worldHeight, int worldWidth){
        this.height = worldHeight;
        this.width = worldWidth;
    }

    public void printMap(int playerCoordinateY, int playerCoordinateX, int enemyCoordinateY, int enemyCoordinateX){
        char symbol; //deklareerib 1 kord muutuja.

        //fori
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                if (y == 0 || y == height -1){ //primitiiv || andmebaasipäring.
                    symbol = '-';

                }else if (x == 0 || x == width -1){
                    symbol = '|';

                }else {
                    symbol = ' ';

                }
                for (Item item : items) {
                    if (item.coordinateY == y && item.coordinateX == x) {
                        symbol = 'I';
                        break;
                    }
                }
                if (playerCoordinateY == y && playerCoordinateX == x){
                    symbol = 'x';
                }
                if (enemyCoordinateY == y && enemyCoordinateX == x){
                    symbol = 'z';
                }
                System.out.print(symbol);
            }
            System.out.println();
        }
    }
}
