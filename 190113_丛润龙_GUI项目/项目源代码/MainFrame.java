package c0113;

import java.awt.*;
import javax.swing.*;

import dao.Education;
import dao.Student;
import gui.AddStudent;
import gui.FindStudent;
import gui.ModyStudent;
import gui.Removtudent;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MainFrame extends JFrame implements ActionListener {
	JMenuBar mbar = new JMenuBar();
	JMenu m1 = new JMenu("文件");
	JMenu m2 = new JMenu("学生数据处理");
	JMenuItem item11 = new JMenuItem("刷新");
	JMenuItem item12 = new JMenuItem("退出");
	JMenuItem item21 = new JMenuItem("添加学生信息");
	JMenuItem item22 = new JMenuItem("查询学生信息");
	JMenuItem item23 = new JMenuItem("删除学生信息");
	JMenuItem item24 = new JMenuItem("修改学生信息");
	
	JTextArea txt = new JTextArea(20,20);
	JScrollPane sp2= new JScrollPane(txt);
	public MainFrame() {
		this.setTitle("学生信息管理系统-主界面");
		this.setSize(500,600);
		this.setLocation(300,300);
		this.setJMenuBar(mbar);
		mbar.add(m1);
		mbar.add(m2);
		m1.add(item11);m1.add(item12);
		m2.add(item21);m2.add(item22);m2.add(item23);m2.add(item24);
		Container con = this.getContentPane();
		con.add(sp2);
		
		
		item21.addActionListener(this);
		item22.addActionListener(this);
		item23.addActionListener(this);
		item24.addActionListener(this);
		item11.addActionListener(this);
		Education.initInfo();
		initArea();
		this.setVisible(true);
	}


        public void initArea() {
        	ArrayList<Student> list=Education.getAllStudents();
        	System.out.println("initArea.list.size="+list.size());
        	txt.setText("学号\t姓名\t成绩\n");
        	for(Student s:list) {
        		txt.append(s.getNo()+"\t"+s.getName()+"\t"+s.getJava()+"\n");
        	}
        }
        @Override
        public void actionPerformed(ActionEvent e) {
        	if(e.getSource()==item21) {//添加
        		new AddStudent();
        	}else if(e.getSource()==item22) {//查询
        		new FindStudent();
        	}else if(e.getSource()==item23) {//删除
        		new Removtudent();
        }else if(e.getSource()==item24) {//修改
    		new ModyStudent();
	}else if(e.getSource()==item11) {//刷新
		initArea();
	}
}
        public static void main(String[] args) {
        	new MainFrame();
        	}}
    