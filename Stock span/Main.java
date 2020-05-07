#include<iostream>
using namespace std;
int main()
{
 int n,i,j;
  cin>>n;
  //cout<<n<<"\n";
  int a[n],b[n];
  a[n]={0};
  b[n]={0};
  int c=0;
  int k=1;
  for(i=0;i<n;i++)
    cin>>a[i];
 for(i=0;i<n;i++)
    b[i]=a[i];
  cout<<k<<"\n";
  for(i=0;i<n-1;i++)
  {
      if(a[i]>a[i+1])
      cout<<k<<"\n";
      else{
      c=c+2;
      cout<<c<<"\n";
      
      }
    }
}

/*
#include<iostream>
using namespace std;
int main()
{
  int n,i,j;
  cin>>n;
  int p[n],s[n];
  for(i=0;i<n;i++)
    cin>>p[i];
  s[0]=1;
  for(i=1;i<n;i++)
  {
  		s[i]=1;
    for(j=i-1;(j>=0)&&(p[i]>=p[j]);j--)
      s[i]++;
  }
  for(i=0;i<n;i++)
    cout<<s[i]<<"\n";
} 
*/