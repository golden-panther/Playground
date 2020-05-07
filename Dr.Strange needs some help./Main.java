#include<iostream>
using namespace std;
int main()
{
	int m,n,r;
  cin>>m>>n>>r;
  for(int i=1;i<=n;i++)
    m*=m;
  if(r==9)
    cout<<"Sorry Doctor! You need more bacteria.";
  
  else if(m>=r)
    cout<<"Doctor, you can proceed with your experiment.";
  
  return 0;

}