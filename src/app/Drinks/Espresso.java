package app.Drinks;

import app.CoffeeMachine.CoffeeMachine;

public class Espresso implements CoffeeDrinks{
    @Override
    public void prepare() {
        System.out.printf("Your %s. Enjoy :)\n", CoffeeMachine.ESPRESSO);
    }
}