#include<iostream>
using namespace std;
int main()
{
  int a,b,c,num;
  cin>>a>>b>>num;
  cout<<"Enter first number : Enter second number : Menu"
<<"\n1.Addition"
<<"\n2.Subtraction"
<<"\n3.Multiplication"
<<"\n4.Division"
<<"\n5.Remainder\n";
  switch(num)
  { case 1: c = a+b;
  cout<<c;
  break;
   case 2: c=a-b;
     cout<<c; 
   break;
   case 3: c=a*b;
   cout<<c;
   break;
   case 4: c=a/b;
   cout<<c; 
   break;
   case 5: c=a%b;
   cout<<c; 
   break;
   default: 
   cout<<"Invalid operation";
   break;
  }
return 0;
}
  