#include<iostream>
using namespace std;
int main()
{
	int n,i,j;
  cin>>n;
  for(i=1;i<=4;i++)
  {
  	for(j=1;j<=i;j++)
      cout<<n;
    n++;
    cout<<"\n";
  }
  n--;
  for(i=4;i>=1;i--)
  {
  	for(j=i;j>=1;j--)
      cout<<n;
    n--;
    cout<<"\n";
  }
  
	return 0;
}