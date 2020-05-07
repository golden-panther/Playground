#include<iostream>
using namespace std;
int main()
{
  int n,num=0,num2,flag,ans;
  cin>>n;
  while(true)
  {
    num++;
    num2=num*num;
    if(num%2==0)
      flag=2;
    else
      flag=1;
    ans=num2-flag;
  	cout<<ans<<" ";
    if(num==n)
      break;
  }
  return 0;
}