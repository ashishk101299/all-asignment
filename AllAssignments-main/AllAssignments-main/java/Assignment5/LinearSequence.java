class LinearSequence extends Sequence {

	private int current;
	private int step;
	
	LinearSequence (int first,int step1){
		current = first;	
		step = step1;				
	}

	public double Next() {
	
		double term = current;
		current += step;
		return term;
	}
}
