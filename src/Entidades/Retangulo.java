package Entidades;

import Entidade_enum.Color;

public class Retangulo extends Formas {

	private Double lado;
	private Double altura;
	
	public Retangulo() {
		super();
	}
	
	
	public Retangulo(Color cor, Double lado, Double altura) {
		super(cor);
		this.lado = lado;
		this.altura = altura;
	}
		public Double getLado() {
		return lado;
	}

	public void setLado(Double lado) {
		this.lado = lado;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return altura * lado ;
	}

	
}
