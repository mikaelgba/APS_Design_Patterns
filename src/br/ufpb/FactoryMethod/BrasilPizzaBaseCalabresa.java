package br.ufpb.FactoryMethod;

public class BrasilPizzaBaseCalabresa implements Pizza{
	
	public void assar() {
		System.out.println("Pizza de Calabresa Brasileira");
	}

	public void preparar() {
		System.out.println("Preparando Pizza de Calabresa Brasileira");
	}
	
	public void comentario() {
		System.out.println("PS: Pizza Brasileira leva muito Ketchup, coloca mais ai seu corno!!!! \n \n");
	}
}