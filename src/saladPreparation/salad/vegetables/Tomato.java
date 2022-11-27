package saladPreparation.Salad;

public class Tomato extends Vegetables {

    public Tomato() {
        super(15, "Red");
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
        return "Tomato{" +
                "calories=" + calories +
                ", color='" + color + '\'' +
                '}';
    }
}
