package Entidades;

import Entidade_enum.Color;

public abstract class Formas {

	private Color cor;

	public Formas() {
		
	}
    
	public Formas(Color cor) {
		super();
		this.cor = cor;
	}

	public Color getCor() {
		return cor;
	}

	public void setCor(Color cor) {
		this.cor = cor;
	}
	public abstract double area();
}
