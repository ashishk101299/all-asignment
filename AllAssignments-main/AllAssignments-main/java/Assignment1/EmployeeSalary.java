class EmployeeSalary{

	public static void main(String[] args){
		int id = Integer.parseInt(args[0]);
		int age = Integer.parseInt(args[1]);
		int hour = Integer.parseInt(args[2]);	
		double rate = Double.parseDouble(args[3]);

		Employee emp = new Employee(id,age,hour,rate);

		emp.printEmployee();
		System.out.printf("%nTotal Salary   : %.2f%n ",emp.getSalary());

	}
}
