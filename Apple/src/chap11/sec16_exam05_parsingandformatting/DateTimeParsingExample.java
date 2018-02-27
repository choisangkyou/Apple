package chap11.sec16_exam05_parsingandformatting;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeParsingExample {

	public static void main(String[] args) {
		DateTimeFormatter formatter;
		LocalDate localDate;
		
		
		localDate = LocalDate.parse("2018-02-27");
		System.out.println(localDate);
		
		formatter = DateTimeFormatter.ISO_LOCAL_DATE; //ex)"2011-12-03"
		localDate = LocalDate.parse("2024-04-21", formatter);
		System.out.println(localDate);
		
		formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		localDate = LocalDate.parse("2024/05/21", formatter);
		System.out.println(localDate);
		
		formatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
		localDate = LocalDate.parse("2024.05.21", formatter);
		System.out.println(localDate);
		
		//DateTimeFormatExample
		LocalDateTime now = LocalDateTime.now();
		formatter = DateTimeFormatter.ofPattern("yyyy년 M월 d일 a h시 m분");
		String nowString = now.format(formatter);
		System.out.println(nowString);

	}

}
