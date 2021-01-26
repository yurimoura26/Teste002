package Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import Entidades.Reserva;
import modelException.DomainException;

public class Programa_Principal_Exception {
	
	public static void main(String[] args) {
	
		Scanner ler = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			System.out.print("Numero do quarto: ");
			int numero = ler.nextInt();
			System.out.println("Data de Chegada: ");
			Date entrada = sdf.parse(ler.next());
			System.out.println("Data de Saida:  ");
			Date saida = sdf.parse(ler.next());
			
		
			Reserva reserva = new Reserva(numero, entrada, saida);
			System.out.println("Reserva: "+ reserva);
		
			System.out.println();
			System.out.println("Entre com os novos dados de reserva ");
			System.out.print("Data de Chegada: ");
			entrada = sdf.parse(ler.next());
			System.out.print("Data de Saida:  ");	
			saida = sdf.parse(ler.next());
			
			reserva.novaData(entrada, saida);
			System.out.println("Reserva: "+ reserva);
		}
		catch(ParseException erro) {
			System.out.println("Data invalida! ");
		}
		catch(DomainException erro) {
			System.out.println("Erro na reserva : "+erro.getMessage());
		}
		catch(RuntimeException erro) {
			System.out.println("Erro Inesperado no Cadastro da reserva ");
		}
		
		
		
		
	ler.close();	
	}

}
