#include "Assignment4.h"
#include<cstdio>
#include<iostream>

using namespace std;
int main(void)
{
	double principle;
	int period;
	
	cout << "Enter Principle Amount : " << endl;
	cin  >> principle;
	cout << "Enter Period : " << endl;
	cin  >> period;

	PersonalLoan pl(principle,period);
	cout << "Total EMI for Personal Loan :" << pl.GetEMI(principle,period) << endl;
	HomeLoan hl(principle,period);
	cout << "Total EMI for Home Loan : " << hl.GetEMI(principle,period) << endl;

}
