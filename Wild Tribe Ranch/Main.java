#include<iostream>
using namespace std;
int main()
{
  int a,b;
  cin>>a>>b;
  if(a==b)
    cout<<"Yes, you can enter. Kindly use a rope.";
  else if(b<a)
    cout<<"Yes, you can enter.";
  else if(b>a)
    cout<<"Sorry, you can't enter";
  return 0;
}