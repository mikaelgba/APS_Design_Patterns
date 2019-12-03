package br.ufpb.FactoryMethod;

import javax.swing.JOptionPane;

public class DC implements Empresa{
	
	private final String nome = "DC Comics";
	
	@Override
	public void divulgar() {
		JOptionPane.showMessageDialog(null, nome + " a Maior Editora do Mundo");
	}
	
}