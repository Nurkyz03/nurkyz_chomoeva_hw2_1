public class NutritionInfo {
    private int calories;
    private int carbohydrates;
    private int proteins;
    private int fats;

    public NutritionInfo(int calories, int carbohydrates, int proteins, int fats) {
        this.calories = calories;
        this.carbohydrates = carbohydrates;
        this.proteins = proteins;
        this.fats = fats;
    }

    public int getCalories() {
        return calories;
    }

    public int getCarbohydrates() {
        return carbohydrates;
    }

    public int getProteins() {
        return proteins;
    }

    public int getFats() {
        return fats;
    }

}
