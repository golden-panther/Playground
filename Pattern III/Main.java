#include <iostream>
using namespace std;

int main() {
	int n,i,j;
	cin>>n;
	cout<<"1\n";
	for(i=2;i<=n;i++)
	{
		for(j=1;j<i;j++)
		{
			cout<<i<<"*";
		}
		cout<<i<<"\n";
		
	}
	
	for(i=n;i>=2;i--)
	{
		for(j=1;j<i;j++)
		{
			cout<<i<<"*";
		}
		cout<<i<<"\n";
		
	}
	
	cout<<"1";
	
	return 0;
}