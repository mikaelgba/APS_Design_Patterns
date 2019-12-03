package br.ufpb.FactoryMethod;

public class Test {
	
	public static void main(String[] args) {
		
//		Editora a = new Editora();
		
		Empresa Empresa1 = Editora.empresas("Shonen Jump");
		Empresa1.divulgar();
		
		Empresa Empresa2 = Editora.empresas("DC");
		Empresa2.divulgar();
				
		Empresa Empresa3 = Editora.empresas("Marvel");
		Empresa3.divulgar();
	}

}
