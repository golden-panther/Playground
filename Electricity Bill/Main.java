#include<iostream>
using namespace std;
int main()
{
  int unit;
  float bill;
  cin>>unit;
  if(unit<=200)
    bill = 0.5*unit;
  else if(unit>200 && unit<=400)
    bill = (0.65*unit)+100;
  else if(unit>400 && unit<=600)
	bill = (0.80*unit)+200;
  else if(unit>600)
    bill = (1.25*unit)+425;
  int x = int(bill);
  cout<<"Rs."<<x;
  return 0;
}