#include<iostream>
using namespace std;
int main()
{
  char door[10];
  int rail;
  cin>>door>>rail;
 if ((door[0]=='f' && rail ==1) || (door[0]=='r' && rail==2))
    cout<<"Left Handed";
  else if((door[0]=='f' && rail ==2) || (door[0]=='r' && rail==1))
    cout<<"Right Handed";
    else if(door[0]=='r')
      cout<<"Left Handed";
 else
   cout<<"Right Handed";
  return 0;
}