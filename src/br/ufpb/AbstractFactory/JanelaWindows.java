package br.ufpb.AbstractFactory;

public class JanelaWindows implements Janela{

	@Override
	public String Desenhar() {
		return "Janela Windows { ";
	}
}