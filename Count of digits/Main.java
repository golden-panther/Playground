#include<iostream>
using namespace std;
int main()
{
  int n, temp, i;
  cin>>n;
  do
  {
    //temp = n%10;
    i++;
    n = n/10;
}while(n>0);
  cout<<i;
  return 0;
}