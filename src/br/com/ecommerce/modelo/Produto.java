package br.com.ecommerce.modelo;

public class Produto {

	private int codigo;
	private String descricao;
	private int qtde;
	private float valorVenda;
	private float valorCompra;

	public Produto() {
		super();
	}

	public Produto(int codigo, String descricao, int qtde, float valorVenda, float valorCompra) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.qtde = qtde;
		this.valorVenda = valorVenda;
		this.valorCompra = valorCompra;
	}
	
	public void setAll(int codigo, String descricao, int qtde, float valorVenda, float valorCompra) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.qtde = qtde;
		this.valorVenda = valorVenda;
		this.valorCompra = valorCompra;
	}
	
	public String getAll() {
		return
				"Código: " + codigo + "\n" +
				"Descrição: " + descricao + "\n" +
				"Quantidade: " + qtde + "\n" +
				"Valor de Venda: " + valorVenda + "\n" +
				"Valor de Compra: " + valorCompra;
	}

	// <modificador> <retorno> <nomeDoMetodo>(<tipoParametro> <nomeDoParametro>...) {}
	
	public float retornarTotalVenda() {
		return qtde * valorVenda;
	}
	
	public float retornarTotalCompra() {
		return qtde * valorCompra;
	}
	
	public float retornarValorAVista() {
		return valorVenda * 0.9f;
	}
	
	public float retornarParcela(float pParcelas) {
		return valorVenda / pParcelas;
	}
	
	public void atualizarValores(float pPorcentagem) {
		valorVenda = valorVenda + ((valorVenda * pPorcentagem) / 100);
	}
	
	public void novoValorAVista(float pPorcentagem) {
		valorVenda = (valorVenda - ((valorVenda * pPorcentagem) / 100));
	}
	
	public float retornarNovoValorAVista() {
		return valorVenda;
	}
	
	public int retornarCodigo() {
		return codigo;
	}
	
	public void preencherCodigo(int pCodigo) {
		if (pCodigo > 0) {
			codigo = pCodigo;
		}
	}

	public String retornarDescricao() {
		return descricao;
	}

	public void preencherDescricao(String pDescricao) {
		descricao = pDescricao;
	}

	public int retornarQtde() {
		return qtde;
	}

	public void preencherQtde(int pQtde) {
		if (pQtde > 0) {
			qtde = pQtde;
		}
	}

	public float retornarValorVenda() {
		return valorVenda;
	}

	public void preencherValorVenda(float pValorVenda) {
		if (pValorVenda > 0) {
			valorVenda = pValorVenda;			
		}
	}

	public float retornarValorCompra() {
		return valorCompra;
	}

	public void preencherValorCompra(float pValorCompra) {
		valorCompra = pValorCompra;
	}	
}
