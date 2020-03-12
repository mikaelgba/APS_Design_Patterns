package br.ufpb.Builder;
import static org.junit.Assert.*;

class Test {

	
	@org.junit.jupiter.api.Test
	void test1() {
		Produto Corote =  new Produto("Corote",10.00);
		Produto Derby =  new Produto("Derby",2.50);
		Venda venda1 = new VendaBuilder()
				.data("10/03/20")
				.ClientePJ("11111", "Beto Cachaçeiro")
				.item(3,Corote)
				.item(5,Derby)
				.Funcionario("Damiao, Dono do Bar")
				.Frete(100)
				.Build();
		
		assertEquals("Venda [data = 10/03/20, "
				+ "itemVendidos = [ItemVenda [quantidade = 3, produto = Produto [descricao = Corote, preco = 10.0]], "
				+ "ItemVenda [quantidade = 5, produto = Produto [descricao = Derby, preco = 2.5]]], "
				+ "cliente = ClientePJ [cnpj = 11111, razaoSocial = Beto Cachaçeiro], "
				+ "funcionario = Funcionario [nome = Damiao, Dono do Bar], "
				+ "frete = Frete [valor = 100.0]]",venda1.toString());
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

		assertEquals("Venda [data = 10/03/20, "
				+ "itemVendidos = [ItemVenda [quantidade = 3, produto = Produto [descricao = Banana maca, preco = 1.0]], "
				+ "ItemVenda [quantidade = 5, produto = Produto [descricao = maca, preco = 0.8]]], "
				+ "cliente = ClientePF [nome = Jose, cpf = 000000], "
				+ "funcionario = Funcionario [nome = João], "
				+ "frete = Frete [valor = 150.0]]",venda2.toString());
	}
}