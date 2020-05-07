#include<iostream>
using namespace std;
int main()
{
  int n,i,even=0,odd=0,temp;
  cin>>n;
  for(i=0;i<n;i++)
  {
  	cin>>temp;
    if(temp%2==0)
      even+=temp;
    else
      odd+=temp;
  }
  cout<<"The sum of the even numbers in the array is "<<even<<"\n";
  cout<<"The sum of the odd numbers in the array is "<<odd;
}