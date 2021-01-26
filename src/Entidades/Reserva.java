package Entidades;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import modelException.DomainException;

public class Reserva {

	private Integer nQuarto;
	private Date entrada;
	private Date saida;

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public Reserva(Integer nQuarto, Date entrada, Date saida) {
		if (!saida.after(entrada)) {
			throw new DomainException( "Data Invalida!! A data da saida esta antes da data da entrada");
		}
		
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

	public void novaData(Date entrada, Date saida) {

		Date atual = new Date();
		if (entrada.before(atual) || (saida.before(atual))) {
			throw new DomainException( "Erro: Datas das Reservas informadas devem ser datas futuras");
		}
		if (!saida.after(entrada)) {
			throw new DomainException( "Data Invalida!! A data da saida esta antes da data da entrada");
		}
		this.entrada = entrada;
		this.saida = saida;
	}

	@Override
	public String toString() {
		return "Quarto " + nQuarto + ", Entrada: " + sdf.format(entrada) + ",  Saida: " + sdf.format(saida) + ", "
				+ duracao() + " Noites.";
	}

}
