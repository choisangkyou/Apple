package chap11.sec16_confirm_examples;

public class Student {
	private String studentNum;
	
	public Student(String stdNum) {
		this.studentNum = stdNum;
	}

	public String getStudentNum() {
		return studentNum;
	}
	
@Override
	public boolean equals(Object obj) {
		if(obj.equals(studentNum))
			return true;
		return false;
	}	

	@Override
	public int hashCode() {
		return studentNum.hashCode();
	}
}
