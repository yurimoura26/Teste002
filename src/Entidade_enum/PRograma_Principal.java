package Entidade_enum;

import java.util.Locale;
import java.util.Scanner;

import Entidades.Conta;
import Entidades.Conta_Emp;
import Entidades.Conta_Poup;

public class PRograma_Principal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);		
		
		Conta conta = new Conta("Joaão", 0001, 1000.0);
		conta.saqueSaldo(200.0);
		System.out.println(conta.getSaldo());
		
		Conta cb = new Conta_Poup("joao", 1020, 1000.0, 0.01);
		cb.saqueSaldo(200.0);
		System.out.println(cb.getSaldo());
		
		Conta ce = new Conta_Emp("joao", 1020, 1000.0, 1000.0);
		ce.saqueSaldo(200.0);
		System.out.println(ce.getSaldo());
		
//		UPCASTING = 
		
//				
//		Conta c1 = ce;
//		Conta c2 = new Conta_Emp("joao", 1020, 0.0, 500.0);
//		Conta c3 = new Conta_Poup("joao", 1030, 0.0, 0.01);
//		

	ler.close();	
	}
}
