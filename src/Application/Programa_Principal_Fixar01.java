package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entidades.Contribuinte;
import Entidades.Pessoa_Fisica;
import Entidades.Pessoa_Juridica;

public class Programa_Principal_Fixar01 {
	public static void main (String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		List<Contribuinte> lista = new ArrayList<>();
		
		System.out.print("Informe o numero de quantos vão pagar");
		int n = ler.nextInt();
	
		for(int i=1; i<=n; i++) {
			System.out.println("Tax payer #"+i+"data:");
			
			System.out.print("Individual or company (i/c)? ");
			char x = ler.next().charAt(0);
			System.out.print("Name: ");
			String nome = ler.next();
			System.out.print("Anual income:");
			Double rA = ler.nextDouble();
			
			if((x == 'i')||(x == 'X')) {
				System.out.print("Health expenditures:");
				Double gS = ler.nextDouble();	
				Contribuinte con = new Pessoa_Fisica(nome, rA, gS);
				lista.add(con);
			}else if((x == 'c') || (x == 'C')) {
				System.out.print("Number of employees:");
				Integer f = ler.nextInt();
				Contribuinte con1 = new Pessoa_Juridica(nome, rA, f);
				lista.add(con1);			
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID:");
		double soma = 0.0;
		for (Contribuinte c: lista) {
			 soma = soma + c.valorTotal();
			System.out.println(c.getNome()+": R$ "+ String.format("%.2f", c.valorTotal()));
		
		}
		
		
		System.out.println();
		System.out.printf("Total a Pagar: R$ %.2f%n",soma);
		
		ler.close();	
	}
}
