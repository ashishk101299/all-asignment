//#define TESTING
#include "Assignment2.h"
#include <cstdio>

int main(void)
{
	int r, p;
	printf("Enter Rupees and Paise 1  :");
	scanf("%d%d",&r,&p);
	Money m1(r, p);
	printf("Enter Rupees and Paise 2  :");
	scanf("%d%d",&r,&p);
	Money m2(r, p);
	Money m3 = m1 + m2;
	printf("\nAmount 1 + Amount 2       = ");
	m3.Print();
	printf("Total Amount in Paise     = %d\n\n",m3.Cash());
	Money m4 = m1 - m2;
	printf("Amount 1 - Amount 2       = ");
	m4.Print();
	printf("Total Amount in Paise     = %d\n",m4.Cash());
//	printf("Amount++                  = ");
//	m1(&r);
//	m1.Print();
}
