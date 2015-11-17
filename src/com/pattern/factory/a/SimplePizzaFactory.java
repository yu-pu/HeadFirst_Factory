package com.pattern.factory.a;
/**
 * 简单工厂的实现
 * @author yupu
 * @date 2015年11月17日
 */
public class SimplePizzaFactory {
	
	
	public Pizza createPizza(String type){
		Pizza pizza=null;
		if (type.equals("cheese")) {
			pizza=new CheesePizza();
		}else if (type.equals("milk")) {
			pizza=new MilkPizza();
		}
		
		return pizza;
	}
	

}
