class PowerSequence extends Sequence implements Resetable{

	private int factor;
	private int current;

	PowerSequence(int ratio){
		factor = ratio;
		current = 1;	
	}
	
	public double Next() {
		double term = current;
		current *= factor;
		// current = current * factor;
	//:System.out.printf("CurrentPower : %f",term);
		return term;
	}

	public void Reset(){
		current = 1;
	}	
}
