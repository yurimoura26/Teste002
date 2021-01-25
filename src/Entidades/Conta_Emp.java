package Entidades;

public class Conta_Emp extends Conta {
	
	private Double limite;
	
	public Conta_Emp() {
		super();
	}

	public Conta_Emp(String nome, Integer numero, Double saldo, Double limite) {
		super(nome, numero, saldo);
		this.limite = limite;
	}

	public Double getLimite() {
		return limite;
	}

	public void setLimite(Double limite) {
		this.limite = limite;
	}
	
	public void emprestimo(double emp) {
		if(emp <= limite) {
			depositoSaldo(emp);
		}
	}
	@Override
	public void saqueSaldo(Double saque) {
		super.saqueSaldo(saque);
		saldo -=  2.0;
	}
	
	
	
}
