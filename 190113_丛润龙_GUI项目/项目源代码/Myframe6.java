package c0113;

import java.awt.*;
	import java.awt.event.*;
import java.util.Random;
import c0113.Interface;
import javax.swing.*;	
		//此类用作音录窗口
		public  class Myframe6 extends JFrame implements ActionListener{
		JPanel jp1=new JPanel();//登录页面第一行的面板
		JPanel jp2=new JPanel(); //登录页面的第二行面板
		JPanel jp3=new JPanel(); //登录页面的第三行面板
		JPanel jp4=new JPanel(); //登录页面的第四行面板
		JPanel jp5=new JPanel();
		JButton jb1=new JButton("登录");
		JButton jb2=new JButton("取消");
		JLabel jlab1=new JLabel("用户名：");
		JLabel i1ab2=new JLabel("密 码：");
		JLabel jlab3=new JLabel("验证码： ");
		JLabel jlab4=new JLabel();
		JLabel jlab5=new JLabel();//显示迎录信息判断
		JPasswordField jpass=new JPasswordField(10);//密码框
		JTextField jname=new JTextField(10); 
		JTextField jyzm=new JTextField(6);//文小 5
		String yzm="";
				Myframe6(){
				this.setTitle("登录");
				this.setSize(300,200);
				this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				Container con=this.getContentPane();
				con.setLayout(new GridLayout(5,1));
				jp1.add(jlab1);jp1.add(jname);//第一 板添加组件
				jp2.add(i1ab2) ;jp2.add(jpass);//第
				jp3.add(jlab3) ;jp3.add(jyzm);jp3.add(jlab4);//第三行面板添加组
				jp4.add(jb1);jp4.add(jb2);//第四行而板添加组
				jp5.add(jlab5); 
				con.add(jp1);
				con.add(jp2);
				con.add(jp3 ); 
				con.add(jp4);
				con.add(jp5);
				jb1.addActionListener(this);
				jb2.addActionListener(this);
				yzm=this.getYzm(4);
				jlab4.setText(yzm);//调用自 确》显示到指定位置
				this.setVisible(true);
				}
 public String getYzm(int n) {
	 String s="";
	 String string = "0123456789abcdefg";
		char[] ch = new char[n];
		for(int i = 0;i<n;i++) {
			Random random = new Random();
			int index = random.nextInt(string.length());
			ch[i] = string.charAt(index);
		}
		String result = String.valueOf(ch);
		return result;
	 
 }
@Override
public void actionPerformed(ActionEvent arg0) {
	if(arg0.getSource()==jb1) {
		String name=jname.getText();
		char c[]=jpass.getPassword();
		String pwd=new String(c);
		String useryzm=jyzm.getText();
		new MainFrame(); 
		if(name.equals("")||pwd.equals("")) {
			jlab5.setText("用户名或者密码不能为空！！！");
		}else if(!name.equals("admin")||!pwd.equals("admin")) {
			jlab5.setText("用户名或者密码有误！！！！");
		}
		if((!useryzm.equals(yzm))) {
			jlab5.setText("验证码错误");
		}
	}if(arg0.getSource()==jb2);{
		jname.setText("");
		jpass.setText("");
		jyzm.setText("");
	}
	}
public static void main(String arg[]) {
	new Myframe6();
}
}

	
