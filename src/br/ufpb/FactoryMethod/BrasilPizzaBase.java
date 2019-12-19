package br.ufpb.FactoryMethod;

public class BrasilPizzaBase extends PizzaBase {
	
	@Override
	 Pizza criarPizza( String tipoPizza ) {
		
		if(tipoPizza.equals("Cheese")){
			return new BrasilPizzaBaseCheese();
		}else if(tipoPizza.equals("Calabresa")){
			return new BrasilPizzaBaseCalabresa();
		}else if(tipoPizza.equals("Vegana")){
			return new BrasilPizzaBaseVegana();
		}else return null;
	}
}