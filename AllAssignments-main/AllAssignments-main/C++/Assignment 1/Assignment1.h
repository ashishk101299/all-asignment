#include<cstdio>
#include<cmath>
#include<iostream>

class Investment
{
	public:
	Investment()
	{
		amount = 10000;
		period = 2;
	}

      	void SetValues(double a, int p)
	{
		amount = a;
		period = p;
	}
	
	void GetValues()
	{
		printf("Amount = %lf\n",amount);
		printf("Period = %d\n",period);
	}

	double IntrestRate()
	{
		if(amount < 10000)
			rate = 8;
		if((amount >= 10000) && (amount < 50000))
			rate = 9;
		if(amount >= 50000)
			rate = 10;
		if(period > 5)
			rate = rate + 1;
		return rate;
	}

	double GetIntrest(bool rate1)
	{	
		double amt = 0;
		rate = IntrestRate();
		if (rate1 == true)
		{
			amt = amount * pow((1 + rate / 100), period);
			intrest = amt - amount;
		}
		else 
		{
			intrest = amount * period * rate / 100;
		}
		return intrest;
	}
	private:
	double amount;
	int period;
	double rate;
	double intrest;
};
