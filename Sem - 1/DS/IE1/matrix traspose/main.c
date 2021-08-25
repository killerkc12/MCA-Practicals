#include <stdio.h>
#include <stdlib.h>

int main()
{
    int row,col,i,j;
    printf("\n Matrix Traspose \n");
    printf("\n Enter number of row for matrix : ");
    scanf("%d",&row);
    printf("\n Enter number of columns for matrix : ");
    scanf("%d",&col);
    int mat1[row][col],mat2[row][col];
    printf("\n Enter the %d elements for matrix : \n",row*col);

    for(i=0;i<row;i++){
        for(j=0;j<col;j++){
            scanf("%d",&mat1[i][j]);
        }
    }

    printf("\n\n Matrix is : \n");
    for(i=0;i<row;i++){
        for(j=0;j<col;j++){
            printf("%d ",mat1[i][j]);
        }
        printf("\n");
    }
    //traspose
    for(i=0;i<row;i++){
        for(j=0;j<col;j++){
            mat2[i][j] = mat1[j][i];
        }
    }

    printf("\n\n Traspose of Matrix is : \n");
    for(i=0;i<row;i++){
        for(j=0;j<col;j++){
            printf("%d ",mat2[i][j]);
        }
        printf("\n");
    }
    return 0;
}
