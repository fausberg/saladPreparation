package saladPreparation.salad.vegetables;

import saladPreparation.salad.Vegetables;

public class Onion extends Vegetables {

    public Onion() {
        super(5, "White");
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public int getCalories() {
        return super.getCalories();
    }

    @Override
    public String toString() {
        return "Onion{" +
                "calories=" + calories +
                ", color='" + color + '\'' +
                '}';
    }
}
