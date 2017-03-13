package com.neusoft.chapter2;
import java.lang.Math;
import java.util.Scanner;
/**
 * @author zhao-chj
 *思想：求圆的面积
 *1.读入半径
 *2.根据圆的面积公式完成求解面积
 *3.输出圆的面积
 */
public class ComputeArea {
	public static void main(String[] args) {
			//getArea1();
	 		getArea2();
	}
	private static void getArea2() {
		//0.使用常量定义PI
		 final double PI = 3.14;
		//1.读入半径
		System.out.println("请输入您想输入的半径数值");
		Scanner sc = new Scanner(System.in);
		double radius = sc.nextDouble();
		//2.根据圆的面积公式完成求解面积
		double area=PI*radius*radius;
		//3.输出圆的面积
		System.out.println("圆的面积是："+String.format("%3.2f", area));
	}

	private static void getArea1() {
		//1.读入半径
		System.out.println("请输入您想输入的半径数值");
		Scanner sc = new Scanner(System.in);
		double radius = sc.nextDouble();
		//2.根据圆的面积公式完成求解面积
		double area=Math.PI*radius*radius;
		//3.输出圆的面积
		System.out.println("圆的面积是："+String.format("%3.2f", area));
	}
}
