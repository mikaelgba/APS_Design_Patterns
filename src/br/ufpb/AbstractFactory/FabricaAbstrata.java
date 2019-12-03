package br.ufpb.AbstractFactory;

public interface FabricaAbstrata {
	
	Janela criarJanela();
	Menu criarMenu();	
	Botao criarBotao();
}