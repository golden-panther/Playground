#include<iostream>
using namespace std;
int main()
{
  char i,name[200];
  cin>>name;
  for(i=0;name[i]!='\0';i++)
  {
  	if(name[i]>=65 && name[i]<=90 || name[i]>=97 && name[i]<=122)
      cout<<name[i];
  
  }
}