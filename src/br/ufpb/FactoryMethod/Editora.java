package br.ufpb.FactoryMethod;

public class Editora {
	
	// O método empresas para obter objeto do tipo da empresa desejada
	public static Empresa empresas(String nomeEmpresa) {

		if (nomeEmpresa == null) return null;
		
		if (nomeEmpresa.equalsIgnoreCase("Marvel")) return new Marvel();
		
		if (nomeEmpresa.equalsIgnoreCase("DC")) return new DC();
		
		if (nomeEmpresa.equalsIgnoreCase("Shonen Jump")) return new ShonenJump();
		
		return null;
	}
}