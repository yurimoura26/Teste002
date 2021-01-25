package Entidades;

public class Pessoa_Fisica extends Contribuinte{

	private Double gastoSaude;
	
	public  Pessoa_Fisica () {
		
	}

	public Pessoa_Fisica(String nome, Double rendaAnual, Double gastoSaude) {
		super(nome, rendaAnual);
		this.gastoSaude = gastoSaude;
	}

	public Double getGastoSaude() {
		return gastoSaude;
	}

	public void setGastoSaude(Double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}
	
	
	
	@Override
	public Double valorTotal() {
   Double nvalorf= 0.0;
		
		if((super.getRendaAnual() < 20000.00)) {
			nvalorf = (super.getRendaAnual() * 0.15);
		}else {
			nvalorf = (super.getRendaAnual() * 0.25);
		}
		nvalorf -= getGastoSaude()* 0.5;
		if (nvalorf <= 0.0) {
			nvalorf = 0.0;
		}
		return nvalorf;
	 }
	
	
}
