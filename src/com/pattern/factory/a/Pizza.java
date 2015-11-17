package com.pattern.factory.a;

import java.util.ArrayList;

public abstract class Pizza {
	String name;
	String dough; // 面团类型
	String sauce;// 酱料类型
	ArrayList<String> toppings = new ArrayList<String>();// 一套作料

	public void prepare() {
		// 准备工作正在有序进行
		System.out.println("Pareparing " + name);
		System.out.println("Tossing dough....");
		System.out.println("Adding sauce...");
		System.out.println("Adding toppings:");
		for (int i = 0; i < toppings.size(); i++) {
			System.out.println("  " + toppings.get(i));
		}
	}

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

}
