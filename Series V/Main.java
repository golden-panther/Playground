#include<iostream>
using namespace std;
int main()
{
  int n,x=121,count=0,y;
  cin>>n;
  while(true)
  {
  cout<<x<<" ";
    count++;
    y = 11 + (4*count);
    x = y*y;
    if(count==n)
      break;
  
  }
}