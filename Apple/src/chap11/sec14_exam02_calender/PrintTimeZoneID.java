package chap11.sec14_exam02_calender;

import java.util.TimeZone;

public class PrintTimeZoneID {

	public static void main(String[] args) {
		String[] availableIDs = TimeZone.getAvailableIDs();
		System.out.println("TimeZoneCount:"+ availableIDs.length);
		for(String id : availableIDs) {
			if(id.contains("Seoul")) {
				System.out.println(id+":"+TimeZone.getTimeZone(id));
			}
		}

	}

}
