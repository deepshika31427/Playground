#include<stdio.h>
int main() {
  int no,sq,ans;
  scanf("%d",&no);
  ans=fun(no);
   printf("%d",ans);
   return 0;
}
  int fun(int n)
  {
    return (n*n);
  }
