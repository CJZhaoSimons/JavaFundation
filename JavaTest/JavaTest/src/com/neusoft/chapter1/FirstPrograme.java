package com.neusoft.chapter1;
/**
 * @author zhao-chj
 *题：计算1+2+3+4+5+6+7+8+9的值
 */
public class FirstPrograme {
	public static void main(String[] args) {
		//方法1
		int input = 1+2+3+4+5+6+7+8+9;
		System.out.println("1+2+3+4+5+6+7+8+9="+input);
		//方法2
		int sum=0;
		for (int i = 1; i <=9; i++) {
			sum=sum+i;
		}
		System.out.println("1+2+3+4+5+6+7+8+9="+sum);
	}
}
