package Isikukood;

public class IsikukoodMain {

    public static void main(String[] args) {
        IsikukoodEE ee = new IsikukoodEE("39402124444");
        System.out.println(ee.isMale());
        System.out.println(ee.getBirthMonth());
        System.out.println(ee.getBirthYear());
    }
}
