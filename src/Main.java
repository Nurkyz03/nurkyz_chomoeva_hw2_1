public class Main {
    public static void main(String[] args) {
        NutritionInfo strawberryNutrition = new NutritionInfo(52, 14, 1, 0);
        Fruit strawberry = new Fruit("Strawberry", strawberryNutrition, FruitType.BERRY);

        NutritionInfo spinachNutrition = new NutritionInfo(23, 3, 2, 0);
        Vegetable spinach = new Vegetable("Spinach", spinachNutrition);

        NutritionInfo carrotNutrition = new NutritionInfo(41, 10, 1, 0);
        Vegetable carrot = new Vegetable("Carrot", carrotNutrition);

        NutritionInfo lemonNutrition = new NutritionInfo(29, 9, 1, 0);
        Fruit lemon = new Fruit("Lemon", strawberryNutrition, FruitType.CITRUS);

        System.out.println("\nInformation about Strawberry:");
        System.out.println(strawberry);
        strawberry.taste("Tastes sweet");

        System.out.println("\nInformation about Spinach:");
        System.out.println(spinach);

        System.out.println("\nInformation about Carrot:");
        System.out.println(carrot);

        System.out.println("\nInformation about Lemon:");
        System.out.println(lemon);
        strawberry.taste();
    }

}