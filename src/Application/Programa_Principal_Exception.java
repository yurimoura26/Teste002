package Application;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import Entidades.Reserva;

public class Programa_Principal_Exception {
	
	public static void main(String[] args)  throws ParseException{
	
		Scanner ler = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Numero do quarto: ");
		int numero = ler.nextInt();
		System.out.println();
		Date entrada = sdf.parse(ler.next());
		System.out.println();
		Date saida = sdf.parse(ler.next());
		
		if(!saida.after(entrada)) {
			System.out.println("Data Invalida!! A data da saida esta antes da data da entrada");
		}else {
			Reserva reserva = new Reserva(numero, entrada, saida);
			System.out.println("Reserva: "+ reserva);
		

			System.out.println();
			System.out.println("Entre com os novos dados de reserva ");
			System.out.print("Data de Chegada: ");
			entrada = sdf.parse(ler.next());
			System.out.print("Data de Saida:  ");	
			saida = sdf.parse(ler.next());
				
			String error = reserva.novaData(entrada, saida);
			if (error != null) {
				System.out.println("______");
			}else {
				System.out.println("Reserva: "+ reserva);
			}
		}
		
	ler.close();	
	}

}
