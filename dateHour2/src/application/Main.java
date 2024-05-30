package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {

	public static void main(String[] args) {

		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(ZoneId.systemDefault());
		
		LocalDate d01 = LocalDate.parse("2024-05-29"); 
		LocalDateTime d02 = LocalDateTime.parse("2024-05-29T12:55:21");
		Instant d03 = Instant.parse("2024-05-29T15:55:21Z");
		
		System.out.println("d01 = " + d01.format(fmt1));
		System.out.println("d02 = " + d02.format(fmt2));
		System.out.println("d03 = " + fmt3.format(d03));
		
		System.out.println("d01 = dia: " + d01.getDayOfMonth());
		System.out.println("d01 = mes: " + d01.getMonthValue());
		System.out.println("d01 = ano: " + d01.getYear());
		System.out.println("d01 = dia do ano: " + d01.getDayOfYear());
		
		System.out.println("d02 = hora" + d02.getHour());
		System.out.println("d02 = minuto" + d02.getMinute());
		System.out.println("d02 = dia da semana: " + d02.getDayOfWeek());
		
		LocalDateTime pastWeekDateTime = d02.minusDays(7);
		LocalDateTime nextWeekDateTime = d02.plusDays(7);
		
		System.out.println("PastWeekDateTime = " + pastWeekDateTime);
		System.out.println("NextWeekDateTime = " + nextWeekDateTime);
		
		Instant pastWeekInstant = d03.minus(7, ChronoUnit.DAYS);
		Instant nextWeekInstant = d03.plus(7, ChronoUnit.DAYS);
		
		System.out.println("PastWeekInstant = " + pastWeekInstant);
		System.out.println("NextWeekInstant = " + nextWeekInstant);
		
		Duration t1 = Duration.between(pastWeekDateTime, d02);
		Duration t2 = Duration.between(pastWeekInstant, nextWeekInstant);
		Duration t3 = Duration.between(d01.minusDays(7).atTime(0, 0), d01.atTime(0, 0));
		
		System.out.println("PastWeekDateTime to d02 = " + t1.toDays());
		System.out.println("pastWeekInstant to NextWeekInstant = " + t2.toDays());
		System.out.println("Duration between 2 LocalDate's: " + t3.toDays());
		
	}
}