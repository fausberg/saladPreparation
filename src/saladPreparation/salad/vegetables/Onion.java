package saladPreparation.salad.vegetables;

import saladPreparation.salad.Vegetables;

public class Onion extends Vegetables {

    public Onion() {
        super(5, "White", "Лук");
    }

    @Override
    public String toString() {
        return "Onion{" +
                "calories=" + calories +
                ", color='" + color + '\'' +
                '}';
    }

    public void info() {
        System.out.println("Это " + super.vegetableName);
        System.out.println("Самый вкусный лук что у наст есть");
        System.out.println("Цвет : " + super.color);
        System.out.println("Калории : " + super.getCalories());
    }
}
