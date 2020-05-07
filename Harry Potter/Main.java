#include<iostream>
using namespace std;
int main()
{
char door[4];
cin>>door;
int a,b,c;
a=door[0] - '0';
b=door[3] - '0';
c=a+b;
cout<<c;
}