#include<iostream>
using namespace std;
int main()
{
	int n,x=6,y=0,count=0;
  cin>>n;
  while(true)
  {
  cout<<x<<" ";
    y+=5;
  x +=y;
    count++;
    if(count==n)
	break;
  }
	return 0;
}