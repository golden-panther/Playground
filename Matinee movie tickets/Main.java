#include<iostream>
using namespace std;
int main()
{
  float m=10.15, ma=13.30, f=18.00, s=22.00, t;
  int age;
  cin>>age>>t;
  if(t==ma)
  {
    if(age<13)
      cout<<"$2.00";
    else
  		cout<<"$5.00";
}
  else if(t==m || t==f || t==s)
  {
    if(age>13)
      cout<<"$8.00";
    else
  		cout<<"$4.00";
}
  return 0;
}