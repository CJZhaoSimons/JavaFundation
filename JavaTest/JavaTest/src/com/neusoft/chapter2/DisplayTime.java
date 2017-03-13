package com.neusoft.chapter2;
import java.util.Scanner;
/**
 * @author zhao-chj
 *题目：输入一个秒数，请输出其分钟数值和秒，如500s，就是8分钟20s
 *1.从键盘输入秒数
 *2.将秒数划分为分钟数和剩余的秒数
 *3.输出分钟数和秒数
 */
public class DisplayTime {
	public static void main(String[] args) {
		//1.从键盘输入秒数
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个秒数");
		int seconds = sc.nextInt();
		//2.将秒数划分为分钟数和剩余的秒数
		int minutes = seconds/60;
		int remainSeconds= seconds%60;
		//3.输出分钟数和秒数
		System.err.println(
	seconds+"秒为："+minutes+"分钟"+remainSeconds+"秒");
	}
}
