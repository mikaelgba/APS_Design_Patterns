package br.ufpb.FactoryMethod;

public class ItaliaPizzaBaseCalabresa implements Pizza{
	
	public void assar() {
		System.out.println("Pizza de Calabresa Italiana");
	}

	public void preparar() {
		System.out.println("Praparando Pizza de Calabresa Italiana");
	}
	
	public void comentario() {
		System.out.println("PS: Pizza Italiana não leva Ketchup seu corno!!!! \n \n");
	}
}