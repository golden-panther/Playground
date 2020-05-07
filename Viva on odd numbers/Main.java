#include <iostream>
using namespace std;

int main() {
	int a,count = 3;
	float score;
	while(count>0)
	{
		cin>>a;
		if(a<0)
		{score -=1;
		count=0;}
		else
		{
			if(a%2==0)
				score-=0.5;
			else
				{
					score+=1;
					count --;
				}
				
		}
	}
printf("%.1f",score);
	return 0;
}