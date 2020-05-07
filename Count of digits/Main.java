#include<iostream>
int main()
{
 int n,t,c=0;
  std::cin>>n;
do{   n=n/10;
      c++;
  }while(n!=0);
std::cout<<c;
}