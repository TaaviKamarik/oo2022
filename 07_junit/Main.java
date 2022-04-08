import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int otsus = 0;
        Logic logic = new Logic();
        String altName = "";

        while(otsus != 8){
            System.out.println("Vali oma tegevus.");
            System.out.println("1. Lisa kasutaja.");
            System.out.println("2. Näita kasutaja infot.");
            System.out.println("3. Näita kalorite seisu.");
            System.out.println("4. Lisa uus toiduaine.");
            System.out.println("5. Otsi toiduainet.");
            System.out.println("6. Näita kõiki toiduaineid.");
            System.out.println("7. Nulli kalorid.");
            System.out.println("8. Katkesta.");
            otsus = scanner.nextInt();

            switch (otsus){
                case 1:
                    logic.addPerson();
                    break;
                case 2:
                    logic.returnData();
                    break;
                case 3:
                    logic.showCalories();
                    break;
                case 4:
                    logic.addFood(altName);
                    break;
                case 5:
                    logic.searchFood();
                    break;
                case 6:
                    logic.returnAllFoods();
                    break;
                case 7:
                    logic.resetCalories();
                    break;
                case 8:
                    otsus = 8;
                    break;

            }
        }

    }
}
