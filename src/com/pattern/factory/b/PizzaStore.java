package com.pattern.factory.b;

import com.pattern.factory.a.Pizza;

/**
 * 工厂方法模式 这里把披萨店抽象了出来
 * 
 * @author yupu
 * @date 2015年11月17日
 */
public abstract class PizzaStore {
	public Pizza orderPizza(String type) {
		Pizza pizza;
		pizza = createPizza(type);

		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}

	public abstract Pizza createPizza(String type);
}
