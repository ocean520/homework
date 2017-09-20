/*
 * 给一个不多于5位的正整数，要求：一、求它是几位数，二、逆序打印出各位数字
 */
import java.io.*; 
public class text2 {
	public static void main(String[] args) throws Exception{
		String s=new String(""); 
		BufferedReader stdin=new BufferedReader(new InputStreamReader(System.in)); 
		System.out.print("请输入一个正整数：");
		s=stdin.readLine();  
		byte[]bytes=s.getBytes();  
		System.out.println("它是"+bytes.length+"位数");
		for(int i=bytes.length-1;i>=0;i--)  
		{    
			System.out.print(bytes[i]-'0'); //转换成数字
		}
	}
}
