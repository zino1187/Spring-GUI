package com.itbank.view;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * �������� �����̳ʷ� ���� ���� ��������
 * */
public class AppMain {
	public static void main(String[] args) {
		//�������� �����̳ʸ� ũ�� 2������ ���еȴ� 
		//�� ���������� 2���� ����� �����Ѵ� (xml, �ڹ��ڵ�)
		//1. BeanFactory , 2.ApplicationContext (ClassPathXML, FilePathXML,XMLWeb)
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("com/itbank/spring/context/my-context.xml");
		
		MainWindow mainWindow=(MainWindow)context.getBean("mainWindow");
		
		
		
	}
}
