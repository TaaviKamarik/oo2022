import java.util.Scanner;

//Parem klõps refactor ja rename
public class Game{
    //main
    public static void main(String[] args) {


        //String -- sõnaline
        //char -- üks täht
        //double -- 15 kohaline komakohaga
        //float --  7 kohaline komakohaga
        //int -- täiskohaline number 2.1mlj
        //byte -- 127 kohta
        //short -- 32000 kohta
        //long -- kõige suurem numbrikoht 9 223 372 036 854 775 807
        //boolean -- kahendväärtus true/false


        //Math.random() -- 0 ... 0.9999

        World world = new World(5, 10);

        Player mangija1 = new Player(world.worldHeight, world.worldWidth);
        Player mangija2 = new Player(world.worldHeight, world.worldWidth);


        //uue instansi loomaine --- Uus mälukoht.
        //Kõik klassis defineeritud omadused.
        Enemy vaenlane1 = new Enemy(world.worldHeight, world.worldWidth);




        world.printMap(mangija1.coordinateY, mangija1.coordinateX, vaenlane1.coordinateY, vaenlane1.coordinateX);

        //klasside tegemine tund nr 2
        //Import Alt+enter
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();


        while (!input.equals("end")) {

            mangija1.movePlayer(input,world.worldHeight,world.worldWidth);

            world.printMap(mangija1.coordinateY, mangija1.coordinateX, vaenlane1.coordinateY, vaenlane1.coordinateX);
            input = scanner.nextLine();
        }
    }//Main end



}
