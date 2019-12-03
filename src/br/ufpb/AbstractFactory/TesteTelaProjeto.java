package br.ufpb.AbstractFactory;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TesteTelaProjeto {

	@Test
	void test() {
		 TelaProjeto tela = new TelaProjeto();
		 tela.setFabrica(new FabricaWindows());
		 tela.montar();
		 tela.desenhar();
		 assertEquals("Janela Windows { Menu Windows Botão Windows }", tela.desenhar());
	}
	@Test
	void test2() {
		 TelaProjeto tela = new TelaProjeto();
		 tela.setFabrica(new FabricaAndroid());
		 tela.montar();
		 tela.desenhar();
		 assertEquals("Janela Android { Menu Android Botão Android }", tela.desenhar());
	}
}