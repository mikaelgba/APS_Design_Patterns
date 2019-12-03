package br.ufpb.FactoryMethod;

import javax.swing.JOptionPane;

public class ShonenJump implements Empresa{
	
	private final String nome = "Shonen Jump";
	
	@Override
	public void divulgar() {
		JOptionPane.showMessageDialog( null, nome + " a Maior editora no Japão");		
	}
}