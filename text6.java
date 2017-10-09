
/*
 * 问题描述：有10个评委为参赛选手打分，分数是1到100。 
 * 选手最后的得分是：
 * 去掉一个最高分，去掉一个最低分，其余8个评委取平均值。
 */

import java.util.Scanner;

public class text6 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int max = 0;
		int min = 100;
		int sum = 0;
		for (int i = 0; i <= 10; i++) {

			System.out.print("请" + i + "评委输入分数：");
			int grade = in.nextInt();// 输入分数
			while (grade < 0 || grade > 100) {
				System.out.print("请" + i + "评委输入分数：");
				grade = in.nextInt();
			} // 0-100中间
			sum += grade;// 求总分
			if (grade > max)
				max = grade;// 最高分
			if (grade < min)
				min = grade;// 最低分
		}
		System.out.printf("去掉一个最高分：%d\n去掉一个最低分：%d\n", max, min);
		int avg = (sum - max - min) / 8;
		System.out.printf("平均分为%d", avg);// 求平均分
	}
}
// print printf 的区别
