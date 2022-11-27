package saladPreparation.salad;


public class Vegetables implements Comparable<Vegetables> {
    protected int calories;
    protected String color;

    private static int allCalories = 0;

    public Vegetables() {
    }

    public Vegetables(int calories, String color) {
        this.calories = calories;
        this.color = color;
    }

    public int getCalories() {
        return calories;
    }

    public String getColor() {
        return color;
    }

    public int getAllCalories() {
        allCalories += calories;
        return allCalories;
    }

    @Override
    public String toString() {
        return "Vegetables{" +
                "calories=" + calories +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public int compareTo(Vegetables o) {
        return (o.getColor().compareTo(this.color));
    }
}
