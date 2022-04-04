import java.util.ArrayList;
import java.util.Locale;

public class FoodContainer {
    ArrayList<String> foodName = new ArrayList<String>();
    ArrayList<Double> fat = new ArrayList<Double>();
    ArrayList<Double> protein = new ArrayList<Double>();
    ArrayList<Double> carb = new ArrayList<Double>();
    ArrayList<Double> calories = new ArrayList<Double>();


    public FoodContainer() {

    }

    public void addFood(Food food){
        foodName.add(food.name);
        fat.add(food.fat);
        protein.add(food.proteins);
        carb.add(food.carbs);
        calories.add(food.totCalories);
    }

    public Food findFood(String name){
        Food foundFood;
        int index = 0;
        for (String food:foodName) {
            if (food == name){
                index = foodName.indexOf(name);
            }
        }
        foundFood = new Food(foodName.get(index), fat.get(index), carb.get(index), protein.get(index));
        return foundFood;
    }

    public void returnAllFoods(){
        int index = 0;
        for (String food:foodName) {
                index = foodName.indexOf(food);
                System.out.println(foodName.get(index) + " | " + fat.get(index) + " | " + protein.get(index) + " | " + carb.get(index) + " | " + calories.get(index));
            }

    }


    public boolean checkFood(String string){
        boolean value = false;
        if(foodName.size() > 0){
            for (String food : foodName) {
                if (food == string){
                    value = true;
                }
            }
        }

        return value;
    }
}
