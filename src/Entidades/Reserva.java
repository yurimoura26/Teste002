package Entidades;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reserva {

	private Integer nQuarto;
	private Date entrada;
	private Date saida;

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public Reserva(Integer nQuarto, Date entrada, Date saida) {
		super();
		this.nQuarto = nQuarto;
		this.entrada = entrada;
		this.saida = saida;
	}

	public Integer getnQuarto() {
		return nQuarto;
	}

	public void setnQuarto(Integer nQuarto) {
		this.nQuarto = nQuarto;
	}

	public Date getEntrada() {
		return entrada;
	}

	public Date getSaida() {
		return saida;
	}

	public long duracao() {
		long diferi = saida.getTime() - entrada.getTime();
		return TimeUnit.DAYS.convert(diferi, TimeUnit.MILLISECONDS);
	}

	public String novaData(Date entrada, Date saida) {

		Date atual = new Date();
		if (entrada.before(atual) || (saida.before(atual))) {
			return "Erro: Datas das Reservas informadas devem ser datas futuras";
		}
		if (!saida.after(entrada)) {
			return "Data Invalida!! A data da saida esta antes da data da entrada";
		}
		this.entrada = entrada;
		this.saida = saida;
		return null;
	}

	@Override
	public String toString() {
		return "Quarto " + nQuarto + ", Entrada: " + sdf.format(entrada) + ",  Saida: " + sdf.format(saida) + ", "
				+ duracao() + " Noites.";
	}

}
