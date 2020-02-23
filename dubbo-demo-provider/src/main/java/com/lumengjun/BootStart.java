package com.lumengjun;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BootStart {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		//加载文件
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		//启动加载
		context.start();
		//按任意键退出
		System.in.read();
	}
	
}
