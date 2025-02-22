import java.util.Scanner;

public class Game {
    //main
    public static void main(String[] args) {
        //sout
        System.out.println("Hello World");

        //String -- sõnaline
        //char -- üks täht
        //double -- 15 kohaline komakohaga
        //float --  7 kohaline komakohaga
        //int -- täiskohaline number 2.1mlj
        //byte -- 127 kohta
        //short -- 32000 kohta
        //long -- kõige suurem numbrikoht 9 223 372 036 854 775 807
        //boolean -- kahendväärtus true/false

        int worldHeight = 5;
        int worldWidth = 10;
        //Math.random() -- 0 ... 0.9999
        int playerCoordinateY = generateRandomCoordinate(worldHeight);
        int playerCoordinateX = generateRandomCoordinate(worldWidth);
        int enemyCoordinateY = generateRandomCoordinate(worldHeight);
        int enemyCoordinateX = generateRandomCoordinate(worldWidth);

        printMap(worldHeight, worldWidth, playerCoordinateY, playerCoordinateX, enemyCoordinateY, enemyCoordinateX);

        //klasside tegemine tund nr 2
        //Import Alt+enter
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();


        while (!input.equals("end")) {
            //kontrollib ühte muutujat mingite väärtuste vastu
            switch (input){
                case "a":
                    playerCoordinateX--;
                    break;
                case "s":
                    playerCoordinateY++;
                    break;
                case "d":
                    playerCoordinateX++;
                    break;
                case "w":
                    playerCoordinateY--;
                    break;
            }

            printMap(worldHeight, worldWidth, playerCoordinateY, playerCoordinateX, enemyCoordinateY, enemyCoordinateX);
            input = scanner.nextLine();
        }
    }//Main end

    //int -- sama tüüp mis peab olema funktsiooni sees return järgi.
    public static int generateRandomCoordinate(int worldSize){
        return (int) (Math.random()*(worldSize-2))+1;
    }

    public static void printMap(int worldHeight, int worldWidth, int playerCoordinateY, int playerCoordinateX, int enemyCoordinateY, int enemyCoordinateX){
        char symbol; //deklareerib 1 kord muutuja.

        //fori
        for (int y = 0; y < worldHeight; y++) {
            for (int x = 0; x < worldWidth; x++) {
                if (y == 0 || y == worldHeight-1){ //primitiiv || andmebaasipäring.
                    symbol = '-';

                }else if (x == 0 || x == worldWidth-1){
                    symbol = '|';

                }else {
                    symbol = ' ';

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
