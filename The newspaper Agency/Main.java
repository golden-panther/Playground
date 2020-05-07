#include<iostream>
using namespace std;
int main()
{
  int w,x,y;
  int z=100;
  cin>>w>>x>>y;
  int income = w*x;
  int cost = w*y+z;
  int profit = income - cost;
  cout<<profit;
  return 0;
}