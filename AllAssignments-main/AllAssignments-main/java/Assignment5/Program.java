class Program {

	public static double compute(Sequence seq, int terms){
		if(seq instanceof Resetable r){
			r.Reset();
		}
		return seq.Sum(terms);	
	}

	public static void main(String [] args) {
	
		int first;
		int diff;
		int factor;
		int term;

		first = Integer.parseInt(args[0]);
		diff = Integer.parseInt(args[1]);
		factor = Integer.parseInt(args[2]);
		term = Integer.parseInt(args[3]);

		Sequence ls = new LinearSequence(first,diff);
		Sequence ps = new PowerSequence(factor);
				
		System.out.printf("Linear Seq = %f\t%n",compute(ls,term));	
		System.out.printf("Power Seq = %f\t%n",compute(ps,term));		

	}	
}
