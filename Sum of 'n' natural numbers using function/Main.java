#include<stdio.h>
int main() {
   int no,sum;
  scanf("%d",&no);
  sum=fun(no);
  printf("%d",sum);
  	return 0;
}
int fun(int n)
{
  int i,re;
    for(i=1;i<=n;i++)
      re=re+i;
  return re;
}
      