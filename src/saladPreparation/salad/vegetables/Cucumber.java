package saladPreparation.salad.vegetables;

import saladPreparation.salad.Vegetables;

public class Cucumber extends Vegetables {

    public Cucumber() {
        super(10, "Green");
    }

    @Override
    public int getCalories() {
        return super.getCalories();
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public String toString() {
        return "Cucumber{" +
                "calories=" + calories +
                ", color='" + color + '\'' +
                '}';
    }
}
