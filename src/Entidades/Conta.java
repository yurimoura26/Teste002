package Entidades;

public class Conta {

	private String nome;
	private Integer numero;
	protected Double saldo;
	
	public Conta() {
		
	}

	public Conta(String nome, Integer numero, Double saldo) {
		super();
		this.nome = nome;
		this.numero = numero;
		this.saldo = saldo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public Double getSaldo() {
		return saldo;
	}
	public void saqueSaldo(Double saque) {
		saldo -= saque + 5.0;
	}
	public void depositoSaldo(Double saque) {
		saldo += saque;
	}
	
}
