/*
 * 题目：对10个数进行排序
 * 选择排序
 */
public class text5 {
	public static void main(String[] args) {  
	int[] a={31,634,44,2231,934,52,82,11,71,40};  
	int temp=0;
	int flag=0;  
	for(int i=0;i<a.length-1;i++)  
	{   
		flag=i;    
		for(int j=i+1;j<a.length;j++)  
		{    
			if(a[flag]<a[j])   
			{    	
				flag=j;  			
			}   
		}   
		if(flag!=i)  
		{    
		temp=a[flag];    
		a[flag]=a[i]; 
		a[i]=temp;  
		}  
	}  
	for(int i=0;i<a.length;i++)
	{   
		System.out.print(a[i]+" ");  
	} 
	} 
}
