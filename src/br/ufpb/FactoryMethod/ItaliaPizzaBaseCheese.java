package br.ufpb.FactoryMethod;

public class ItaliaPizzaBaseCheese implements Pizza{
	
	public void assar() {
		System.out.println("Pizza de Cheese Italiana");
	}

	public void preparar() {
		System.out.println("Preparando Pizza de Cheese Italiana");
	}
	
	public void comentario() {
		System.out.println("PS: Pizza Italiana não leva Ketchup seu corno!!!! \n \n");
	}
}