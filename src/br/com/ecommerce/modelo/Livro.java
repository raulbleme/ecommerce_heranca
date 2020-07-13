package br.com.ecommerce.modelo;

public class Livro extends Produto {

	private String editora;
	private String autor;
		
	public Livro() {
		super();
	}

	public Livro(int codigo, String descricao, int qtde, float valorVenda, float valorCompra, String editora,
			String autor) {
		super(codigo, descricao, qtde, valorVenda, valorCompra);
		this.editora = editora;
		this.autor = autor;
	}
	
	public void setAll(int codigo, String descricao, int qtde, float valorVenda, float valorCompra, String editora,
			String autor) {
		super.setAll(codigo, descricao, qtde, valorVenda, valorCompra);
		this.editora = editora;
		this.autor = autor;
	}
	
	public String getAll() {
		return
				"Código: " + super.retornarCodigo() + "\n" +
				"Descrição: " + super.retornarDescricao() + "\n" +
				"Quantidade: " + super.retornarQtde() + "\n" +
				"Valor de venda: " + super.retornarValorVenda() + "\n" +
				"Valor de compra: " + super.retornarValorCompra() + "\n" +
				"Editora: " + editora + "\n" +
				"Autor: " + autor;				
	}
	
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	
}
