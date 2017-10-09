/* 
 * 薪金管理系统
*/
import java.util.Date;
import java.util.GregorianCalendar;

public class EmployeeTest {
	public static void  main(String[] args) {
		Employee[] staff = new Employee[3];
		staff[0] = new Employee("Tony",75000,1987,12,15);
		staff[1] = new Employee("Carl",50000,1989,10,1);
		staff[2] = new Employee("Harry",40000,1990,3,15);
	
	for(Employee e : staff)//遍历staff
		e.raiseSalary(5);//提高 5%
	for(Employee e : staff)
		System.out.println("name: "+e.getName()+"   salary="+e.getSalary()+"   hireDay:"+e.getHireDay());
}
}

class Employee
{
	private String name;
	private double salary;
	private Date hireDay;
	
	public Employee(String n,double s,int year,int month,int day) {
		name = n;
		salary = s;
		GregorianCalendar calendar = new GregorianCalendar(year,month - 1,day);//GregorianCalendar中0表示1月
		hireDay = calendar.getTime();
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getSalary()
	{
		return salary;
	}
	
	public Date getHireDay()
	{
		return hireDay;
	}
	
	public void raiseSalary(double byPercent)//提高5%
	{
		double raise = salary*byPercent / 100;
		salary += raise;
	}
	

}

