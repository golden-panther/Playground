#include<iostream>
using namespace std;
int atype(int n, int *a)
{
	int i, even=0,odd=0;
  	for(i=0;i<n;i++)
    {
    	if(a[i]%2==0)
          even++;
      	 if(a[i]%2!=0)
          odd++;
    }
  if(even==n)
    return 1;
  else if(odd==n)
    return 2;
  else 
    return 3;

}
int main()
{
  int n,i;
 cout<<"Enter the number of elements in the array\n";
  cin>>n;
  int a[n];
  cout<<"Enter the elements in the array\n";
  for(i=0;i<n;i++)
  cin>>a[i];
  int result = atype(n,a);
  if(result==1)
    cout<<"The array is Even";
  else if(result==2)
    cout<<"The array is Odd";
  else if(result==3)
    cout<<"The array is Mixed";
  return 0;
}