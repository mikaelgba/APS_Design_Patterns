package br.ufpb.FactoryMethod;

public abstract class PizzaBase {
	
	public Pizza infoPizza( String tipoPizza ){
		
		Pizza pizza;
		pizza = criarPizza( tipoPizza );
		pizza.preparar();
		pizza.assar();
		pizza.comentario();
		return pizza;
	}
	abstract Pizza criarPizza( String tipoPizza );
}