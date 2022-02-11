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
                System.out.print(symbol);
            }
            System.out.println();
        }
    }
}
