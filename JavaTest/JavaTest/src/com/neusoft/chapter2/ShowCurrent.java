package com.neusoft.chapter2;
/**
 * @author zhao-chj
 *题目：显示当前时间
 *分析：了解GMT格林威治时间的构成，转化为格式为：小时：分钟：秒的格式
 *1.java中的System类提供了GMT时间的表示，是一个从1970年1月1日
 *00:00:00开始到当前时刻的毫秒数，该时间是unix的时间戳。
 *2.通过System.currentTimeMiillis()方法获取从1970年1月1日
 *00:00:00开始到现在的毫秒数，记为totalMilliseconds。
 *3.总毫秒数totalMilliseconds除以1000得到总秒数totalseconds
 *4.总秒数totalseconds%60得到当前秒数
 *5.总秒数totalseconds/60得到总的分钟数
 *6.总的分钟数totalminutes/60得到总的小时数totalhours
 *7.总的分钟数totalminutes%60得到当前的分钟数
 *8.总的小时数totalhours%24得到当前的小时数
 *9.结果的输出
 */
public class ShowCurrent {
	public static void main(String[] args) {
	//*2.通过System.currentTimeMiillis()方法获取从1970年1月1日
	//*00:00:00开始到现在的毫秒数，记为totalMilliseconds。
		long currentTimeMillis = System.currentTimeMillis();
	//*3.总毫秒数totalMilliseconds除以1000得到总秒数totalseconds
		long totalseconds = currentTimeMillis/1000;
	//*4.总秒数totalseconds%60得到当前秒数
		long currentSeconds = totalseconds%60;
	//*5.总秒数totalseconds/60得到总的分钟数
		long totalminutes = totalseconds/60;
	//*6.总的分钟数totalminutes/60得到总的小时数totalhours
		long totalhours = totalminutes/60;
	//*7.总的分钟数totalminutes%60得到当前的分钟数
		long currentMinutes = totalminutes%60;
	//*8.总的小时数totalhours%24得到当前的小时数
	//格林尼治时间与北京时间相差八小时，也就是晚八小时
		long currentHours= totalhours%24+8;
		System.out.println("当前时间为："+currentHours
	+":"+currentMinutes+":"+currentSeconds+"GMT"
				);
	}
}
