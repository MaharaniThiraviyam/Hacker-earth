#include<iostream>
using namespace std;
int main(){
 int n;
  cin>>n;
 int a[n],b[n],i;
  for(i=0;i<n;i++)
   cin>>a[i];
  for(i=0;i<n;i++)
   cin>>b[i];
  for(i=0;i<n;i++)
   cout<<a[i]+b[i]<<" ";
   return 0;

}
