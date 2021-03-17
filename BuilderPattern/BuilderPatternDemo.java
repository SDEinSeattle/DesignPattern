package DesignPattern.BuilderPattern;

// Builder pattern builds a complex object using simple objects
// and using a step by step approach.
// This type of design pattern comes under creation pattern as
// this pattern provides one of the best ways to create an object.

public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        vegMeal.showItems();
    }
}
