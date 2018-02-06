package chap11.sec05_exam02_gc;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class GCExample {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		Employee  emp;
		emp = new Employee(1);
		emp = null;//������
		emp = new Employee(2);
		emp = new Employee(3);
		//emp = null;
		
		System.out.print("emp�� ���������� �����ϴ� �����ȣ:");
		try {
			System.out.println(emp.eno);
			System.out.println();
		}catch (NullPointerException e) {
			System.out.println("NullPointerException �߻�");
		}
		System.gc();
		
		

	}

}

class Employee{
	public int eno;
	public Employee(int eno) {
		this.eno = eno;
		System.out.println(eno+"�� �޸𸮿� ������");
		
	}
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Employee"+ eno +"�� �޸𸮿��� ���ŵ�");
	}
}
