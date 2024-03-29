package client;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Start {
	
	JFrame f;
	JButton start,end;
	JPanel panel;
	public void init() {
		f = new JFrame("设备");
		start = new JButton("启动设备");
		end = new JButton("关闭设备");
		panel  = new JPanel();
		panel.setLayout(new FlowLayout(1,10,30));
//		panel.setBackground(Color.LIGHT_GRAY);
		start.setPreferredSize(new Dimension(150,50));
//		start.setBorder(new EmptyBorder(15,15,15,15));
		end.setPreferredSize(new Dimension(150,50));
		panel.add(start);
		panel.add(end);
		f.setSize(200, 230);
		f.add(panel);
		f.setVisible(true);
		f.setResizable(false);
		f.setLocation(300, 150);
		f.setDefaultCloseOperation(0);
		
		ActionListener btnListener = e->{
			try {
				if(e.getActionCommand()=="启动设备") {
				//	start.setEnabled(false);
					new Client();
					start.setEnabled(false);
				}else {
					System.exit(0);
				}
			}catch(Exception e1) {
				
			}
		};
		start.addActionListener(btnListener);
		end.addActionListener(btnListener);
	}

	public static void main(String[] args) {
		new Start().init();

	}
}