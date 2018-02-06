package chap11.sec05_exam02_gc;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class GCExample {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		Employee  emp;
		emp = new Employee(1);
		emp = null;//쓰레기
		emp = new Employee(2);
		emp = new Employee(3);
		//emp = null;
		
		System.out.print("emp가 최종적으로 참조하는 사원번호:");
		try {
			System.out.println(emp.eno);
			System.out.println();
		}catch (NullPointerException e) {
			System.out.println("NullPointerException 발생");
		}
		System.gc();
		
		

	}

}

class Employee{
	public int eno;
	public Employee(int eno) {
		this.eno = eno;
		System.out.println(eno+"가 메모리에 생성됨");
		
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Employee"+ eno +"이 메모리에서 제거됨");
	}
}
