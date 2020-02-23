package com.lumengjun.service;

import com.lumengjun.pojo.Student;

/**
 * 
 * @author ASUS
 *
 */
public interface StudentService {
	/**
	 * 根据id 获取一个学生
	 * @param id
	 * @return
	 */
	Student getById(int id);
	
	
	/**
	 * 增加年龄
	 * @param stu
	 * @param num
	 * @return
	 */
	Student addAge(Student stu ,int num);


	/**
	 * 进行加法运算
	 * @param i
	 * @param j
	 * @return
	 */
	int getOnePlusTwo(int i, int j);

	/**
	 * 进行减法运算
	 * @param i
	 * @param j
	 * @return
	 */
	int getOneSubtractTwo(int i, int j);

	/**
	 * 进行乘法运算
	 * @param i
	 * @param j
	 * @return
	 */
	int getOneRideTwo(int i, int j);

	/**
	 * 进行除法运算
	 * @param i
	 * @param j
	 * @return
	 */
	int getOneDivideTwo(int i, int j);
	
}
