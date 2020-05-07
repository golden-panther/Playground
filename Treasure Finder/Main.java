#include <iostream>
#include <algorithm>
using namespace std;

int main() {
	int a,b,c,x;
	cin>>a>>b>>c;
	if(a>=b && a<=c || a>=c && a<=b)
	x=a;
	else if(b>=a && b<=c || b>=c && b<=a)
	x=b;
	else if(c>=b && c<=a || c>=a && c<=b)
	x=c;
	cout<<"The treasure is in box which has number "<<x;
	int y = __gcd(a,b);
	int z = __gcd(y,c);
	cout<<"\nThe code to open the box is "<<z;
	
	return 0;
}