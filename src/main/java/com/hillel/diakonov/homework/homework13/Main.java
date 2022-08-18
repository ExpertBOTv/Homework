package com.hillel.diakonov.homework.homework13;

import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        app();

    }

    public static void app() {
        System.out.println("Our range includes:\n" +
                "Coffee\n" +
                "Tea\n" +
                "Lemonade\n" +
                "Mojito\n" +
                "mineral water\n" +
                "Coca Cola\n" +
                "\n" +
                "As soon as you want to finish the order, write: \"Stop\"\n" +
                "-------------------------------------------------------------");

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        String type = "";
        String stop = "STOP";

        try {
            do {
                type = scanner.next();
                DrinksMachine drinksMachine = DrinksMachine.valueOf(type.toUpperCase());

                switch (drinksMachine) {
                    case COFFEE: {
                        currentDrink(drinksMachine.getTitle());
                        sum += Drinks.CoffeePrice;
                        break;
                    }
                    case TEA: {
                        currentDrink(drinksMachine.getTitle());
                        sum += Drinks.TeaPrice;
                        break;
                    }
                    case MOJITO: {
                        currentDrink(drinksMachine.getTitle());
                        sum += Drinks.MojitoPrice;
                        break;
                    }
                    case MINERAL: {
                        currentDrink(drinksMachine.getTitle());
                        sum += Drinks.MineralWaterPrice;
                        break;
                    }
                    case LEMONADE: {
                        currentDrink(drinksMachine.getTitle());
                        sum += Drinks.LemonadePrice;
                        break;
                    }
                    case COCA_COLA: {
                        currentDrink(drinksMachine.getTitle());
                        sum += Drinks.CocaColaPrice;
                        break;
                    }
                }

                new Drinks();

            } while (true);
        } catch (IllegalArgumentException e) {
            if (Objects.equals(type.toUpperCase(), stop)) {
                System.out.println("Thank you! From you " + sum + " hryvnia. You ordered " + Drinks.counter + " drinks.");
            } else{
                System.out.println("We don't have this on the menu.");
            }
            System.exit(1);
        }
    }

    private static void currentDrink(String drink) {
        System.out.println("You order " + drink + ".");
    }
}