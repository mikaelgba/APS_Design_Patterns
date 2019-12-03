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
		 tela.Desenhar();
		 assertEquals("Janela Windows { menu Windows botão Windows}", tela.Desenhar());
	}

}
