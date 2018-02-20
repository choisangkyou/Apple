package chap11.sec15_exam03_messageformat;

import java.text.MessageFormat;

public class MessageFormatExample {

	public static void main(String[] args) {
		String id = "'java'";
		String name="ȫ�浿";
		String tel ="010-1234-5678";
		
		String text = "ȸ��ID:{0} \t �̸�:{1} \t ��ȭ:{2} ";
		String result = MessageFormat.format(text, id,name,tel);
		System.out.println(result);
		
		String sql = "insert into table values({0},{1},{2})";
		Object[] arguments = {id,name,tel};
		result = MessageFormat.format(sql, arguments);
		System.out.println(result);

	}

}
