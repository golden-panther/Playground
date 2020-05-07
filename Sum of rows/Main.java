#include<iostream>
using namespace std;
int main()
{
  int r,c,i,j,sum;
  cin>>r>>c;
  int a[r][c];
  for(i=0;i<r;i++)
  {sum=0;
  for(j=0;j<c;j++)
  {
  	cin>>a[i][j];
    sum+=a[i][j];
  }
   cout<<sum<<"\n";
  }
}