/*
 * 请输入星期几的第一个字母来判断一下是星期几，如果第一个字母一样，则继续 判断第二个字母。
 */
import java.util.*;
import java.io.*;
public class text1 {
	public static void main (String[] args) throws Exception
	{
		String s=new String("");
		char c=' ';
		char d=' ';
		BufferedReader stdin=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("请输入英文字母：");
		s=stdin.readLine(); 
		byte[] bytes=s.getBytes();
		c=(char)bytes[0];
		if(bytes.length>=2)   
			d=(char)bytes[1];
		switch(c)  
		{    
			case 'M':  
				System.out.print("星期一");    
			break;   
			case 'm':  
				System.out.print("星期一");    		
			break;
			case 'T': 
				if(d=='u'||d=='U')      
					System.out.print("星期二");     
				if(d=='h'||d=='H')     
					System.out.print("星期四");   
			break; 
			case 't':    
				if(d=='u'||d=='U')    
					System.out.print("星期二");    
				if(d=='h'||d=='H')    
					System.out.print("星期四");    
			break; 
			case 'W':    
				System.out.print("星期三");    			
			break;   
			case 'w':     
				System.out.print("星期三"); 
			break;
			case 'F':   
				System.out.print("星期五");  
			break;   
			case 'f':    
				System.out.print("星期五");     
			break; 
			case 'S':  
				if(d=='a'||d=='A')     
					System.out.print("星期六");    
				if(d=='u'||d=='U')     
					System.out.print("星期天");  				
			break;
			case 's':     
				if(d=='a'||d=='A')    
					System.out.print("星期六");     
				if(d=='u'||d=='U')      
					System.out.print("星期天");    
			break; 
		}
	}
}
