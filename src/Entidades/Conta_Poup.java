package Entidades;

public final class Conta_Poup extends Conta{

	private Double taxaJuros;
	
	public Conta_Poup() {
		super();
	}

	public Conta_Poup(String nome, Integer numero, Double saldo, Double taxaJuros) {
		super(nome, numero, saldo);
		this.taxaJuros = taxaJuros;
	}

	public Double gettaxaJuros() {
		return taxaJuros;
	}

	public void settaxaJuros(Double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}
	public void AtualizaPoup() {
		saldo += saldo * taxaJuros;
	}
	
	@Override
	public void saqueSaldo(Double saque) {
		saldo -= saque;
	}
}
