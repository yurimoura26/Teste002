package Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entidades.Produto;
import Entidades.Produto_Importado;
import Entidades.Produto_Usado;

public class ProgramaPrincipal3 {
	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
		List<Produto> prod = new ArrayList<>();

		System.out.print("Quantos produtos são? ");
		int n = ler.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Produto #" + i + ":");
			System.out.println();
			System.out.print("O produto comum, usado ou importado(c/u/i)? ");
			char x = ler.next().charAt(0);
			System.out.println("Qual o Nome: ");
			String nome = ler.next();
			System.out.println("Qual o Preço ");
			Double valor = ler.nextDouble();

			if ((x == 'i') || (x == 'I')) {
				System.out.println("Quanto é a taxa ? ");
				Double taxa = ler.nextDouble();
				Produto pi = new Produto_Importado(nome, valor, taxa);
				prod.add(pi);
			} else if ((x == 'u') || (x == 'U')) {
				System.out.print("Qual a data de fabricação? ");
				Date data = sdf.parse(ler.next());
				Produto pu = new Produto_Usado(nome, valor, data);
				prod.add(pu);
			} else {
				Produto p = new Produto(nome, valor);
				prod.add(p);
			}

		}

		System.out.println("Etiqueta de Preço:");

		for (Produto produto : prod) {
			System.out.println(produto.etiquetaPre() + "\n");
		}

		ler.close();
	}
}
