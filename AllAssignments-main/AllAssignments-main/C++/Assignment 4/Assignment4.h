class Loan
{ 
	public:
	virtual float GetRate()=0;

	double GetEMI(double principle,int period)
	{
		double emi;
		float rate = GetRate();
		emi = principle * (1 + rate * period /100) / (period * 12);
		return emi;
	}
};

class PersonalLoan : public Loan
{
	public:
	PersonalLoan(double pp,int n)
	{
		principle = pp;
		period = n;
	}

	float GetRate()
	{
		float rate;
		rate = principle <= 500000 ? 15 : 16;
		return rate;		
	}
	private:
	double principle;
	int period;
};
class HomeLoan : public Loan
{
	public:
	HomeLoan(double pp,int n)
	{
		principle = pp;
		period = n;
	}

	float GetRate()
	{
		float rate;
		rate = principle <= 2000000 ? 10 : 11;
		return rate;
	}
	private:
	double principle;
	int period;
};
