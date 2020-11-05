package c0113;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.Raster;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
class Myframe5 extends JFrame implements ActionListener{
	
	private static final String admin = "admin";
JLabel yhm=new JLabel("用户名");
JTextField t_yhm=new JTextField(18);
JLabel mm=new JLabel("密码");
JPasswordField t_mm=new JPasswordField(18);
JLabel qrmm=new JLabel("确认密码：");
JPasswordField t_qrmm=new JPasswordField(18);
JLabel lxx=new JLabel();
JButton b1=new JButton("注册");
JButton b2=new JButton("重置");
  
	Myframe5(){
		this.setTitle("注册");
		this.setSize(300,400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container pane=this.getContentPane();
		pane.setLayout(new GridLayout(7,1));
		
		JPanel p1=new JPanel(  );
		p1.setLayout(new FlowLayout(FlowLayout.LEFT));
		p1.add(yhm);p1.add(t_yhm);
		JPanel p2=new JPanel();
		p2.setLayout(new FlowLayout(FlowLayout.LEFT));
		p2.add(mm);p2.add(t_mm);
		
		JPanel p3=new JPanel();
		p3.setLayout(new FlowLayout(FlowLayout.LEFT));
		p3.add(qrmm);p3.add(t_qrmm);
		
		JPanel p4=new JPanel();
		p4.setLayout(new FlowLayout(FlowLayout.CENTER));
		p4.add(b1);p4.add(b2);
		JPanel p5=new JPanel();
		p5.setLayout(new FlowLayout(FlowLayout.CENTER));
		p5.add(lxx);
		pane.add(p1);
		pane.add(p2);
		pane.add(p3);
		pane.add(p4);
		pane.add(p5);
		 b1.addActionListener(this);
	        b2.addActionListener(this);
	        lxx.setForeground(Color.RED);
	        this.setVisible(true);
}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	
			 if(e.getSource()==b1) {
		            String name=t_yhm.getText();
		            char c[]=t_mm.getPassword();
		            String pwd=new String(c);
		            char c2[] =t_qrmm.getPassword();
		            String pwd2= new String(c2);
		            String yhm=t_yhm.getText();
		            
		            if(!(yhm.equals("admin"))&&!(pwd.equals(pwd2))){
		        		lxx.setText("密码与确认密码一致！！！！！！");
		        	}
		            else if(yhm.equals("admin")&&(pwd.equals(pwd2))){
		        		lxx.setText("用户名已存在！！！");
		        	}
		        	else if(pwd.equals(pwd2)&& !(yhm.equals("admin"))) {
		            new Myframe6();	
		            lxx.setText("租车成功！！！！");
		        	}
		        	}
		     if(e.getSource()==b2);{
		        		t_yhm.setText("");
		        		t_mm.setText("");
		        		t_qrmm.setText("");
		        	}
	}
		            
			 
		        	
		        	
	public static void main(String arg[]){
        new Myframe5();
}
		    

	        }
	        
	