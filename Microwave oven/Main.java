#include<iostream>
using namespace std;
int main()
{
  int n;
  float t;
  cin>>n>>t;
  if(n>3)
    cout<<"Number of items is more";
  else if(n==3)
    cout<<2*t;
  else if(n==2)
    cout<<(0.5*t)+t;
  else if(n==1)
    cout<<t;
  return 0;
}