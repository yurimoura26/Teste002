package Entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Produto_Usado extends Produto{

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
	
	private Date datafab;
	
	public Produto_Usado () {
		
	}

	public Produto_Usado(String nome, Double preco, Date datafab) {
		super(nome, preco);
		this.datafab = datafab;
	}

	public Date getDatafab() {
		return datafab;
	}

	public void setDatafab(Date datafab) {
		this.datafab = datafab;
	}
	@Override
	public String etiquetaPre() {
		return super.getNome()
			  + " (Usado) R$ "
			  +String.format("%.2f", super.getPreco())
			  +" (Data de fabricação:  "
			  +sdf.format(datafab)
			  +")\n";
			  
	}
}
