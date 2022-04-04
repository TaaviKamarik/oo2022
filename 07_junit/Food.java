public class Food {
    String name;
    double fat;
    double carbs;
    double proteins;
    double totCalories;

    public Food(String name, double fat, double carbs, double proteins) {
        this.name = name;
        this.fat = fat;
        this.carbs = carbs;
        this.proteins = proteins;
        this.totCalories = carbs * 4 + fat * 9 + proteins * 4;
    }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", fat=" + fat +
                ", carbs=" + carbs +
                ", proteins=" + proteins +
                ", totCalories=" + totCalories +
                '}';
    }
}
