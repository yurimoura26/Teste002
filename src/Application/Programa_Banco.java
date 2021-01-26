package Application;

import java.util.Locale;
import java.util.Scanner;

public class Programa_Banco {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
	   try {
			System.out.println("Entre com os dados da Conta ");
			System.out.print("Numero: ");
			int num = ler.nextInt();
			System.out.print("Titular: ");
			String nome = ler.next();
			System.out.print("Saldo Inicial: ");
			Double valorSal = ler.nextDouble();
			System.out.print("Limite de Saque: ");
			Double valorSaq = ler.nextDouble();
			System.out.println();
			System.out.print("Informe o valor do saque: ");
			System.out.println();
	   }
	   catch() {
		   System.out.println();
	   }
	ler.close();	
	}

}
