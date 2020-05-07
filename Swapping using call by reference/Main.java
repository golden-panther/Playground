#include<iostream>
using namespace std;
int main()
{
   int a,b;
cin>>a>>b;

   printf("Before swapping a= %d and b=%d\n", a,b);

   int t;
   t = a;
  a =b;
  b = t;

   printf("After swapping a= %d and b=%d", a,b);

   return 0;
}