#include<iostream>
using namespace std;
int main()
{
  int n,i,high=0;
  cin>>n;
  int a[n];
  for(i=0;i<n;i++)
  {
  	cin>>a[i];
    if(a[i]>high)
      high = a[i];
    
  }
  cout<<high;

}