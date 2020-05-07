#include<iostream>
using namespace std;
int main(){
  int n,i;
  cin>>n;
  int fact=1;
  if(n==1)
    cout<<fact;
  else
  {
    for(i=1;i<=n;i++)
    fact*=i;
  	cout<<fact;
	}
}