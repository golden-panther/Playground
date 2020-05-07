#include <iostream>
using namespace std;

int main() 
{
	int n,i,j,k,count=1;
	cin>>n;
	cout<<"1\n";
	if(n==1)
	;
	else
	{
	for(i=2;i<=n;i++)
	{
		if(i%2==0)
		{	
			for(j=1;j<=i;j++)
			{
				count++;	
			}
			k = count;
			for(j=1;j<i;j++)
			{
				cout<<k<<"*";
				k--;
			}
			cout<<k<<"\n";
			count++;
		}	
		else
		{
			for(j=1;j<i;j++)
			{
				cout<<count<<"*";
				count++;
			}
			cout<<count<<"\n";
			//count++;
		}
		
	}
	}
	return 0;
}