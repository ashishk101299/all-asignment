#include "Assignment3cp.h"
#include<cstdio>
#include<iostream>
#include<cstring>

double getHospitalExp(Patient& pp)
{
	double amount = pp.getBillAmount();
	amount = amount * 1.18;
	return amount;
}

int main(void)
{
	using namespace std;
	short pid;
	char pname[30];
	short bedtype;
	int nodays;
	float dis;
	int ptype;

	Patient p;
	cout << "Enter patient id : " << endl;
	cin  >> pid;
	cout << "Enter patient name : " << endl;
	cin  >> pname;
	cout << "Enter Bed type :" << endl;
	cin  >> bedtype;
	cout << "Enter Admitted Days : " << endl;
	cin  >> nodays;
	cout << "Enter Discount percentage :" << endl;
        cin  >> dis;
	cout << "Patient Type :1.Normal Patient  2.Inhouse Patient " << endl;	
	cin  >> ptype;

	Patient pp(pid,pname,bedtype,nodays);
	InHousePatient ip(pid,pname,bedtype,nodays,dis);
	if ( ptype == 1)
	{
		cout << "!!!!!!!!!Every Life Matters!!!!!!!!!!!" <<endl <<endl;
		cout << "Patient Name :" << pname << endl;
		cout << "Bill for Patient " <<pname << " = " << pp.getBillAmount() << endl;
		cout << "Total Bill including GST = " << getHospitalExp(pp) << endl << endl;
		cout << "=====Thank you for Visiting Lilavati Hospital=====" <<endl;
	}
	else if(ptype == 2)
	{
		cout << "!!!!!!!!!Every Life Matters!!!!!!!!!!!" <<endl <<endl;
		cout << "Patient Name :" << pname << endl;
		cout << "Bill for InHouse Patient " << pname << " = " <<ip.getBillAmount() << endl;
		cout << "Total Bill Including GST =" << getHospitalExp(ip) <<endl;	
		cout << "=====Thank you for Visiting Lilavati Hospital=====" << endl <<endl;
	}
	else 
		cout << "!Wrong Patient Type !!!!!" << endl;
}

