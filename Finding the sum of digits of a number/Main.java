#include<stdio.h>
int main()
{
int i,s=0,r;
 scanf("%d",&i);
  while(i!=0)
  {
    r=i%10;
    s=s+r;
    i=i/10;
  }
  printf("%d",s);
}
    