// C Program to Calculate Square of a Number using Function 
#include<stdio.h>
int Calculte(int Number);
int main()
{
  int n, Square;
  printf(" \n enter the number : ");
  scanf("%d", &n);
  Square = Calculte(n);
  printf("\n Square of a given number %d  =  %d", n, Square); 
  return 0;
}
int Calculte(int Number)
{
	return Number * Number;
}
