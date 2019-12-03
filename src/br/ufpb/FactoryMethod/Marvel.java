package br.ufpb.FactoryMethod;

import javax.swing.JOptionPane;

public class Marvel implements Empresa {

	private final String nome = "Marvel";

	@Override
	public void divulgar() {
		JOptionPane.showMessageDialog(null, nome + " a Maior editora nos EUA");
	}
}