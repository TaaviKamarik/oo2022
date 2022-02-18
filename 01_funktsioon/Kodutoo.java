import java.util.Scanner;

public class Kodutoo {

    public static void main(String[] args) {
        int vastus = (int)(Math.random()*10);
        int jargmineVastus = vastuseNumber(vastus);
        int punktid = 0;
        boolean playing = true;





        while(playing){
            System.out.println("Kas järgmine number on suurem või väiksem kui " + vastus + "? S = suurem, V = väiksem.");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();

            switch (input){
                case "s":
                    if (jargmineVastus > vastus){
                        punktid++;
                        vastus = jargmineVastus;
                        jargmineVastus = vastuseNumber(vastus);
                        break;
                    }else{
                        playing = false;
                        break;
                    }
                case "v":
                    if (jargmineVastus < vastus){
                        punktid++;
                        vastus = jargmineVastus;
                        jargmineVastus = vastuseNumber(vastus);
                        break;
                    }else{
                        playing = false;
                        break;
                    }

            }

        }

        System.out.println("Mäng läbi. Sa sais koku " + punktid + " punkti.");

    }

    public static int vastuseNumber(double vastus) {
        int ajutine = (int)(Math.random() * 10);
        while (ajutine == vastus){
            ajutine = (int)(Math.random() * 10);
        }
        return ajutine;

    }
}
