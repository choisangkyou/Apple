package swing.exam04_menu;

import java.awt.Color;
import java.awt.Event;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextPane;
import javax.swing.KeyStroke;

public class MenuDemo extends JFrame implements ActionListener {
	JMenuBar mb;
	JMenu file, color , font;
	JMenuItem f1, f2,f3,f4;
	JMenuItem c1,c2,c3;
	JMenuItem s1,s2,s3;
	JTextPane text;
	JFileChooser fc;
	
	public MenuDemo() {
		setTitle("�޴� �����ϱ�");
		
		makeMenu();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,500);
		setVisible(true);
	}

	private void makeMenu() {
		mb = new JMenuBar();
		file = new JMenu("File");
		file.setMnemonic(KeyEvent.VK_F); //Alt+F
		
		color = new JMenu("Color");
		color.setMnemonic(KeyEvent.VK_C);
		
		text = new JTextPane();
		
		font = new JMenu("Font");
		font.setMnemonic(KeyEvent.VK_F);
		
		//����޴�
		f1 = new JMenuItem("New File"); //Ctrl + N
		f1.setAccelerator(KeyStroke.getKeyStroke('N',Event.CTRL_MASK));
		
		f2 = new JMenuItem("Open File");
		f2.setAccelerator(KeyStroke.getKeyStroke('O',Event.CTRL_MASK));
		
		f3 = new JMenuItem("Save File");
		f3.setAccelerator(KeyStroke.getKeyStroke('S',Event.CTRL_MASK));
		
		f4 = new JMenuItem("Exit(X)");
		f4.setAccelerator(KeyStroke.getKeyStroke('X',Event.CTRL_MASK));
		
		c1 = new JMenuItem("Blue");
		c1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_B,ActionEvent.CTRL_MASK));
		
		c2 = new JMenuItem("Red");
		c2.setAccelerator(KeyStroke.getKeyStroke('R',Event.CTRL_MASK));
		
		c3 = new JMenuItem("Yellow");
		c3.setAccelerator(KeyStroke.getKeyStroke('Y',Event.CTRL_MASK));
		
		s1 = new JMenuItem("�ü�����15");
		s2 = new JMenuItem("���򱽰�20");
		s3 = new JMenuItem("����ü���Ÿ�30");
		
		
		//�޴��� ����޴� ���
		file.add(f1);
		file.add(f2);
		file.add(f3);
		file.addSeparator(); //���м�
		file.add(f4);
		
		//���� �޴� ����޴� ���
		color.add(c1);
		color.add(c2);
		color.add(c3);

		//font �޴� ���
		font.add(s1);
		font.add(s2);
		font.add(s3);
		
		//�޴��ٿ� �޴� ���
		mb.add(file);
		mb.add(color);
		mb.add(font);
		
		//�����ӿ� �޴��� ���
		setJMenuBar(mb);
		//text pane ���
		add(text);
		
		//������ ���
		c1.addActionListener(this);
		c2.addActionListener(this);
		c3.addActionListener(this);
		
		f1.addActionListener(this);
		f2.addActionListener(this);
		f3.addActionListener(this);
		
		s1.addActionListener(this);
		s2.addActionListener(this);
		s3.addActionListener(this);
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		 JMenuItem mi = (JMenuItem)e.getSource();
		 switch(mi.getText()) {
		 case "�ü�����15":
			 text.setFont(new Font("�ü�ü",0,15));
			 break;
		 case "���򱽰�20":
			 text.setFont(new Font("�P��ü",1,20));
			 break;
		 case "����ü���Ÿ�30":
			 text.setFont(new Font("�P��ü",2,30));
			 break;
		 }
		 
		 //���� �޴� ó��..
		 if(mi.getText() =="New File") {
			 text.setText(null);
		 	 text.setBackground(Color.WHITE);
		 }
		 
		 if(mi.getText() =="Open File") {
			fc = new JFileChooser();
			fc.showSaveDialog(this);
			File file = fc.getSelectedFile();
			
			//File path = file.getAbsoluteFile();
			//text.setText(path.getAbsolutePath());
			
		 }
		
		 if(mi.getText() =="Save File") {
			fc = new JFileChooser();
			fc.showSaveDialog(this);
			File file = fc.getSelectedFile();
			File path = file.getAbsoluteFile();
			SaveFile(path);
		 }
 
 
		 //���� �޴� ó��..
		 switch(mi.getText()) {
		 case "Blue":
			 text.setBackground(Color.BLUE);
			 break;
		 case "Red":
			 text.setForeground(Color.RED);
			 break;
		 case "Yellow":
			 text.setForeground(Color.YELLOW);
			 break;
		 }
		
	}
	
	public void SaveFile(File filepath) {
		try
        {
            FileWriter fw = new FileWriter(filepath); // �����ּ� ��� ����
            BufferedWriter bw = new BufferedWriter(fw);
            String str = text.getText();
 
            bw.write(str);
            bw.newLine(); // �ٹٲ�
             
            bw.close();
        }
        catch (IOException e)
        {
            System.err.println(e); // ������ �ִٸ� �޽��� ���
            System.exit(1);
        }


	}
	
}
