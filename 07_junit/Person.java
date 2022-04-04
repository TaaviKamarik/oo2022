public class Person {
    String name;
    int age;
    int weigth;
    int height;
    double maxCalories;
    double curCalories;
    double activityMultiplier;

    public Person(String name, int age, int weigth, int height, int activityLevel) {
        switch (activityLevel){
            case 1:
                activityMultiplier = 1.2;
                break;
            case 2:
                activityMultiplier = 1.4;
                break;
            case 3:
                activityMultiplier = 1.6;
                break;
            case 4:
                activityMultiplier = 1.8;
                break;
            case 5:
                activityMultiplier = 2.0;
                break;
        }
        this.name = name;
        this.age = age;
        this.weigth = weigth;
        this.height = height;
        this.maxCalories = weigth * 22 * activityMultiplier;
        this.curCalories = 0;
    }

    public double getMaxCalories() {
        return maxCalories;
    }

    public double getCurCalories() {
        return curCalories;
    }

    public void resetCalories() {
        this.curCalories = 0;
    }

    public void addFoodCalories(Food food){
        this.curCalories += food.totCalories;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weigth=" + weigth +
                ", height=" + height +
                ", maxCalories=" + maxCalories +
                '}';
    }
}
