/*
 * 计算字符串中子串出现的次数
 */
import java.util.Scanner;
public class text10 {
	public static void  main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("请输入字符串：");
		String str1 = in.next();
		System.out.print("请输入要查找的字符串：");
		String str2 = in.next();
		System.out.print("查到的个数为："+findStr(str1,str2));
		}
	
	public static int findStr(String str1, String str2) {
		int count = 0;
		char[] s1 = str1.toCharArray();//字符串对象中的字符转换为一个字符数组
		char[] s2 = str2.toCharArray();
		for(int i= 0,j=0;i<s1.length;i++) {
			for(j=0;j<s2.length;j++) {
				if(s2[j] != s1[i+j] )
					break;//不匹配則退出
			}
			if(j == s2.length) {
				count++;
				i = i+j-1;
			}
		}
		return count;
	}
}

