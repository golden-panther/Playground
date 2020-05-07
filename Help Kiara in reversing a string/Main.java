#include <iostream>
#include<cstring>
using namespace std;
int main()
{
char str[100],rev[100];     
int i;    
  cin.getline(str,100);
  int end=strlen(str);
  for(i=end-1;i>=0;i--)
  {
  	cout<<str[i];
   
  }
}