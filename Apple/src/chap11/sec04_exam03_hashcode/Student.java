package chap11.sec04_exam03_hashcode;

import java.util.Objects;

public class Student {
	private String name;
	private int age;
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name+age);
	
	}
}
