package Entidades;

public class Produto_Importado extends Produto {
	
	private Double taxa;
	
	public Produto_Importado () {
		
	}

	public Produto_Importado(String nome, Double preco, Double taxa) {
		super(nome, preco);
		this.taxa = taxa;
	}

	public Double getTaxa() {
		return taxa;
	}

	public void setTaxa(Double taxa) {
		this.taxa = taxa;
	}
	@Override
	public String etiquetaPre() {
		return super.getNome()
			  + " R$ "
			  +String.format("%.2f", super.getPreco()+taxa)
			  +" (Custo da taxa: R$ "
			  +String.format("%.2f", taxa)
			  +")\n";
			  
	}

}
