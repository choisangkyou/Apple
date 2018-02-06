package chap11.sec05_exam04_getproperty;

import java.util.Properties;
import java.util.Set;

public class GetPropertyExample {

	public static void main(String[] args) {
		String osName = System.getProperty("os.name");
		System.out.println("OS Name :"+ osName);
		
		//all of key:values..
		Properties props = System.getProperties();
		Set keys = props.keySet();
		
		for(Object object : keys) {
			String key = (String)object;
			String value = System.getProperty(key);
			System.out.println("["+key+"]:"+ value);
		}
	}

}
