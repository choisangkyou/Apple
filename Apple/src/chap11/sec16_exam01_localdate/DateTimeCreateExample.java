package chap11.sec16_exam01_localdate;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DateTimeCreateExample {

	public static void main(String[] args) {
		LocalDate currDate = LocalDate.now();
		System.out.println(currDate);
		
		LocalTime currTime = LocalTime.now();
		System.out.println(currTime);
		
		Instant instant1 = Instant.now();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Instant instant2 = Instant.now();
		if(instant1.isBefore(instant2))
			System.out.println("instant1�� �����ϴ�.");
		else if (instant1.isAfter(instant2))
			System.out.println("instant1�� �����ϴ�.");
		else
			System.out.println("������ �ð��Դϴ�.");
		
		//�νð��� ����
		System.out.println("����(nano):"+instant1.until(instant2, ChronoUnit.NANOS));
	
		
	}

}
