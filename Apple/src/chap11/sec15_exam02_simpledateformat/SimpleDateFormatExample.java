package chap11.sec15_exam02_simpledateformat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatExample {

	public static void main(String[] args) {
		Date date = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(sdf.format(date));
		
		sdf = new SimpleDateFormat("yyy.MM.dd(E요일) a HH:mm:ss");
		System.out.println(sdf.format(date));
		
		sdf = new SimpleDateFormat("올해의 D번재 날");
		System.out.println(sdf.format(date));
		
		sdf = new SimpleDateFormat("이달의 d번재 날");
		System.out.println(sdf.format(date));

	}

}
