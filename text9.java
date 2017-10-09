
/*
 *某个公司采用公用电话传递数据，数据是四位的整数，在传递过程中是加密的，加密规则如下：每位数字 
 *都加上5,然后用和除以10的余数代替该数字，再将第一位和第四位交换，第二位和第三位交换。
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class text9 {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int[] num = new int[4];
		for (int i = 0; i < 4; i++) {
			System.out.print("输入第" + (i + 1) + "位数：");
			num[i] = in.nextInt();
		}
		encrypt(num);// 加密
		System.out.printf("加密后的数据为：");
		for(int i = 0;i<4;i++) {
			System.out.printf("%d", num[i]);
		}
	}

	private static void encrypt(int[] num) {
		int mid = 0;
		for (int i = 0; i < 4; i++) {
			num[i] = (num[i] + 5) % 10;
		}

		mid = num[0];
		num[0] = num[3];
		num[3] = num[0];
		
		mid = num[1];
		num[1] = num[2];
		num[2] = mid;
	}

}
