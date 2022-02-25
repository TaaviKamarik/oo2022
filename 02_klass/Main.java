public class Main {
    public static void main(String[] args) {

        /*Human one =new Human("Taavi", 99, 2.22, true);
        System.out.println(one);
        one.sayHello();*/

        KodutooKlass tegelane = new KodutooKlass("Must", 100);
        KodutooKlass tegelane2 = new KodutooKlass("valge", 200);

        System.out.println(tegelane);
        System.out.println(tegelane2);
        tegelane.vahendaElusid(50);
        tegelane.vahendaElusid(20);
        tegelane2.vahendaElusid(10);
        System.out.println(tegelane);
        System.out.println(tegelane2);
    }

    // main meetod 1 klass
    //uus klaass vähemalt 2 muutujat ja 1 funktrśioon.
    //toString.
    //klassi vähemalt kaks korda välja kutsutud ja meetodit ka välja kutsutud.
}
