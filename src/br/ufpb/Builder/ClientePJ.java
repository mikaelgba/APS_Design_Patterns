package br.ufpb.Builder;

public class ClientePJ extends Cliente{
	
	private String cnpj;
	private String razaoSocial;
	
	public ClientePJ(String cnpj, String razaoSocial) {
		this.cnpj= cnpj;
		this.razaoSocial = razaoSocial;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	@Override
	public String toString() {
		return "ClientePJ [cnpj = " + cnpj + ", razaoSocial = " + razaoSocial + "]";
	}
}