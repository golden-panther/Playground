#include <cstring>
#include <iostream>
using namespace std;
int main()
{
char c[100];
cin.getline(c,100);
  char x[100]="There are some things money can't buy. For everything else, there's MasterCard.";
    if(strcmp(c,x)==0)
       cout<<"Caption not eligible for the contest";
  else
  { if(strlen(c)<=100)
    cout<<"Caption eligible for the contest";
  else
    cout<<"Caption not eligible for the contest";
}}