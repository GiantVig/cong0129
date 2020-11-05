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
	JMenu m1 = new JMenu("�ļ�");
	JMenu m2 = new JMenu("ѧ�����ݴ���");
	JMenuItem item11 = new JMenuItem("ˢ��");
	JMenuItem item12 = new JMenuItem("�˳�");
	JMenuItem item21 = new JMenuItem("���ѧ����Ϣ");
	JMenuItem item22 = new JMenuItem("��ѯѧ����Ϣ");
	JMenuItem item23 = new JMenuItem("ɾ��ѧ����Ϣ");
	JMenuItem item24 = new JMenuItem("�޸�ѧ����Ϣ");
	
	JTextArea txt = new JTextArea(20,20);
	JScrollPane sp2= new JScrollPane(txt);
	public MainFrame() {
		this.setTitle("ѧ����Ϣ����ϵͳ-������");
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
        	txt.setText("ѧ��\t����\t�ɼ�\n");
        	for(Student s:list) {
        		txt.append(s.getNo()+"\t"+s.getName()+"\t"+s.getJava()+"\n");
        	}
        }
        @Override
        public void actionPerformed(ActionEvent e) {
        	if(e.getSource()==item21) {//���
        		new AddStudent();
        	}else if(e.getSource()==item22) {//��ѯ
        		new FindStudent();
        	}else if(e.getSource()==item23) {//ɾ��
        		new Removtudent();
        }else if(e.getSource()==item24) {//�޸�
    		new ModyStudent();
	}else if(e.getSource()==item11) {//ˢ��
		initArea();
	}
}
        public static void main(String[] args) {
        	new MainFrame();
        	}}
    