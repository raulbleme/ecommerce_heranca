package br.com.ecommerce.modelo;

public class Cliente {
	private int codigo;
	private String nome;
	private String email;
	private String fone;
	private String cpf;
	private float limite;
	
	//metodo construtor vazio
	public Cliente() {
		
	}
	
	//metodo construtor com setters
	public Cliente(int codigo, String nome, String email, String fone, String cpf, float limite) {
		this.codigo = codigo;
		this.nome = nome;
		this.email = email;
		this.fone = fone;
		this.cpf = cpf;
		this.limite = limite;
	}
	
	public void setAll(int codigo, String nome, String email, String fone, String cpf, float limite) {
		this.codigo = codigo;
		this.nome = nome;
		this.email = email;
		this.fone = fone;
		this.cpf = cpf;
		this.limite = limite;
	}
	
	public String getAll() {
		return "Codigo: " + codigo + "\n" +
			"Nome: " + nome + "\n" +
			"e-mail: " + email + "\n" + 
			"Telefone: " + fone + "\n" + 
			"CPF: " + cpf + "\n" + 
			"Limite: " + limite;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public float getLimite() {
		return limite;
	}
	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	
}
