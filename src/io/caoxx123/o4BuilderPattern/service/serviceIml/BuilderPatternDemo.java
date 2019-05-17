package io.caoxx123.o4BuilderPattern.service.serviceIml;

public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder=new MealBuilder();

        Meal vegMeal=mealBuilder.prepareVegMeal();
        System.out.println("veg meal");
        vegMeal.showItem();
        System.out.println("The veg Meal cost "+vegMeal.getCost());

        Meal nonVegMeal=mealBuilder.prepareNonVegMeal();
        System.out.println("non veg Meal");
        nonVegMeal.showItem();
        System.out.println("The non veg Meal Cost"+nonVegMeal.getCost());
    }
}
