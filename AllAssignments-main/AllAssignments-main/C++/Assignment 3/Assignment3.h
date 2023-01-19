
#include<cstdio>
#include<cstring>
#include<iostream>

using namespace std;
class Patient
{
   public:
	short int patientId;
	char patientName[30];
	short int bType;
	int noOfDays;   
	double amount=0;

	Patient()
	{
		patientId = 101;
		strcpy(patientName,"Sagar") ;
		bType = 1;
		noOfDays = 10;	
	}

	Patient(short a,char b[30],short c ,int d)
	{
		patientId = a;
		strcpy (patientName, b);
		bType = c;
		noOfDays = d;
	}
	
	virtual double getBillAmount()
	{
		double price = 0;
		switch(bType)
		{
			case 1:
				price = 500;
				break;
			case 2:
				price = 350;
				break;
			case 3:
				price = 200;
				break;
			default:
				price = 100;
		}
		amount = noOfDays * price; 
		//printf("Amount === %lf\n",amount);
		//printf("noOfDays === %d\n",noOfDays);
		//printf("price === %lf\n",price);
		return amount;
	}

	~Patient()
	{


	}
	
};

class InHousePatient : public Patient
{
     public:
	
	InHousePatient(short pid,char pname[30],short bedtype,int nodays,float dis) : Patient(pid,pname,bedtype,nodays)
	{
		discount = dis;
	}

	double getBillAmount()  
	{
		double amount = 0;
		amount = Patient :: getBillAmount();
		if (amount > 5000)
		{
			amount = amount * (1 - discount/100);
		}
		else 
			amount = amount * 0.95;
		return amount;
	}
     private:
  	float discount = 0;
};
