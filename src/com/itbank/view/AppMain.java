package com.itbank.view;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * 스프링의 컨테이너로 부터 빈을 주입하자
 * */
public class AppMain {
	public static void main(String[] args) {
		//스프링의 컨테이너를 크게 2가지로 구분된다 
		//빈 설정파일은 2가지 방법을 지원한다 (xml, 자바코드)
		//1. BeanFactory , 2.ApplicationContext (ClassPathXML, FilePathXML,XMLWeb)
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("com/itbank/spring/context/my-context.xml");
		
		MainWindow mainWindow=(MainWindow)context.getBean("mainWindow");
		
		
		
	}
}
