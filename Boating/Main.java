#include<iostream>
using namespace std;
int main()
{
  int max, adult, child, ans, a, b;
  a = 75;
  b = 30;
  cin>>max>>adult>>child;
  ans = (adult*a)+(child*b);
  if(ans<=max)
    cout<<"Boat is stable";
  else
    cout<<"Boat will drow";
  return 0;
}