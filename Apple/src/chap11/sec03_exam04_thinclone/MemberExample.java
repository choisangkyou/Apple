package chap11.sec03_exam04_thinclone;

public class MemberExample {

	public static void main(String[] args) {
		//원본 객체 생성
		Member original = new Member("blue","홍길동","12345",25,true);
		
		//복제 객체를 얻은 후에 패스워드 변경
		Member cloned = original.getMember();
		cloned.password = "67890";
		
		System.out.println("[복제 객체의 필드값");
		System.out.println("id:"+ cloned.id);
		System.out.println("cloned-password:"+cloned.password);
		System.out.println("original-password:"+ original.password);
	}

}
