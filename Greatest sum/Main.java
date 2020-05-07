#include<iostream>
using namespace std;
int main()
{
  int r,c,i,j,rsum,csum,x=0,y=0,count=0;
  cin>>r>>c;
  int a[r][c];
  cout<<"Sum of rows is ";
  for(i=0;i<r;i++)
  {	rsum=0;
  	for(j=0;j<c;j++)
    {
    	cin>>a[i][j];
      	rsum += a[i][j];
    }
    cout<<rsum<<" ";
    if(rsum>x)
    {
      count++;
     x=rsum;
    }
  }
  cout<<"\n";
  cout<<"Row "<<count<<" has maximum sum\n";
  
  cout<<"Sum of columns is ";
  count = 0;
  for(i=0;i<c;i++)
  {	csum=0;
  	for(j=0;j<r;j++)
    {
      	csum += a[j][i];
    }
    cout<<csum<<" ";
    if(csum>y)
    {
    	count++;
      y = csum;
    }
  }
  cout<<"\n";
  cout<<"Column "<<count<<" has maximum sum";
}