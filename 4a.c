//series print 
#include<stdio.h>
int main(){
    int n,i;
    int sum=0;
    printf("Enter the n i.e. max values of series: ");
    scanf("%d",&n);
    printf("Sum of the series: ");
    for(i =1;i <= n;i++){
         if (i!=n)
             printf("%d \t",i);
         else
             printf("%d",i);
         }
    return 0;
}
