package Entidades;

public class Conta_001 {
	private Integer numero;
	private String titular;
	private Double saldo;
	private Double limite;
	
	public Conta_001() {
		
	}

	public Conta_001(Integer numero, String titular, Double saldo, Double limite) {
		super();
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
		this.limite = limite;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Double getSaldo() {
		return saldo;
	}

	public Double getLimite() {
		return limite;
	}
	
	public void deposito(Double valor ) {
		this.saldo += valor;
	}
	public void saque(Double valor) {
		this.saldo -= valor;
	}
}
