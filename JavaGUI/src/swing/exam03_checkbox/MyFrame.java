package swing.exam03_checkbox;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFrame extends JFrame {
	JLabel label1, label2;
	JCheckBox onion, cheese, tomato;
	JButton buttonOK;
	
	JPanel topPanel, MidPanel, ButtomPanel;
	
	
	MyFrame(){
		
		setTitle("üũ�ڽ� �׽�Ʈ");
		setSize(270,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		topPanel = new JPanel();
		label1 = new JLabel("����ſ� ������ �߰��Ͻðڽ��ϱ�?");
		topPanel.add(label1);
		add(topPanel,BorderLayout.NORTH);
		
		MidPanel = new JPanel();
		onion = new JCheckBox("����");
		MidPanel.add(onion);
		cheese = new JCheckBox("ġ��");
		MidPanel.add(cheese);
		tomato = new JCheckBox("�丶��");
		MidPanel.add(tomato);
		
		label2 = new JLabel("������ �ɼ��� ������ �����ϴ�.");
		MidPanel.add(label2);
		add(MidPanel,BorderLayout.CENTER);
		
		ButtomPanel = new JPanel();
		buttonOK = new JButton("OK");
		ButtomPanel.add(buttonOK);
		add(ButtomPanel,BorderLayout.SOUTH);
		setVisible(true);
		
		MyActionListener listener = new MyActionListener();
		buttonOK.addActionListener(listener);
		
	}
	
	class MyActionListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			String evt = e.getActionCommand();
			List<String> list = new ArrayList();
			
			if(evt =="OK") {
				if(onion.isSelected()) 	list.add(onion.getText());
				if(cheese.isSelected()) list.add(cheese.getText());
				if(tomato.isSelected())	list.add(tomato.getText());
								
				if(list.size() == 0) {
					label2.setText("���õ� �ɼ��� �����ϴ�." );	
					label2.setForeground(Color.RED);
				}else {
					label2.setText(list.toString() +"�� ���� �Ǿ����ϴ�.");
					label2.setForeground(Color.BLUE);
					
				}
			}
			
		}
		
	}
}
