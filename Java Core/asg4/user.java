package les_4;

import java.util.Scanner;

public abstract class  user {
	 private String name;
	 private double salary_ratio;
	   
	 public  abstract double calculatePay();
	public user(String name, double salary_ratio) {
		super();
		this.name = name;
		this.salary_ratio = salary_ratio;
	}

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary_ratio() {
		return salary_ratio;
	}
	public void setSalary_ratio(double salary_ratio) {
		this.salary_ratio = salary_ratio;
	}
	public static  String name ()
	{      
		Scanner sc = new Scanner(System.in);
		 String tennhapvao =sc.nextLine();
		 String name = tennhapvao;
		 return name;
		
	}
	public static  double salary_ratio()
	{  
	
		Scanner sc = new Scanner(System.in);
		  double  socannhap =sc.nextDouble();
		double  getSalary_ratio = socannhap;
		 return  getSalary_ratio;

	}   
	
	
}
