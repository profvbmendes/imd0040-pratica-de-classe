package br.ufrn.imd;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class JavaDates {

	public static void main(String[] args) {
		LocalDate dateNow = LocalDate.now();
		System.out.println(dateNow);
		LocalDate independenciaDoBrasil = LocalDate.of(1822, 9, 7);
		LocalDate proximaComemoracaoIndependencia = independenciaDoBrasil.withYear(dateNow.getYear());

		System.out.println("Dias desde a independência do Brasil: " + Period.between(LocalDate.of(2021, 3, 2), LocalDate.of(2021, 3, 25)).getDays());
		System.out.println("Dias desde a independência do Brasil: " + Period.between(LocalDate.of(2021, 3, 2), LocalDate.of(2021, 4, 25)).getDays());
		System.out.println("Dias desde a independência do Brasil: " + ChronoUnit.MONTHS.between(independenciaDoBrasil, dateNow));
		
		if (proximaComemoracaoIndependencia.isBefore(dateNow)) {
			proximaComemoracaoIndependencia = proximaComemoracaoIndependencia.plusYears(1);
		}

		LocalDate dataInvalida = LocalDate.of(2021, 1, 30).plusMonths(1);
		System.out.println("A independência do Brasil foi em " + formatarDataParaImprimir(independenciaDoBrasil));
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Digite uma data no formato dd/MM/yyyy");
		Scanner in = new Scanner(System.in);
		String dataString = in.nextLine();
		System.out.println("Você digitou: " + dataString);
		LocalDate data = LocalDate.parse(dataString, dtf);
		System.out.println("Data: " + data);
		System.out.println("Data formatada: " + dtf.format(data));
	}
	
	public static String formatarDataParaImprimir(LocalDate data) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/yyyy");
		
		return formatter.format(data);
	}

}
