package chap11.sec16_exam01_localdate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class DateTimeInfoExample {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
		String strDateTime = now.getYear()+"��";
		strDateTime += now.getMonth().getValue()+"��";
		strDateTime += now.getDayOfMonth()+"��(";
		strDateTime += now.getDayOfWeek()+") ";
		strDateTime += now.getHour()+"��";
		strDateTime += now.getMinute()+"��";
		strDateTime += now.getSecond()+"��";
		
		System.out.println(strDateTime +"\n");
		
		LocalDate nowDate = now.toLocalDate();
		if(nowDate.isLeapYear()) {//
			System.out.println("���ش� ����: 2���� 29�� ���� �Դϴ�.");
		}else {
			System.out.println(" ���ش� ���: 2���� 28�� ���� �Դϴ�.");
		}
		
		//���� ����ÿ� ��������
		ZonedDateTime utcDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println("���� �����:"+ utcDateTime);
		
		ZonedDateTime seoulDateTime = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
		System.out.println("���� Ÿ����:"+ seoulDateTime);
		
		ZoneId seoulZoneId = seoulDateTime.getZone();
		System.out.println("���� Ÿ����:"+ seoulZoneId);
		
		ZoneOffset seoulZoneOffset = seoulDateTime.getOffset();
		System.out.println("���� ������:"+ seoulZoneOffset);
		
		
		

	}

}
