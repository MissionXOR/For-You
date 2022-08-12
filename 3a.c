//check gender using switch case
#include <stdio.h>
int main()
{
    char gender; 
    printf("Enter gender (M/m or F/f): ");
    scanf("%c",&gender);  
    switch(gender)
    {
        case 'M':
        case 'm':
            printf("This gender is Male");
            break;
        case 'F':
        case 'f':
            printf("This gender is Female");
            break;
        default:
            printf("Unspecified Gender.");
    }
    printf("\n");
    return 0;
}
