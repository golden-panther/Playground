#include <iostream>
using namespace std;
 
int main() {
	int row, col, tnum;
	cin>>row>>col>>tnum;
	if(tnum<=row || tnum%row==1 || tnum%col==0)
	cout<<"Yes";
	else
	cout<<"No";
 
	return 0;
}