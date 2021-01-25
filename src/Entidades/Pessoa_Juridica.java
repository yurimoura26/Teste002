package Entidades;

public class Pessoa_Juridica extends Contribuinte{

	private Integer nFunc;
	
	public Pessoa_Juridica () {
		
	}
	
	public Pessoa_Juridica(String nome, Double rendaAnual, Integer nFunc) {
		super(nome, rendaAnual);
		this.nFunc = nFunc;
	}
	
	public Integer getnFunc() {
		return nFunc;
	}

	public void setnFunc(Integer nFunc) {
		this.nFunc = nFunc;
	}

	@Override
	public Double valorTotal() {
	
		if(nFunc <= 10) {
			return (super.getRendaAnual() * 0.16);
		}else {
			return (super.getRendaAnual() * 0.14);
		}
		
	 }
}
