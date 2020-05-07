#include<iostream>
using namespace std;
int main()
{
  struct empl
  {
  	char name[50];
    int id;
    int age;
    char des[50];
    int sal;
  } emp;
  cout<<"Enter name:\nEnter ID:\nEnter age:\nEnter designation:\nEnter Salary:\n";
  cout<<"Employee Details\n";
  cin>>emp.name;//.getline(emp.name,50);
  cin>>emp.id>>emp.age;
  cin>>emp.des;//.getline(emp.des,50);
  cin>>emp.sal;
  cout<<"Name of the Employee : "<<emp.name<<"\nID of the Employee : "<<emp.id;
cout<<"\nAge of the Employee : "<<emp.age;
cout<<"\nDesignation of the Employee : "<<emp.des;
cout<<"\nSalary of the Employee : "<<emp.sal;
}