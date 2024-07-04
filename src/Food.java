public class Food {
    private String name;
    private NutritionInfo nutritionInfo;

    public Food(String name, NutritionInfo nutritionInfo) {
        this.name = name;
        this.nutritionInfo = nutritionInfo;
    }

    public String getName() {
        return name;
    }

    public NutritionInfo getNutritionInfo() {
        return nutritionInfo;
    }

    @Override
    public String toString() {
        return "Food " +
                "name = " + name +
                "\nNutrition info: " + "\nCalories = " + nutritionInfo.getCalories() +
                "\nCarbohydrates = " + nutritionInfo.getCarbohydrates() +
                "\nProteins = " + nutritionInfo.getProteins() +
                "\nFats = " + nutritionInfo.getFats();
    }
}
