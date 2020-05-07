#include<iostream>
using namespace std;
int main()
{
	int n,count=0;
  	cin>>n;
  float x=0.5;
  while(true)
  {
  	cout<<x<<" ";
    x*=3;
    count++;
    if(count==n)
      break;
  }
  
  
  /*for (i=0;i<n;i++)
    {
      	cout<<x<<" ";
    	x*=3;
    }*/
	return 0;
}