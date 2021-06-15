package les_4;

public class Manager extends user{

	public Manager(String name, double salary_ratio) {
		super(name, salary_ratio);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculatePay() {
		// TODO Auto-generated method stub
		 double salary_ratio;
		  double calculatePay = getSalary_ratio()*520;
		return calculatePay;
	}
   
	
	}


		
		
		
	

