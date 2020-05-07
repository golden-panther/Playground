#include<iostream>
using namespace std;
int main()
{
  int fp, fd, fs, sp, sd, ss, ap, ad, as, f, s, a, x, y, z;
  cin>>fp>>fd>>fs>>sp>>sd>>ss>>ap>>ad>>as;
  x = fp - (fd*fp/100);
  y = sp - (sd*sp/100);
  z = ap - (ad*ap/100);
  f = x + fs;
  s = y + ss;
  a = z + as;
  cout<<"In Flipkart Rs."<<f<<"\n";
  cout<<"In Snapdeal Rs."<<s<<"\n";
  cout<<"In Amazon Rs."<<a<<"\n";

  if ( f <= s && f <= a)
    cout<<"He will prefer Flipkart";
  else if ( s < f && s < a)
    cout<<"He will prefer Snapdeal";
  else if ( a < s && a < f )
    cout<<"He will prefer Amazon";
  return 0;
}