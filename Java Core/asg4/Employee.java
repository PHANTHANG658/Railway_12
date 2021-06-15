package les_4;

public class Employee extends user{

	public Employee(String name, double salary_ratio) {
		super(name, salary_ratio);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculatePay() {
		// TODO Auto-generated method stub
		 double salary_ratio;
		  double calculatePay = getSalary_ratio()*420;
		return calculatePay;

	}
   
} 
