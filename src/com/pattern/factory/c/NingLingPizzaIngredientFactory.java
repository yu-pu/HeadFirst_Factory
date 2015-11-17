package com.pattern.factory.c;

public class NingLingPizzaIngredientFactory implements PizzaIngredientFactory{

	@Override
	public Milk createMilk() {
		return new Milk("宁陵奶油");
	}

	@Override
	public Cheese createCheese() {
		return new Cheese("宁陵芝士");
	}

}
