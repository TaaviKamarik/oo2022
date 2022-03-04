public class Hulknurk {
    public static void main(String[] args) {
        Klass klass = new Klass();
        klass.setxCoords(3,4,6);
        klass.setyCoords(5,7,8);

        Klass klass2 = new Klass();
        klass2.setxCoords(6,8,9);
        klass2.setyCoords(4,6,8);

        System.out.println(klass);
        System.out.println(klass2);

    }
}
