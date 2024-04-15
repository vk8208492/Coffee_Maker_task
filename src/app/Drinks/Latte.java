package app.Drinks;

import app.CoffeeMachine.CoffeeMachine;

public class Latte implements CoffeeDrinks{
    @Override
    public void prepare() {
        System.out.printf("Your %s. Enjoy  :)\n", CoffeeMachine.LATTE);
    }
}
