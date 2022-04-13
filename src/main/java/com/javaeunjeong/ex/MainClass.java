package com.javaeunjeong.ex;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		//ctx컨테이너 생성
		
		ctx.load("classpath:applicationCTX.xml");//컨테이너 설정
		ctx.refresh();
		
		Student student = ctx.getBean("student",Student.class);
		//컨테이너 사용
		System.out.println(student.getName());//컨테이너 사용
		
		ctx.close();
		
	}

}
