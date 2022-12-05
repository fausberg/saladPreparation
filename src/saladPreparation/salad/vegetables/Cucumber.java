package saladPreparation.salad.vegetables;

import saladPreparation.salad.Vegetables;

public class Cucumber extends Vegetables {

    public Cucumber() {
        super(10, "Green", "Огурец");
    }

    @Override
    public String toString() {
        return "Cucumber{" +
                "calories=" + calories +
                ", color='" + color + '\'' +
                '}';
    }

    public void info() {
        System.out.println("Это " + super.vegetableName);
        System.out.println("Такие огурцы только у нас");
        System.out.println("Цвет : " + super.color);
        System.out.println("Калории : " + super.getCalories());
    }
}
