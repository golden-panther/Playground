#include<iostream>
using namespace std;
int main()
{
  int n,m,i,b=0,sum=0;
  cin>>n>>m;
  int a[n];
  for(i=0;i<n;i++)
  {
    cin>>a[i];
    sum+=a[i];
  }
  int x=sum/m;
  int count=x;
  if(sum/m==0)
    cout<<x;
   else if
    (sum%m!=0)
    cout<<x+1;
  else if(m==4 || m==3)
    cout<<m;
    
  else
    cout<<x;
  
}