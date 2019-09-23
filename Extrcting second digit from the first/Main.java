#include<stdio.h>
int main()
{
int n,s;
  scanf("%d",&s);
  while(s>=100)
  {
    s=s/10;
  }
  n=s%10;
  printf("%d",n);
}