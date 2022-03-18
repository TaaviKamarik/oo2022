/*      * Teata, kas kasutaja sisestatud arv jagub kahe, kolme viie või seitsmega.
        * Teata, kas kasutaja sisestatud arv on algarv.
        * Koosta massiiv esimese tuhande algarvuga. Leia selle sõela abil, millised on kümme suurimat algarvu, mis on väiksemad, kui tuhandenda algarvu ruut.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean kontrollija = false;
        int kontrollArv = 3;
        int kumneLoendur = 0;
        int ajutine = 0;
        List<Integer> algarvud = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);



        System.out.println("Palun sisesta oma arv: ");
        int arv = scanner.nextInt();



        jagavusKontrollija(arv);
        algarvuKontrollija(arv, kontrollija);
        kummeAlgarvu(algarvud,kontrollArv,kontrollija,ajutine,kumneLoendur);


    }/*Maini lõpp*/

    public static void jagavusKontrollija(int arv){
        if(arv%2 == 0){
            System.out.println("Arv jagub kahega.");
        }
        if(arv%3 == 0){
            System.out.println("Arv jagub kolmega.");
        }
        if(arv%5 == 0){
            System.out.println("Arv jagub viiega.");
        }
        if(arv%7 == 0){
            System.out.println("Arv jagub seitsmega.");
        }
    }

    public static void  algarvuKontrollija(int arv, boolean kontrollija){
        if(arv > 0){
            for (int i = 2; i < arv; i++) {
                if (arv%i == 0){
                    System.out.println("Ei ole algarv");
                    kontrollija = true;
                    break;
                }
            }
        }

        if(arv == 1 || kontrollija == false) {
            System.out.println("On algarv.");
        }
    }

    public static void kummeAlgarvu(List<Integer> algarvud, int kontrollArv, boolean kontrollija, int ajutine, int kumneLoendur){

        algarvud.add(1);
        algarvud.add(2);
        while(algarvud.size() < 1000){

            for (int i = 2; i < kontrollArv; i++) {
                if (kontrollArv%i == 0){
                    kontrollija = true;
                    break;
                }
            }


            if(kontrollija == false) {
                algarvud.add(kontrollArv);
            }
            kontrollija = false;
            kontrollArv++;
        }

        int viimaseRuut = algarvud.get(algarvud.size()-1) * algarvud.get(algarvud.size()-1);




        for (int i = viimaseRuut - 1; i > 0; i--) {

            for (int j = 2; j < i; j++) {

                if (i%j == 0){

                    kontrollija = true;
                    break;
                }
                if (kontrollija == true){
                    break;
                }
            }
            if(kontrollija == false) {
                System.out.print(i + " ");
                kumneLoendur++;
            }


            kontrollija = false;

            if (kumneLoendur == 10){
                break;
            }

        }

    }


}


