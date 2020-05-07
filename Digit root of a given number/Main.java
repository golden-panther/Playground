#include<iostream>
using namespace std;
int one(int n)
{
	int temp,sum=0;
  if(n<=9)
    return n;
  else
  {
    while(n>0)
  {
  	temp = n%10;
    sum+=temp;
    n/=10;
  }
    return one(sum);
  }
}
int main()
{
int n;
  cin>>n;
  cout<<one(n);
  
return 0;
}