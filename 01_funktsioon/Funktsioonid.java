public class Funktsioonid {

    public static void main(String[] args) {
        System.out.println(taksoSõit(3.5));
        double maksumus = taksoSõit(0.5);
        System.out.println(maksumus);

        prindiForTsükkel(5);

        System.out.println(temperatuuriHinnang(-2));
        String hinnang = temperatuuriHinnang(-2);
        System.out.println(hinnang);
    }

    public static double taksoSõit(double h){
        return 3+0.8*h;//funktsioon, et midagi saada
    }

    //void -- funktsioon, et midagi teha
    public static void prindiForTsükkel(int kordadeArv){
        for (int i = 0; i < kordadeArv; i++) {
            System.out.println(i*10);
        }
    }

    public static String temperatuuriHinnang(float temperatuur){
        if (temperatuur < 0){
            return "On jääs";
        }else{
            return "Ei ole jääs";
        }
    }
}
