#include<iostream>
using namespace std;
int main(){
 long int i,max=0,n,j;
  cin>>n;
 long int a[n];
  for(i=0;i<n;i++)
   cin>>a[i];

  for(i=n-1,j=n-1;i>=0;i--){
     if(a[i]>max){
      max=a[i];
      a[j]=a[i];j--;
      }
   }
   for(i=j+1;i<=n-1;i++)
     cout<<a[i]<<" ";
  return 0;
}
