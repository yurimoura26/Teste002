package Entidades;

import Entidade_enum.Color;

public class Circulo extends Formas {

	private Double raio;
	
	public Circulo() {
		
	}
	
	public Circulo(Color cor, Double raio) {
		super(cor);
		this.raio = raio;
	}
	
	public Double getRaio() {
		return raio;
	}

	public void setRaio(Double raio) {
		this.raio = raio;
	}

	@Override
	public double area() {
		return Math.PI * raio * raio ;
	}

}
