#include<cstdio>

class Money
{
public:
	Money(int r, int p)
	{
		rupees = r + p / 100;
		paise = p % 100;
		#ifdef TESTING
		puts("Constructor Initialised");
		#endif
	}

/*	Money(const Money& source)
	{
		rupees = source.rupees;
 		paise = source.paise;
		#ifdef TESTING
		puts("Copy Constructor Initialised");
		#endif
	}*/

	int Cash()
	{
		return 100 * rupees + paise;
	}

	void Print() const
	{
		printf("%d:%02d\n",rupees, paise);
		//	bonus = b;
	}

	Money operator-(Money& rhs) 
	{
		if(paise < rhs.paise)
		{
			paise = paise + 100;
			rupees = rupees - 1;
		}
		else
		{
			paise = paise;
		}
		return Money(rupees - rhs.rupees , paise - rhs.paise);	
	}

	Money operator+(const Money& rhs)const 
	{
		return Money(rupees + rhs.rupees , paise + rhs.paise);
	}

/*	Money operator++(int n)const 
	{
		return Money(rupees + n , paise + n);
	}*/
	~Money()
	{	
		#ifdef TESTING
		puts("Destructor Initialised");
		#endif
	}

	private:
	int rupees;
	int paise;
};
