package chap11.sec14_exam02_calender;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalenderExample {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH)+1;
		int day = now.get(Calendar.DAY_OF_MONTH);
		
		int week = now.get(Calendar.DAY_OF_WEEK);
		String strWeek = null;
		
		switch(week) {
		case Calendar.MONDAY: //index 2
			strWeek = "��";
			break;
		case Calendar.TUESDAY:
			strWeek = "ȭ";
			break;
		case Calendar.WEDNESDAY:
			strWeek = "��";
			break;
		case Calendar.THURSDAY:
			strWeek = "��";
			break;
		case Calendar.FRIDAY:
			strWeek = "��";
			break;
		case Calendar.SATURDAY:
			strWeek = "��";
			break;
		case Calendar.SUNDAY://index 1
			strWeek = "��";
			break;
		default :
			strWeek ="Null";
			break;
			
		}
		
	
		int amPm = now.get(Calendar.AM_PM);
		String strAmPm = null;
		if(amPm == Calendar.AM)
			strAmPm = "����";
		else
			strAmPm = "����";
		
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		System.out.print("Calender:\t");
		System.out.print(year+"�� ");
		System.out.print(month+"�� ");
		System.out.print(day+"�� ");
		System.out.print(strWeek+"���� ");
		System.out.print(strAmPm+" ");
		System.out.print(hour+"�� ");
		System.out.print(minute+"�� ");
		System.out.println(second+"��");
		
		
		System.out.print("SimpleDateFormat:");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� E���� a hh�� mm�� ss��");//ref Class:java.text.SimpleDateFormat
		String strNow = sdf.format(new Date());
		System.out.println(strNow);
	}

}
