package com.neusoft.chapter2;
import java.util.Scanner;
/**
 * @author zhao-chj
 *求平均值
 *1.从键盘上输入3个数
 *2.将三个数相加，其和为sum
 *3.求平均值 sum/3
 *4.输出平均值
 */
public class ComputeAaverage {
	public static void main(String[] args) {
		getAverage();
	}
	private static void getAverage() {
		//1.从键盘上输入3个数
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第1个数");
		double number1 = sc.nextInt();
		System.out.println("请输入第2个数");
		double number2 = sc.nextInt();
		System.out.println("请输入第3个数");
		double number3 = sc.nextInt();
		//2.将三个数相加，其和为sum
		double sum = number1+number2+number3;
		//3.求平均值 sum/3
		double average=sum/3;
		//4.输出平均值
		System.out.println("这三个数的平均值为："+average);
	}
}
