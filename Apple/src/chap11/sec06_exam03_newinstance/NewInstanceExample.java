package chap11.sec06_exam03_newinstance;

public class NewInstanceExample {

	public static void main(String[] args) {
		try {
			//Class clazz = Class.forName("chap11.sec06_exam03_newinstance.SendAction");
			Class clazz = Class.forName("chap11.sec06_exam03_newinstance.ReceiveAction");
			
			Action action = (Action)clazz.newInstance();
			action.execute();

		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			
		}
		

	}

}
