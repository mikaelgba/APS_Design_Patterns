package br.ufpb.FactoryMethod;

public class ItaliaPizzaBaseVegana implements Pizza{
	
	public void assar() {
		System.out.println("Pizza de Calabresa Italiana");
	}

	public void preparar() {
		System.out.println("Praparando Pizza de Calabresa Italiana");
	}
	
	public void comentario() {
		System.out.println("PS: Pizza Italiana n�o leva Ketchup seu corno!!!! \n"
				+ "Fora que Pizza Vegana � uma bosta, ent�o para melhorar vai ter junto Calabresa e Frango!!! \n \n");
	}
}