class MathMain{
public static void main(String[] args){
	int number;
	int number2;
	number = Integer.parseInt(args[0]);
	number2 = Integer.parseInt(args[1]);
	MathUtility mu=new MathUtility(number);
	MathUtility mu1=new MathUtility(number,number2);
	mu.isOdd();
	mu.squareOfNumber();
	mu.cubeOfNumber();
	mu.primeNumber();
	mu.reverseNumber();
	System.out.printf("Total Prime Number between %d and %d is\t\t: %d%n",number,number2,mu1.CountPrime(number,number2));
	}
}
