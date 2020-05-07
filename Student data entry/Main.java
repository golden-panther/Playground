#include <iostream>
using namespace std;
struct student
{
    char name[50];
    int roll;
    float marks;
}x;
int main() 
{
  cin.getline(x.name,50);
  cin>>x.roll;
  cin>>x.marks;
  cout<<"\nStudent Details\n";
  cout<<"Name: "<<x.name<<"\n";
  cout<<"Roll: "<<x.roll<<endl;
  cout<<"Marks: "<<x.marks<<endl;
}