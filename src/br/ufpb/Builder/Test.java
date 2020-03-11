package br.ufpb.Builder;

class Test {

	
	@org.junit.jupiter.api.Test
	void test1() {
		Produto Corote =  new Produto("Corote",10.00);
		Produto Derby =  new Produto("Derby",2.50);
		Venda venda1 = new VendaBuilder()
				.data("10/03/20")
				.ClientePJ("Beto Cachaçeiro","11111")
				.item(3,Corote)
				.item(5,Derby)
				.Funcionario("Damiao, Dono do Bar")
				.Frete(100)
				.Build();
	}
	@org.junit.jupiter.api.Test
	void test2() {
		Produto banana =  new Produto("Banana maca",1.00);
		Produto maca =  new Produto("maca",0.80);
		Venda venda2 = new VendaBuilder()
				.data("10/03/20")
				.ClientePF("Jose","000000")
				.item(3,banana)
				.item(5,maca)
				.Funcionario("João")
				.Frete(150)
				.Build();
	}
}