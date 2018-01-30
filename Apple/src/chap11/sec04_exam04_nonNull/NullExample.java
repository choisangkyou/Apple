package chap11.sec04_exam04_nonNull;

import java.util.Objects;
import java.util.function.Supplier;

public class NullExample {

	public static void main(String[] args) {
		String str1 = "홍길동";
		String str2 = null;
		
		System.out.println(Objects.nonNull(str1));
		System.out.println(Objects.nonNull(str2));
	
		System.out.println(Objects.requireNonNull(str1));
		
		try {
			System.out.println(Objects.requireNonNull(str2));
		}catch (NullPointerException e) { System.out.println("null 입니다.");}
		System.out.println();
		
		try {
			System.out.println(Objects.requireNonNull(str2, "이름이 없습니다."));
		}catch (Exception e) {
			System.out.println(e.getMessage());}
		
		System.out.println();
		
		try {
			System.out.println(Objects.requireNonNull(str2, ()->"이름이 없다니깐요."));
		}catch (Exception e) {
			System.out.println(e.getMessage());}
		
		//etc
		Supplier<String> sp = ()-> "Java8 lambda Expression";
		System.out.println(sp.get());
		
	}

}
