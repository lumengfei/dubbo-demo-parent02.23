package com.lumengjun;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lumengjun.pojo.Student;
import com.lumengjun.service.StudentService;

public class ConsumerStart {
	static ClassPathXmlApplicationContext context;

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		//加载配置文件
		context = new ClassPathXmlApplicationContext("classpath:applicantionContext.xml");
		//获取接口对象
		StudentService studentService = context.getBean(StudentService.class);
		//定义结果值num
		int num =0;
		//调用加的方法
		//num =studentService.getOnePlusTwo(5,5);
	
		//调用减法方法
		//num =studentService.getOneSubtractTwo(5,5);
		
		//调用乘法方法
		//num =studentService.getOneRideTwo(5,5);
		
		//调用除法方法
		num =studentService.getOneDivideTwo(5,5);
		System.out.println("num is "+num);
		
	}
	
}
