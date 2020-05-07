#include <iostream>
using namespace std;
int main() 
{
	int num, rnum=0, rem;
  cin>>num;
  while(num!=0)
  {
  rem = num%10;
    rnum= rnum*10 + rem;
    num  = num/ 10;
  }
  cout<<rnum;
	return 0;
}