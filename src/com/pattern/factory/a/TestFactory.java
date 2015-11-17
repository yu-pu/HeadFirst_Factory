package com.pattern.factory.a;

import com.pattern.factory.b.BeiJingPizzaStore;
import com.pattern.factory.c.NLPizzaStore;

public class TestFactory {
	public static void main(String[] args) {
		// 披萨店卖披萨咯
		// 简单工厂
		PizzaStore pizzaStore = new PizzaStore(new SimplePizzaFactory());
		Pizza pizza = pizzaStore.orderPizza("cheese");
		System.out.println("Ethan a pizza " + pizza.getName());

		// 工厂方法模式 由子类决定要做哪一种披萨
		com.pattern.factory.b.PizzaStore pizzaStore2 = new BeiJingPizzaStore();
		Pizza pizza2 = pizzaStore2.orderPizza("milk");
		System.out.println("Ethan a pizza " + pizza2.getName());

		// 抽象工厂模式
		com.pattern.factory.c.PizzaStore pizzaStore3 = new NLPizzaStore();
		com.pattern.factory.c.Pizza pizza3=pizzaStore3.orderPizza("cheese");
		System.out.println("Ethan a pizza " + pizza3.getName());
	}
}
