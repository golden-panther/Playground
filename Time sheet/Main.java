#include <iostream>
using namespace std;

int main() {
	int day[7],sal=0,x,y=0,z,a,b,c,d,e,f,g,h,i;
	for(i=0;i<7;i++)
	cin>>day[i];
		for(i=1;i<6;i++)
		{
			y+=day[i];
			sal+=day[i]*100;
			if(day[i]>8)
			{
				x=day[i]-8;
				sal+=x*15;
			}
		}
	if(day[0]==0 && day[6]==0)
	{
		if(y>40)
		{
			z = 40-y;
			sal+=z*25;
		}
	}
	else if(day[0]>0 && day[6]==0)
	{
		a=day[0]*100;
		b = a + a/2;
		sal+=b;
		
	}
	else if(day[0]==0 && day[6]>0)
		{
		c=day[6]*100;
		d = c + c/4;
		sal+=d;
		
	}
	else if(day[0]>0 && day[6]>0)
	{
		e=day[0]*100;
		f = e + e/2;
		sal+=f;
		
		g=day[6]*100;
		h = g + g/4;
		sal+=h;
		
	}
	cout<<sal;
	return 0;
}