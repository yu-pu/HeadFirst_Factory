package com.pattern.factory.c;

public abstract class Pizza {
	String name;
	Cheese cheese;
	Milk milk;

	abstract void prepare();

	public void bake() {
		System.out.println("Bake for 25 minutes at 350");// 切片
	}

	public void cut() {
		System.out.println("Cutting the pizza into diagnal slices");
	}

	public void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
