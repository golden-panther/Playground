#include<iostream>
using namespace std;
int main()
{
  float m;
  int p,d;
  cin>>m>>p>>d;
  int x = int(m);
  if(x*p>=d)
    cout<<"Can reach";
  else
    cout<<"Cannot reach";
  return 0;
}