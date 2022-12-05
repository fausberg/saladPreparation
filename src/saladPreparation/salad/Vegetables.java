package saladPreparation.salad;


public abstract class Vegetables implements Comparable<Vegetables> {
    protected int calories;
    protected String color;

    protected String vegetableName;

    private static int allCalories = 0;

    public Vegetables() {
    }

    public Vegetables(int calories, String color, String vegetableName) {
        this.calories = calories;
        this.color = color;
        this.vegetableName = vegetableName;
        allCalories += calories;
    }

    public int getCalories() {
        return calories;
    }

    public String getColor() {
        return color;
    }

    public String getVegetableName() {
        return vegetableName;
    }

    public static int getAllCalories() {
        return allCalories;
    }

    @Override
    public String toString() {
        return "Vegetables{" +
                "calories=" + calories +
                ", color='" + color + '\'' +
                '}';
    }

    public abstract void info();

    @Override
    public int compareTo(Vegetables o) {
        return (o.getColor().compareTo(this.color));
    }
}
