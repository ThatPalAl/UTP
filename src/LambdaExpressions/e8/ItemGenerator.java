package LambdaExpressions.e8;

import java.util.Random;

public class ItemGenerator {
    private Random random;
    private String fileName;

    public ItemGenerator() {
    }

    public ItemGenerator(String fileName) {
        this.fileName = fileName;
        random = new Random();
    }

    // Method to generate a random food ingredient
    public String generateIngredient() {
        String[] ingredients = {"Flour", "Sugar", "Eggs", "Butter", "Milk", "Salt", "Baking Powder", "Chocolate"};
        int index = random.nextInt(ingredients.length);
        return ingredients[index];
    }

    // Method to generate a random food ingredient with a specified type
    public Item generateIngredient(int quantity, String type) {
        String[] fruits = {"Apple", "Banana", "Orange", "Strawberry", "Grapes", "Pineapple", "Watermelon", "Mango"};
        String[] vegetables = {"Carrot", "Broccoli", "Tomato", "Spinach", "Potato", "Onion", "Pepper", "Cucumber"};
        String[] meats = {"Chicken", "Beef", "Pork", "Fish", "Shrimp", "Turkey", "Lamb", "Duck"};
        String[] dairy = {"Cheese", "Yogurt", "Cream", "Buttermilk", "Cottage Cheese", "Sour Cream", "Cream Cheese", "Mascarpone"};
        String[] grains = {"Rice", "Quinoa", "Barley", "Oats", "Buckwheat", "Millet", "Couscous", "Wheat Berries"};

        Item[] items = new Item[quantity];
        return null;
    }
}

