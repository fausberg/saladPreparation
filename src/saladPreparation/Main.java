package saladPreparation;

import saladPreparation.salad.vegetables.Cucumber;
import saladPreparation.salad.vegetables.Onion;
import saladPreparation.salad.vegetables.Tomato;
import saladPreparation.salad.Vegetables;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Vegetables> vegetables = new ArrayList<>();

        vegetables.add(new Tomato());
        vegetables.add(new Cucumber());
        vegetables.add(new Tomato());
        vegetables.add(new Cucumber());
        vegetables.add(new Cucumber());
        vegetables.add(new Tomato());
        vegetables.add(new Onion());
        vegetables.add(new Onion());
        vegetables.add(new Tomato());
        vegetables.add(new Onion());
        vegetables.add(new Cucumber());
        vegetables.add(new Tomato());
        vegetables.add(new Onion());
        vegetables.add(new Onion());
        vegetables.add(new Onion());

        for(Vegetables vegetable :vegetables) {
                System.out.println(vegetable);
        }

        System.out.println();

        int allCalories = 0;

        for(Vegetables vegetable :vegetables) {
                allCalories = vegetable.getAllCalories();
        }

        System.out.println("Общая калорийность : " + allCalories);

        System.out.println();

        vegetables.sort(Vegetables::compareTo);


        for(Vegetables vegetable : vegetables) {
            System.out.println(vegetable);
        }

        System.out.println();

        getVegetableByCalories(vegetables);
    }

    public static void getVegetableByCalories(List<Vegetables> vegetables) {
        System.out.println("Write min calories");
        int minCalories = new Scanner(System.in).nextInt();
        System.out.println("Write max calories");
        int maxCalories = new Scanner(System.in).nextInt();
        for (Vegetables vegetable : vegetables) {
            if (vegetable.getCalories() >= minCalories && vegetable.getCalories() <= maxCalories) {
                System.out.println(vegetable);
            }
        }


    }
}