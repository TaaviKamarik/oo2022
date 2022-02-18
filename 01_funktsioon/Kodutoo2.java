import java.util.Scanner;

public class Kodutoo2 {
    public static void main(String[] args) {
        int lugeja = 0;

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        vastus(input, lugeja);


    }

    public static void vastus(int input, int lugeja){
        for (int i = 2; i < input; i++) {
            if(input % i == 0){
                lugeja++;
                System.out.println("Kordarv");
                break;
            }
        }

        if(lugeja == 0){
            System.out.println("Algarv");
        }
    }
}
