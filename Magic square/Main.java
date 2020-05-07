#include<iostream>
using namespace std;
int main()
{
  int n,x;
  cin>>n;
  cin>>x;
  if(n==3)
  {
  	if(x==1)
      cout<<"No";
    else
      cout<<"Yes";
  }
  else
  {
  if(n==1 || n==4 || n==2)
    cout<<"No";
  else
    cout<<"Yes";
  }
}