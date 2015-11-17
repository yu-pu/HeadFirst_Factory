package com.pattern.factory.c;

public class BeJingPizzaingredientFactory implements PizzaIngredientFactory {

	@Override
	public Milk createMilk() {
		return new Milk("北京奶油");
	}

	@Override
	public Cheese createCheese() {
		return new Cheese("北京芝士 ");
	}

}
