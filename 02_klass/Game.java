import java.util.Scanner;

//Parem klõps refactor ja rename
public class Game{
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

        Player mangija1 = new Player(worldHeight, worldWidth);
        Player mangija2 = new Player(worldHeight, worldWidth);


        //uue instansi loomaine --- Uus mälukoht.
        //Kõik klassis defineeritud omadused.
        Enemy vaenlane1 = new Enemy(worldHeight, worldWidth);




        printMap(worldHeight, worldWidth, mangija1.playerCoordinateY, mangija1.playerCoordinateX, vaenlane1.enemyCoordinateY, vaenlane1.enemyCoordinateX);

        //klasside tegemine tund nr 2
        //Import Alt+enter
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();


        while (!input.equals("end")) {

            mangija1.movePlayer(input,worldHeight,worldWidth);

            printMap(worldHeight, worldWidth, mangija1.playerCoordinateY, mangija1.playerCoordinateX, vaenlane1.enemyCoordinateY, vaenlane1.enemyCoordinateX);
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
