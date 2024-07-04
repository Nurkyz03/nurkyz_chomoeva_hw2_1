public class Fruit extends Food {
    private FruitType fruitType;

    public Fruit(String name, NutritionInfo nutritionInfo, FruitType fruitType) {
        super(name, nutritionInfo);
        this.fruitType = fruitType;
    }



    public FruitType getFruitType() {
        return fruitType;
    }

    public void taste() {
        System.out.println("Tastes sour");
    }
    public void taste(String taste) {
        System.out.println(taste);
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nFruitType = " + fruitType;
    }
}
