package app.service;

import app.CoffeeMachine.CoffeeMachine;
import app.Drinks.Cappuccino;
import app.Drinks.Espresso;
import app.Drinks.Latte;

public class DrinksService {
    CoffeeMachine[] coffeeDrinks = CoffeeMachine.values();
    public void menu(){

        System.out.println("Select a drink:");
        for (CoffeeMachine drink: coffeeDrinks){
            System.out.printf("%d. %s\n",drink.ordinal() + 1 ,drink);
        }
        System.out.println("4. Exit");
    }

    public void prepareDrink(int choice){
        switch (choice) {
            case 1:
               new Espresso().prepare();
                break;
            case 2:
                new Cappuccino().prepare();
                break;
            case 3:
                new Latte().prepare();
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }
    }
}
