package Application;


import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entidade_enum.Color;
import Entidades.Circulo;
import Entidades.Formas;
import Entidades.Retangulo;

public class Programa_Principal3 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		List<Formas> forma = new ArrayList<>();
		
		
		System.out.println("Quantas formas? ");
		int n =ler.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println(i+"º forma: ");
			System.out.println("É circulo ou retangulo: ");
			char x = ler.next().charAt(0);
			System.out.println("Qual a cor Preto,Azul,Vermelho ");
			Color cor = Color.valueOf(ler.next());
			
			if ((x == 'r')||(x == 'R')) {
				System.out.println("Altura: ");
				Double a = ler.nextDouble();
				System.out.println("Base: ");
				Double b = ler.nextDouble();
				Formas reta = new Retangulo(cor, a, b);
				forma.add(reta);
			}else if((x == 'c')||(x == 'C')) {
				System.out.println("Raio: ");
				Double r = ler.nextDouble();
				forma.add(new Circulo(cor, r));
			}else {
				System.out.println("Variavel sem Registro");
			}
		}
		
		
		for(Formas f:forma ) {
			System.out.println(String.format("%.2f", f.area())+"\n");
		}
		
		
		
		
		
	ler.close();	
	}
}
