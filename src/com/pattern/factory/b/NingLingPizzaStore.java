package com.pattern.factory.b;

import com.pattern.factory.a.CheesePizza;
import com.pattern.factory.a.MilkPizza;
import com.pattern.factory.a.Pizza;

public class NingLingPizzaStore extends PizzaStore{

	@Override
	public Pizza createPizza(String type) {
		Pizza pizza=null;
		if (type.equals("cheese")) {
			pizza=new CheesePizza();
		}else if (type.equals("milk")) {
			pizza=new MilkPizza();
		}
		return pizza;
	}

}
