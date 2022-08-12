//grading in Sonargaon University
#include<stdio.h>
#include<conio.h>
int main()
{
    int i,n;
    float mark, sum=0, avg;
    printf("Enter Marks obtained in  Subjects: ");
    scanf("%d", &n);
    for(i=0; i<n; i++)
    {
        scanf("%f", &mark);
        sum = sum+mark;
        if(mark>=0 && mark<=39){
        	printf("fail");
		}
	}
    avg = sum/n;
    printf("\nGrade = ");
    if(avg>=80 && avg<=100)
        printf("A+");
    else if(avg>=75 && avg<=79)
        printf("A");
    else if(avg>=70 && avg<=74)
        printf("A-");
    else if(avg>=65 && avg<=69)
        printf("B+");
    else if(avg>=60 && avg<=64)
        printf("B");
    else if(avg>=55 && avg<=59)
        printf("B-");
    else if(avg>=50 && avg<=54)
        printf("C+");
    else if(avg>=45 && avg<=49)
        printf("C");
    else if(avg>=40 && avg<=44)
        printf("D");
    else if(avg>=0 && avg<=39)
        printf("F");
    else
        printf("Invalid!");
    getch();
    return 0;
}
