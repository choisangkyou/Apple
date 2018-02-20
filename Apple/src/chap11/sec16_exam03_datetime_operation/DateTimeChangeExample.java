package chap11.sec16_exam03_datetime_operation;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;

public class DateTimeChangeExample {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
		LocalDateTime targetDateTime = null;
		
		//직접변경
		targetDateTime = now
				.withYear(2024)
				.withMonth(10)
				.withDayOfMonth(5)
				.withHour(13)
				.withMinute(30)
				.withSecond(20);
		System.out.println(targetDateTime);
		
		//년도 상대 변경
		targetDateTime = now.with(TemporalAdjusters.firstDayOfYear());
		System.out.println("이번 해의 첫 일:"+ targetDateTime);
		
		//월 상대변경
		targetDateTime = now.with(TemporalAdjusters.firstDayOfMonth());
		System.out.println("이번 달의 첫 일:"+ targetDateTime);
		
		//요일 상대 변경
		targetDateTime = now.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
		System.out.println("이번 달의 첫 월요일:"+ targetDateTime);
	}

}
