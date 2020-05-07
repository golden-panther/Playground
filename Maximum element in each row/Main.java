#include<iostream>
using namespace std;
int main()
{
  int r,c,i,j,max;
  cin>>r>>c;
  int a[r][c];
  for(i=0;i<r;i++)
  {	
    max=0;
  	for(j=0;j<c;j++)
    {
    	cin>>a[i][j];
      	if(a[i][j]>max)
          max = a[i][j];
    }
    cout<<max<<"\n";
  }
}