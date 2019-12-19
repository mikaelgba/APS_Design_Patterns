package br.ufpb.FactoryMethod;

public class BrasilPizzaBaseCheese implements Pizza{
	
	public void assar() {
		System.out.println("Pizza de Cheese Brasileira");
	}

	public void preparar() {
		System.out.println("Preparando Pizza de Cheese Brasileira");
	}
	
	public void comentario() {
		System.out.println("PS: Pizza Brasileira leva muito Ketchup, coloca mais ai seu corno!!!! \n \n");
	}
}