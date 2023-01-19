class Patient {
	
	private int patientId;
	private String patientName;
	private int bedType;
	private int noOfDays;

	Patient() {
 	
	}
	public Patient(int pid,String pname,int btype,int ndays) {
	
		patientId = pid;	
		patientName = pname;
		bedType = btype;
		noOfDays = ndays;
	}
	

	int getPatientId() {
		return patientId;
	}
	void setPatientId(int pid) {
		patientId = pid;
	}

	String getPatientName() {
		return patientName;
	}
	void setPatientName(String pname) {
		patientName = pname;
	}

	int getBedType() {
		return bedType;
	}
	void setBedType(int btype) {
		bedType = btype;
	}

	int getNoOfDays() {
		return noOfDays;
	}
	void setNoOfDays(int ndays) {
	  	noOfDays = ndays;	
	}

	int getPricePerDay() {
		int price = 0;
		switch(bedType) {
			case 1: 
			System.out.println("You Have Selected General Bed");
			price = 200;
			break;

			case 2 :	
			System.out.println("You Have Selected Premium Bed");
			price = 350;
			break;
			
			case 3 :
			System.out.println("You Have Selected ICU Bed");
			price = 500;
			break;

			default : 
			System.out.println("!!!!Wrong Bed Selection Please Try Again!!!!");
			
		}
		return price;
	}

	double getBillAmount() {
		double amount = 0;
		amount = noOfDays * getPricePerDay();
		return amount;
	}
}

