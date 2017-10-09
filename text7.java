
/*
 * 定义一个int型的一维数组，包含10个元素，分别赋一些随机整数
 * 然后求出所有元素的最大值，最小值，平均值，和值，并输出出来。
 */
import java.util.Scanner;

public class text7 {
	public static void main(String args[]) {
		int[] arr = new int[10];
		System.out.println("以下是随机的10个整数：");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (100 * Math.random());// 求随机数
			System.out.print(+arr[i] + " ");
		}
		int sum = 0;
		int max = arr[0];
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i])
				max = arr[i];// 最大值
			if (min > arr[i])
				min = arr[i];// 最小值
			sum += arr[i];
		}
		System.out.printf("\n最大值为%d\n最小值为%d\n和为%d\n平均值为%d", max, min, sum, sum / 10);// 输出值
	}
}
