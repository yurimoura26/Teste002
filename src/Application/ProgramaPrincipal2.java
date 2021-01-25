package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entidades.Funcionario;
import Entidades.Funcionario_Ter;

public class ProgramaPrincipal2 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		
		List<Funcionario> f = new ArrayList<>();
		
		System.out.print("Informe quantos Funcionarios: ");
		int n = ler.nextInt();
		System.out.println();
		
		for(int i = 0 ; i < n ; i++) {
			System.out.println("Funcionarios #"+i+":");
			System.out.print("Funcionarios Terceirizado (s/n) ? ");
			char x = ler.next().charAt(0);
		
			ler.nextLine();
			System.out.print("Informe o nome do Funcionarios: ");
			String nome = ler.nextLine();
			
			System.out.print("Informe as Horas trabalhadas: ");
			int h = ler.nextInt();
			System.out.print("Informeo valor da hora: ");
			Double vh = ler.nextDouble();
			
			if((x == 's') || (x == 'S') ){
				
				System.out.print("Informe o valor adicional : ");
				Double vha = ler.nextDouble();
				Funcionario fun = new Funcionario_Ter(nome, h, vh, vha);
				f.add(fun);
			}
			else {
				Funcionario fun = new Funcionario(nome, h, vh);
				f.add(fun);
			}
		}
		System.out.println();
		for(Funcionario func: f) {
			System.out.println(func.getNome()+" - R$"+ String.format("%.2f", func.pagamento())  );
		}
		
		
		
	ler.close();	
	}
}
