import org.junit.jupiter.api.Test;

import java.util.Locale;
import java.util.Scanner;

public class Logic {
    FoodContainer foodContainer = new FoodContainer();
    Person person;
    Scanner scanner = new Scanner(System.in);
    Food food;
    boolean valemis = false;


    public void addPerson(){
        System.out.println("Sisesta oma nimi.");
        String name = scanner.nextLine();
        System.out.println("Sisesta vanus.");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Sisesta oma kaal.");
        int weight = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Sisesta oma pikkus");
        int height = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Sisesta oma aktiivsustase (1-5)");
        int activity = scanner.nextInt();
        scanner.nextLine();
        person = new Person(name,age,weight,height,activity);
    }

    public void returnAllFoods(){
        foodContainer.returnAllFoods();
    }

    public void returnData(){
        System.out.println(person);
    }

    public void showCalories(){
        System.out.println("Su tänased kalorid on " + person.getCurCalories() + "/" + person.getMaxCalories());
    }

    public void addFood(String altName){
        String name = altName;
        String vastus = "";
        if(!valemis){
            System.out.println("Sisesta toidu nimi");
            name = scanner.nextLine();
        }
        System.out.println("Sisesta rasvad (100g kohta)");
        double fat = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Sisesta valgud (100g kohta)");
        double protein = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Sisesta süsivesikud (100g kohta)");
        double carbs = scanner. nextDouble();
        scanner.nextLine();
        food = new Food(name,fat,carbs,protein);
        if(!foodContainer.checkFood(name)){
            foodContainer.addFood(food);
            System.out.println("Lisasime toidu nimega " + name);
        }else{
            System.out.println(name + " oli juba toidunimekirjas olemas.");
        }
        System.out.println("Kas soovite toitu lisada kalorilugejasse? (Y/N)");
        vastus = scanner.nextLine();
        System.out.println("Kui suures koguses? (g)");
        double kogus = scanner.nextInt();
        scanner.nextLine();
        kogus = kogus/100;

        if (vastus.toUpperCase().equals("Y")){
            person.addFoodCalories(food, kogus);
            System.out.println("Päevane kalorite tarbimine on " + person.getCurCalories() + "/"+person.getMaxCalories());
        }

    }

    public void resetCalories(){
        person.resetCalories();
    }

    public void searchFood(){
        System.out.println("Sisesta toidu nimi");
        String name = scanner.nextLine();
        if(foodContainer.checkFood(name)){
            food = foodContainer.findFood(name);
            System.out.println(food);
            System.out.println("Kas soovite toitu lisada kalorilugejasse? (Y/N)");
            String vastus = scanner.nextLine();
            if (vastus.toUpperCase().equals("Y")){
                System.out.println("Kui suures koguses? (g)");
                double kogus = scanner.nextInt();
                scanner.nextLine();
                kogus = kogus/100;
                person.addFoodCalories(food, kogus);
                System.out.println("Päevane kalorite tarbimine on " + person.getCurCalories() + "/"+person.getMaxCalories());
            }
        }else{
            System.out.println("Sellist toitu ei leitud, kas soovite seda lisada (Y/N)");
            String vastus = scanner.nextLine();
            if (vastus.toUpperCase() == "Y"){
                valemis = true;
                addFood(name);
                valemis = false;
            }
        }

    }

}
