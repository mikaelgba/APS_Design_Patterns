package br.ufpb.FactoryMethod;

public class Test {
	
	public static void main( String [] args ) {
		
		PizzaBase pizzaBr = new BrasilPizzaBase();
		PizzaBase pizzaIta = new ItaliaPizzaBase();
		
		pizzaBr.infoPizza("Cheese");
		pizzaBr.infoPizza("Vegana");
		pizzaBr.infoPizza("Calabresa");
		
		pizzaIta.infoPizza("Cheese");
		pizzaIta.infoPizza("Vegana");
		pizzaIta.infoPizza("Calabresa");
	}
}