#include<iostream>
#include<algorithm>
using namespace std;
int main()
{
	int a,b,c,x,y,z;
  cin>>a>>b>>c>>x;
  y = __gcd(a,b);
  z = __gcd(y,c);
  if(z==x)
    cout<<"Answer is correct.";
  else
    cout<<"Answer is wrong.";

	return 0;
}
  