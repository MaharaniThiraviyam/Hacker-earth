#include<iostream>
using namespace std;
int main(){
 long int a[100000];
 int i,temp,n,t,z,l,r;
  cin>>n;

  //get input
  for(i=1;i<=n;i++)
   cin>>a[i];

   cin>>t;

  //opearations
  for(z=0;z<t;z++){
   cin>>l>>r;
   for(i=l;i<=r;i++){
    temp=a[i];
    a[i]=a[n-i+1];
    a[n-i+1]=temp;
    }
  }

  for(i=1;i<=n;i++)
    cout<<a[i]<<" ";
  return 0;
}
