import java.util.Scanner;

public class Main {




    public static void main(String[] args) {
        ToiduainedList toiduainedList = new ToiduainedList();
        Scanner scanner = new Scanner(System.in);
        //Toiduaine toiduaine = new Toiduaine("Kartul", 0, 30, 60);
        //Toidukomponent toidukomponent = new Toidukomponent(50, toiduaine);


        while(true){
            System.out.println("Vali oma tegevus.");
            System.out.println("1 Lisa toiduaine.");
            System.out.println("2 Lisa toiduainete kogused");
            System.out.println("3 Otsi toidiainet nime järgi");
            System.out.println("4 Otsi toiduainet rasvavahemiku järgi.");



            int valik = scanner.nextInt();
            scanner.nextLine();

            switch (valik){
                case 1: toiduaineLisamine(scanner, toiduainedList);


            }
        }





    }

    public static void toiduaineLisamine(Scanner scanner, ToiduainedList toiduainedList){
        System.out.println("lisa nimetus");
        String nimetus = scanner.nextLine();
        System.out.println("lisa rasvad");
        int rasvad = scanner.nextInt();
        scanner.nextLine();
        System.out.println("lisa valgud");
        int valgud = scanner.nextInt();
        scanner.nextLine();
        System.out.println("lisa süsivesikud");
        int sysivesikud = scanner.nextInt();
        scanner.nextLine();
        Toiduaine toiduaine = new Toiduaine(nimetus, rasvad, valgud, sysivesikud);
        toiduainedList.lisaToiduaine(toiduaine);


    }

}


