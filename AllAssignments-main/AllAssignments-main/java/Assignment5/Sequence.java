abstract class Sequence {
	
	Sequence(){		
	
	}

	public abstract double Next();
	
	public int Sum(int num) {
		int total = 0;
		for(int i=1;i <= num;i++){
			total += Next();
		}
		return total;	
	}
}
