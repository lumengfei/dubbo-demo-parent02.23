package com.lumengjun.service.impl;

import com.lumengjun.pojo.Student;
import com.lumengjun.service.StudentService;

/**
 * 
 * @author ASUS
 *
 */
public class StudentServiceImpl implements StudentService{

	@Override
	public Student getById(int id) {
		Student student = new Student(id, "卢梦均", 20);
		return student;
	}
	

	@Override
	public Student addAge(Student stu, int num) {
		//增加年龄
		stu.setAge(stu.getAge()+num);
		return stu;
	}

	@Override
	public int getOnePlusTwo(int i, int j) {
		// TODO Auto-generated method stub
		return (i+j);
	}

	@Override
	public int getOneSubtractTwo(int i, int j) {
		// TODO Auto-generated method stub
		return (i-j);
	}

	@Override
	public int getOneRideTwo(int i, int j) {
		// TODO Auto-generated method stub
		return (i*j);
	}

	@Override
	public int getOneDivideTwo(int i, int j) {
		// TODO Auto-generated method stub
		return (i/j);
	}

}
