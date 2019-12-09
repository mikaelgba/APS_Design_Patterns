package br.ufpb.Singleton;

public class Singleton {
	
	private String nome;
	private int num;
	private static Singleton instance;
	
	private Singleton() { }
	
	public static Singleton getInstance() {
		if( instance == null) {
			return new Singleton();
		}
		return instance;
	}
	public void setDados(String nome, int num) {
		this.nome = nome;
		this.num = num;
	}
}
