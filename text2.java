/*
 * 题目：对10个数进行排序
 * 冒泡排序
 */
public class text4 {
	public static void main(String[] args){
		int[] a = {23,24,242,12,43,34,12,34,1,21,12} ;
		int temp = 0;
		int flag = 0; 
		for(int i=0;i<a.length-1;i++){
			for(int j=0;j<a.length-i-1;j++){
				if(a[j]<a[j+1]){
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;//互换
					flag = 1;					
				}
			}
			if(flag==0)
				break;
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}
