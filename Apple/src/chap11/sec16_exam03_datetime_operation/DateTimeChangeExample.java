package chap11.sec16_exam03_datetime_operation;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;

public class DateTimeChangeExample {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
		LocalDateTime targetDateTime = null;
		
		//��������
		targetDateTime = now
				.withYear(2024)
				.withMonth(10)
				.withDayOfMonth(5)
				.withHour(13)
				.withMinute(30)
				.withSecond(20);
		System.out.println(targetDateTime);
		
		//�⵵ ��� ����
		targetDateTime = now.with(TemporalAdjusters.firstDayOfYear());
		System.out.println("�̹� ���� ù ��:"+ targetDateTime);
		
		//�� ��뺯��
		targetDateTime = now.with(TemporalAdjusters.firstDayOfMonth());
		System.out.println("�̹� ���� ù ��:"+ targetDateTime);
		
		//���� ��� ����
		targetDateTime = now.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
		System.out.println("�̹� ���� ù ������:"+ targetDateTime);
	}

}
