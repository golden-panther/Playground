#include<iostream>
using namespace std;
int main()
{
  int n,i,flag=0;
  cin>>n;
  int a[n];
  for(i=0;i<n;i++)
  {
  	cin>>a[i];
  }
  int x;
  cin>>x;
  for(i=0;i<n;i++)
  {
  	if(a[i]==x)
    { flag++;
    	break;
    }
  }
  if(flag>0)
    cout<<"She passed her exam";
  else
    cout<<"She failed";
  
}