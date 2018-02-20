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
			strWeek = "월";
			break;
		case Calendar.TUESDAY:
			strWeek = "화";
			break;
		case Calendar.WEDNESDAY:
			strWeek = "수";
			break;
		case Calendar.THURSDAY:
			strWeek = "목";
			break;
		case Calendar.FRIDAY:
			strWeek = "금";
			break;
		case Calendar.SATURDAY:
			strWeek = "토";
			break;
		case Calendar.SUNDAY://index 1
			strWeek = "일";
			break;
		default :
			strWeek ="Null";
			break;
			
		}
		
	
		int amPm = now.get(Calendar.AM_PM);
		String strAmPm = null;
		if(amPm == Calendar.AM)
			strAmPm = "오전";
		else
			strAmPm = "오후";
		
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		System.out.print("Calender:\t");
		System.out.print(year+"년 ");
		System.out.print(month+"월 ");
		System.out.print(day+"일 ");
		System.out.print(strWeek+"요일 ");
		System.out.print(strAmPm+" ");
		System.out.print(hour+"시 ");
		System.out.print(minute+"분 ");
		System.out.println(second+"초");
		
		
		System.out.print("SimpleDateFormat:");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 a hh시 mm분 ss초");//ref Class:java.text.SimpleDateFormat
		String strNow = sdf.format(new Date());
		System.out.println(strNow);
	}

}
