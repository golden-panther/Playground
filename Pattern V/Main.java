#include <iostream>
using namespace std;

int main() {
	int n,i,j,lterm=1,rterm,dc=0;
	cin>>n;
	/*for(i=1;i<=n;i++)
	t+=i;
	t=2*t;*/
	rterm=n*n +1;
	for(i=n;i>0;i--)
	{
		for(j=1;j<=dc;j++)
		{
			cout<<"-";
		}
		dc+=2;
		for(j=1;j<=i;j++)
		{
			cout<<lterm<<"*";
			lterm++;
		}
		for(j=1;j<=i;j++)
		{
			cout<<rterm;
			rterm++;
			if(j!=i)
			cout<<"*";
		}
		rterm = rterm - (i - 1) * 2 - 1;
		cout<<"\n";
	}
	
	return 0;
}
