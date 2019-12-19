package br.ufpb.FactoryMethod;

public class ItaliaPizzaBase extends PizzaBase {
	
	@Override
	 public Pizza criarPizza( String tipoPizza ) {
		
		if(tipoPizza.equals("Cheese")){
			return new ItaliaPizzaBaseCheese();
		}else if(tipoPizza.equals("Calabresa")){
			return new ItaliaPizzaBaseCalabresa();
		}else if(tipoPizza.equals("Vegana")){
			return new ItaliaPizzaBaseVegana();
		}else return null;
	}
}