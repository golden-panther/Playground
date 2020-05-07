#include<iostream>
using namespace std;
int main(){
  int n,i,even=0,odd=0;
  cin>>n;
  int *p = (int *)malloc(n * sizeof(int));
  for(i=0;i<n;i++)
  {
  	cin>>p[i];
  }
  for(i=0;i<n;i++)
  {
  	if(p[i]%2==0)
      even++;
    else
      odd++;
  }
  cout<<odd<<"\n"<<even;
  return 0;
}