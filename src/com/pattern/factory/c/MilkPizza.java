package com.pattern.factory.c;

public class MilkPizza extends Pizza {
	PizzaIngredientFactory ingredientFactory;

	public MilkPizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}

	@Override
	void prepare() {
		System.out.println("Preparing " + name);
		cheese = ingredientFactory.createCheese();
	}

}
