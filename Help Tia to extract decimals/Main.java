#include<iostream>
#include<string>
using namespace std;
int main() 
{ 
	string fnum, dot(".");
	cin>>fnum;
  cout<<"Floating part is : ";
  int i, x = fnum.find(dot);
  if(x!=string::npos)
  for(i=x+1;i<fnum.length();i++)
    cout<<fnum[i];
  
}