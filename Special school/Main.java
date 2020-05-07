#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int main()
{
  string name,rev;
  cin>>name;
  cin>>rev;
  reverse(name.begin(),name.end());
  if(name==rev)
    cout<<"It is correct";
  else
    cout<<"It is wrong";
}