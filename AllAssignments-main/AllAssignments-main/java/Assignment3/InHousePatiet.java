
class InHousePatient extends Patient {
	private float discount;
		
	float getDiscount() {
	 	return discount; 
	}
	void setDiscount(float dis) {
		discount = dis;
	}
	
	double getBillAmount() {
		double amount = 0;
		amount = super.getBillAmount();
		if(amount > 5000) {
			amount = amount - amount * 0.05; 
		}
 		else {
			amount = amount;
		}
		return discount;
	}

}


