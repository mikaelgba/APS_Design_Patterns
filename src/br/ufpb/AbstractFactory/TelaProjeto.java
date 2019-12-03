package br.ufpb.AbstractFactory;

public class TelaProjeto  {
	
	private FabricaAbstrata fabrica;
	private Janela janela;
	private Menu menu;
	private Botao botao;
	
	public void setFabrica(FabricaAbstrata fabrica) {
		this.fabrica = fabrica;
	}
	public void montar() {
		this.janela = fabrica.criarJanela();
		this.menu = fabrica.criarMenu();
		this.botao = fabrica.criarBotao();
	}
	public String desenhar() {
		return janela.Desenhar() + menu.desenhar() + botao.desenhar();
	}
}