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
		setTitle("�̺�Ʈ ����");
		setLayout(new FlowLayout());
		
		btn = new JButton("Action");
		add(btn);
		
		//�̺�Ʈ ������ ��ü ����
		MyActionListener listener = new MyActionListener();
		btn.addActionListener(listener); //������ ���.
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,200);
		setVisible(true);
		setLayout(new FlowLayout(FlowLayout.CENTER)); //����
		
		
	}
	
	private class MyActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String b = e.getActionCommand();
			if(b.equals("Action")) {
				btn.setText("�׼�");
				btn.setForeground(Color.CYAN);
			}else {
				btn.setText("Action");
				btn.setForeground(Color.black);
			}
			
		}
		
	}
	
}
