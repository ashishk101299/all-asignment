class Employee {
	
	private int emp_id;
	private int emp_age;
	private int emp_working_hour;
	private double emp_rate_per_hour;

	public Employee(int id,int age,int hrs,double rate){
		emp_id = id;
		emp_age = age;
		emp_working_hour = hrs;
		emp_rate_per_hour = rate;
	}

	public double getSalary(){
		double salary;
		if(emp_working_hour < 180){
			salary = emp_working_hour * emp_rate_per_hour;
			return salary;
		}
		else{
			salary = emp_working_hour * emp_rate_per_hour + (emp_working_hour - 180) * 100;
			return salary;
		}
	}
	
	public void printEmployee(){
		System.out.printf("Employee Id    : %d%n",emp_id);
		System.out.printf("Employee age   : %d%n",emp_age);
		System.out.printf("Working Hours  : %d%n",emp_working_hour);
		System.out.printf("rate per hour  : %.2f%n",emp_rate_per_hour);
	}	

}

