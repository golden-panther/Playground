#include<iostream>
using namespace std;
int main()
{
  cout<<"Enter the number of elements in the array\n"<<
"Enter the elements in the array\n"<<
"Enter the location where you wish to insert an element\n";
    
  int n,p,v,i;
  cin>>n;
  int a[n];
  for(i=0;i<n;i++)
	cin>>a[i];
  cin>>p>>v;
  int b[n+1];
  if(v==0)
    cout<<"Invalid Input";
  else
  {
    cout<<"Enter the value to insert\n";
    cout<<"Array after insertion is\n";
  for(i=0;i<p-1;i++)
  {
  	b[i]=a[i];
  }
  b[p-1]=v;
  for(i=p;i<n+1;i++)
  {
  	b[i]=a[i-1];
  }
  for(i=0;i<n+1;i++)
    cout<<b[i]<<"\n";
  }
}