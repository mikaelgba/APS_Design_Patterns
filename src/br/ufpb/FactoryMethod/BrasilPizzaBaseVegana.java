package br.ufpb.FactoryMethod;

public class BrasilPizzaBaseVegana implements Pizza {
	
	public void assar() {
		System.out.println("Pizza de Vegana Brasileira");
	}

	public void preparar() {
		System.out.println("Preparando Pizza de Vegana Brasileira");
	}
	
	public void comentario() {
		System.out.println("PS: Pizza Brasileira leva muito Ketchup, coloca mais ai seu corno!!!! \n" + 
	"Fora que Pizza Vegana é uma bosta, então para melhorar vai ter junto Calabresa e Frango!!! \n \n");
	}
}