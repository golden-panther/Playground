#include <iostream>
using namespace std;
int main() {
    int n,i,j,count=1;
  cin>>n;
  for(i=1;i<=n;i++)
  {
  	if(i%2==0)
    {
    	cout<<count+1;
      for(j=1;j<n;j++)
        {
        	cout<<count;
        }
      count++;
      cout<<'\n';
    }
    else
    {
    	for(j=1;j<n;j++)
        {
        	cout<<count;
        }
      	count++;
      cout<<count<<"\n";
    }
  }
    return 0;
}