#include<iostream>
using namespace std;
int main()
{
  int n,score=0,temp,count=0;
  cin>>n;
  while(true)
  {
  	cin>>temp;
    score+=temp;
    count++;
  	if(score>=n)
      break;
  }
  cout<<"The number of turns is "<<count;
}