package com.neusoft.chapter2;
import java.util.Scanner;
/**
 * @author zhao-chj
 *题目：华氏度转摄氏度
 *1.输入华氏度的数
 *2.查找公式转化为摄氏度
 *    Celsius=(5/9)(fahrengeit-32)
 *3.输出摄氏度的值
 */
public class FahrenheitToCelsius {
	public static void main(String[] args) {
		//1.输入华氏度的数
		System.out.println("请输入华氏度的值");
		Scanner sc= new Scanner(System.in);
		double fahrenheit = sc.nextDouble();
		//2.查找并应用公式转化为摄氏度
		double Celsius=(5.0/9)*(fahrenheit-32);
		//3.输出摄氏度的值
String remianCelsius = String.format("%3.2f", Celsius);
		System.out.println(fahrenheit+
				"华氏度="+remianCelsius+"摄氏度");
	}
}
