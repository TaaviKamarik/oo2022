import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Testid {
    Person person = new Person("Test", 20,85,185,3);
    FoodContainer foodContainer = new FoodContainer();

    @Test
    public void kontrolli_kas_toode_lisatakse_tabelisse(){
        Food food = new Food("piim",60,50,30);
        foodContainer.addFood(food);
        assertEquals(true,foodContainer.checkFood(food.name));

    }

    @Test
    public void kontrolli_kas_kalorid_lisatakse_kasutajale_oigesti(){
        Food food = new Food("piim",1,1,1);
        person.addFoodCalories(food);
        assertEquals(17, person.getCurCalories());
    }

    @Test
    public void kontrolli_kas_kalorid_arvutatakse_õigesti(){
        assertEquals(2992, person.getMaxCalories());
    }
}
