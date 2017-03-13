package com.neusoft.chapter1;
/**
 * @author zhao-chj
 *题：计算一元二次方程的根
 *思路：根据公式将数值带入即可
 */
public class MathCount {
	public static void main(String[] args) {
		double x = (44.5*0.55-50.2*5.9)/(3.4*0.55-50.2*2.1);
		double y = (3.4*5.9-44.5*2.1)/(3.4*0.55-50.2*2.1);
		System.out.println("x="+String.format("%3.3f", x));
		System.out.println("y="+String.format("%3.3f", y));
	}
}
