package swing.exam02_event;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class InnerClassListener extends JFrame{
	static JButton btn;
	
	public InnerClassListener() {
		setTitle("이벤트 예제");
		setLayout(new FlowLayout());
		
		btn = new JButton("Action");
		add(btn);
		
		//이벤트 리스너 객체 생성
		MyActionListener listener = new MyActionListener();
		btn.addActionListener(listener); //리스너 등록.
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,200);
		setVisible(true);
		setLayout(new FlowLayout(FlowLayout.CENTER)); //정렬
		
		
	}
	
	private class MyActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String b = e.getActionCommand();
			if(b.equals("Action")) {
				btn.setText("액션");
				btn.setForeground(Color.CYAN);
			}else {
				btn.setText("Action");
				btn.setForeground(Color.black);
			}
			
		}
		
	}
	
}
