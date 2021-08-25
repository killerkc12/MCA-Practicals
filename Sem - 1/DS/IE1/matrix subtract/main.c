#include <stdio.h>
#include <stdlib.h>

int main()
{
    int row,col,i,j;
    printf("\n Matrix Substraction \n");
    printf("\n Enter number of row for matrix : ");
    scanf("%d",&row);
    printf("\n Enter number of columns for matrix : ");
    scanf("%d",&col);
    int mat1[row][col],mat2[row][col],mat3[row][col];
    printf("\n Enter the %d elements for matrix 1 : \n",row*col);

    for(i=0;i<row;i++){
        for(j=0;j<col;j++){
            scanf("%d",&mat1[i][j]);
        }
    }
    printf("\n Enter the %d elements for matrix 2 : \n",row*col);
    for(i=0;i<row;i++){
        for(j=0;j<col;j++){
            scanf("%d",&mat2[i][j]);
        }
    }
    for(i=0;i<row;i++){
        for(j=0;j<col;j++){
            mat3[i][j] = mat1[i][j] - mat2[i][j];
        }
    }
    printf("\n Subtraction of Matrix is : \n");
    for(i=0;i<row;i++){
        for(j=0;j<col;j++){
            printf("%d ",mat3[i][j]);
        }
        printf("\n");
    }
    return 0;
}
