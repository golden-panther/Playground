#include<iostream>
using namespace std;
int main()
{
  int a,b,i,sum,p;
  cin>>a>>b;
  for(i= a; i<= b; i++){
                   p=1;
                   while(p<=(i/2)){
                   if(i % p == 0)
                   sum=sum+p;
                   p++;
                   }
                   if(sum==i)
                   printf("%d ",i);
                   sum=0;
                   }
                   return 0;
                
}