package com.pattern.factory.a;

public class MilkPizza extends Pizza {
	public MilkPizza() {
		name="奶油披萨";
		dough="小麦面";
		sauce="奶油酱料";
		toppings.add("白糖多多  红糖多多  奶油多多");
	}
	@Override
	public void cut() {
		System.out.println("切成了椭圆形的蛋糕");
	}
}
