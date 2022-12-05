package saladPreparation.salad.vegetables;

import saladPreparation.salad.Vegetables;

public class Tomato extends Vegetables {

    public Tomato() {
        super(15, "Red", "Поммидор");
    }

    @Override
    public String toString() {
        return "Tomato{" +
                "calories=" + calories +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public void info() {
        System.out.println("Это " + super.vegetableName);
        System.out.println("Они были взращены на эксклюзивных грядках");
        System.out.println("Цвет : " + super.color);
        System.out.println("Калории : " + super.getCalories());
    }
}
