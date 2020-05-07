#include <iostream>
#include<cmath>
using namespace std;

int main() {
	float n;
	cin>>n;
	float days=n;
	float temp = 1/sqrt(n);
	while(n>1)
	{
		n = n*temp;
		days +=n;
		
	}
	int ans = int(days);
  cout<<ans;
	return 0;
}