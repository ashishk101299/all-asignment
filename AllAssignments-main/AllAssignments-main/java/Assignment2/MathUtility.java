class MathUtility{

	private int number;
	private int number2;
	MathUtility(int n){
		number = n;
	}
	MathUtility(int n,int m){
		number = n;
		number2 = m;
	}

	public void isOdd(){	
		if (number % 2 != 0 )
			System.out.printf("The Number %d is\t\t\t\t: Odd%n",number);
		else
			System.out.printf("The Number %d is\t\t\t\t: Even%n",number);
	}

	public void squareOfNumber(){
		System.out.printf("The Square of %d is\t\t\t\t: %d%n",number,number*number);	
	}

	public void cubeOfNumber(){
		System.out.printf("The Cube Of %d is\t\t\t\t: %d%n",number,number*number*number);
	}

	public void primeNumber(){
		int i;
		boolean prime =false;

		for (i=2;i<=number/2;++i){
			if (number % i == 0){
				prime = true;	
				System.out.printf("The Number %d is\t\t\t\t: Not a Prime Number%n",number);
				break;
			}
		}
		if(prime == false)
		System.out.printf("The Number %d is\t\t: A Prime Number%n",number);
				
	}

		static int isPrime(int n)
		{
			int m;
			if(n == 1)
			return 0;
			if(n == 2 || n == 3)
			return 1;
			if((n % 2) == 0)
			return 0;
		
			for(m = 3;m * m <= n;m += 2){
			if((n % m) == 0)
			return 0;
			}
			return 1;
		}

		int CountPrime(int first,int last){
			int term; 
			int count = 0;
			for (term=first; term <= last; ++term){	
				count += isPrime(term);	
		    	  }
			  return count;
			}


	public void reverseNumber(){
		int temp = number;
		int sum = 0;
		int count = 0;
		do{
			sum = sum * 10 + temp % 10;
			temp = temp / 10;
			count +=1;
		}
		while(temp>0);
			System.out.printf("The reverse of number %d is\t\t\t: %d%n",number,sum);
			System.out.printf("Total Digits in number are\t\t\t: %d%n",count);
	}

}
