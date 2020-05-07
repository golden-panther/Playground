#include <iostream>
using namespace std;
 
int main() {
	int row, col, tnum;
	cin>>row>>col>>tnum;
 	int total = col*row;
 	int x=total-row, y=x-row;
	if(tnum>row && tnum<=row*2)
		cout<<"It is a mango tree";
	else if(tnum<=x && tnum>y)
		cout<<"It is a mango tree";
  	else 
      cout<<"It is not a mango tree";
 
	return 0;
}