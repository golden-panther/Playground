#include<iostream>
using namespace std;
int main()
{
  int m,count=0;
  cin>>m;
  if(m==1)
  cout<<"0";
  if(m==2)
  cout<<"1";
  int a=0,b=1,x;
  while(count<m-2)
  {
  	x = a+b;
  	a = b;
  	b = x;
  	m--;
  }
  cout<<x;
}