#include<iostream>
using namespace std;
int main()
{
  int n,count;
  cin>>n;
  while(n>1)
  {
    cout<<n<<"\n";
    if(n%2==0)
      n/=2;
    else
      n = (3*n)+1;
    count++;
}
  cout<<"1\n";
  cout<<count;
  return 0;
}