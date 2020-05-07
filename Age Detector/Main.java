#include<iostream>
using namespace std;
int main()
{
  int birth, current, age;
  cin>>birth>>current;
  if(current>birth)
    age = current - birth;
  else if (current<birth)
  {current = current +100;
  age = current - birth;}
   cout<<age;
  return 0;
}