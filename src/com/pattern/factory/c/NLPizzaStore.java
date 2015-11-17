package com.pattern.factory.c;

public class NLPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		// TODO Auto-generated method stub
		com.pattern.factory.c.Pizza pizza = null;
		PizzaIngredientFactory ingredientFactory = new NingLingPizzaIngredientFactory();
		if (type.equals("cheese")) {
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("宁陵风味的奶油披萨");
		} else if (type.equals("milk")) {
			pizza = new MilkPizza(ingredientFactory);
			pizza.setName("北京风味的奶油披萨");
		}
		return pizza;
	}

}
