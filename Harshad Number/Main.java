#include<iostream>
using namespace std;
int main()
{
  int n,temp,sum=0;
  cin>>n;
  int h = n;
  while(n>0)
  {
    temp = n%10;
    sum += temp;
    n/=10;
  }
  if(h%sum==0)
    cout<<"Harshad Number";
  else
    cout<<"Not Harshad Number";
  return 0;
}