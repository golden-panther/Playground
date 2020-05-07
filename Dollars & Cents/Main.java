#include<iostream>
using namespace std;
int main()
{
  int a,b,c,d,x,y,i;
  cin>>a>>b>>c>>d;
  x = a+c;
  y = b+d;
  if(y>=100)
  {
  i = y/100;
    x = x+i;
    y = y - (100*i);
  }
  cout<<x;
  cout<<"\n"<<y;
}