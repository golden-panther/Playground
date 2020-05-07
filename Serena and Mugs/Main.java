#include<iostream>
using namespace std;
int main()
{
  int n,s,i,flag=0,sum=0;
  cin>>n>>s;
  int v[n];
  for(i=0;i<n;i++)
    cin>>v[i];
  for(i=0;i<n-1;i++)
  {
    sum+=v[i];
    if(sum>=s)
    {flag = 1;
      break;}	
  }
  if(flag==1)
    cout<<"NO";
  else
    cout<<"YES";
}