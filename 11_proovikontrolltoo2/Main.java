import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        double pendliPikkus = 0.2;
        Hammasratas hammasratas = new Hammasratas(60, 40);
        Hammasratas hammasratas2 = new Hammasratas(60, 15);
        Hammasratas hammasratas3 = new Hammasratas(12, 30);
        Pendel pendel = new Pendel(pendliPikkus, hammasratas, hammasratas2, hammasratas3);

        System.out.println(pendel.vonkeperiood());
        boolean isLeft = false;
        int counter = 0;
        int ringid = 0;
        int ringid2 = 0;
        System.out.println("Pendli suurus: " + pendliPikkus);
        System.out.println("1. hammasratta suurus: " + hammasratas.suurus);
        System.out.println("2. hammasratta suurus: " + hammasratas2.suurus);
        System.out.println("3. hammasratta suurus: " + hammasratas3.suurus);

        System.out.printf("Minu kella suurus : %.2f", (pendliPikkus + hammasratas.suurus + hammasratas2.suurus + hammasratas3.suurus));
        while (true){
            TimeUnit.MILLISECONDS.sleep((long)(pendel.vonkeperiood()*1000)/2);
            if (isLeft){
                System.out.println("Pendel vasakul");
                isLeft = false;
                counter++;
            }else{
                System.out.println("Pendel paremal");
                isLeft = true;
                counter++;
            }
            if(hammasratas.hammasteArv == counter){
                ringid++;
                counter = 0;
                if(hammasratas2.hammasteArv == ringid){
                    ringid2++;
                    ringid = 0;
                }
            }
            System.out.print("Kokku tehtud ringe " + ringid);
            System.out.print(ringid2 + ".");
            System.out.print(ringid + ".") ;
            System.out.print(counter);
        }

    }
}
