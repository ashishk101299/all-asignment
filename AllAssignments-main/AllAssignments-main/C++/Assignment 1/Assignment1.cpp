#include "Assignment1.h"
#include <cstdio>
#include<iostream>
#include <math.h>

int main(void)
{
	double amount=0;
	int period;
	int rate;
	bool rate1;

	std::cout << "Enter Investment Amount : " << std::endl;
	std::cin >> amount; 
	std::cout << "Enter Investment Period : " << std:: endl;
	std::cin >> period;
	std::cout << "Enter Intrest type - [1 for CI] /[0 for SI] " << std::endl;
	std::cin >> rate;

	if(rate != 0)
		rate1 = true;
	else
		rate1 = false;

	Investment investment;
	investment.SetValues(amount,period);
	std::cout << "Total Intrest = " << investment.GetIntrest(rate1) << std::endl;
}
