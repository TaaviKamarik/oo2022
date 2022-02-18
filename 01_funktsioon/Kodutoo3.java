import java.util.Scanner;

public class Kodutoo3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sisesta laenusumma");
        int summa = scanner.nextInt();
        System.out.println("Sisesta intressimäär");
        int intress = scanner.nextInt();
        System.out.println("sisesta laenu pikkus kuudes");
        int kuid = scanner.nextInt();
        double vahesumma = summa;
        double intressKokku = 0;

        double kuineMakse = summa / kuid;



        System.out.println("Kokku kuulub tagasimaksmisele " +  arvutus(intressKokku, vahesumma, intress, kuineMakse, kuid, summa));
    }


    public static int arvutus(double intressKokku, double vahesumma, int intress, double kuineMakse, int kuid, int summa){
        for (int i = 0; i < kuid; i++) {
            intressKokku = intressKokku + vahesumma * intress /100;
            vahesumma = vahesumma - kuineMakse;
        }

        return (int)(intressKokku + summa);
    }
}
