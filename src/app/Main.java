package app;

import app.service.DrinksService;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DrinksService service = new DrinksService();
        while (true) {
            service.menu();
            int choice;
            try {
                choice = scanner.nextInt();
                if ( choice == 4 ) {
                    break;
                }
                service.prepareDrink(choice);
            } catch (Exception ex) {
                System.out.println("Invalid input, please choice number");
                choice = scanner.nextInt();
            }
        }
    }
}
