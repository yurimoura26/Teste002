package Entidades;

public class Funcionario_Ter extends Funcionario {

	private Double pagamentoadd;
	
	public Funcionario_Ter() {
		
	}
		public Funcionario_Ter(String nome, Integer horas, Double valorHoras, Double pagamentoadd) {
		super(nome, horas, valorHoras);
		this.pagamentoadd = pagamentoadd;
	}


	public Double getPagamentoadd() {
		return pagamentoadd;
	}

	public void setPagamentoadd(Double pagamentoadd) {
		this.pagamentoadd = pagamentoadd;
	}
	@Override
	public Double pagamento() {
		return super.pagamento() + pagamentoadd * 1.1;
	}
}
