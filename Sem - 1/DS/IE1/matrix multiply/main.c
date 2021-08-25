#include <stdio.h>
#include <stdlib.h>

int main()
{
    int row1,col1,row2,col2,i,j,k;
    printf("\n ==== Matrix Multiplication ==== \n");
    printf("\n Enter number of row for matrix 1 : ");
    scanf("%d",&row1);
    printf("\n Enter number of columns for matrix 1 : ");
    scanf("%d",&col1);
    int mat1[row1][col1];
    printf("\n Enter the %d elements for matrix 1 : \n",row1*col1);

    for(i=0;i<row1;i++){
        for(j=0;j<col1;j++){
            scanf("%d",&mat1[i][j]);
        }
    }
    //matrix 1
    printf("\n\n Matrix  1 is : \n");
    for(i=0;i<row1;i++){
        for(j=0;j<col1;j++){
            printf("%d ",mat1[i][j]);
        }
        printf("\n");
    }

    printf("\n Enter number of row for matrix 2 : ");
    scanf("%d",&row2);
    printf("\n Enter number of columns for matrix 2 : ");
    scanf("%d",&col2);
    int mat2[row2][col2],mat3[row1][col2];
    printf("\n Enter the %d elements for matrix 2 : \n",row2*col2);
    for(i=0;i<row2;i++){
        for(j=0;j<col2;j++){
            scanf("%d",&mat2[i][j]);
        }
    }

    //matrix 2
    printf("\n\n Matrix 2  is : \n");
    for(i=0;i<row2;i++){
        for(j=0;j<col2;j++){
            printf("%d ",mat2[i][j]);
        }
        printf("\n");
    }

    // multiply matrix
    for(i=0;i<row1;i++){
        for(j=0;j<col2;j++){
            mat3[i][j]=0;
            for(k=0;k<col1;k++){
                mat3[i][j] += mat1[i][k] * mat2[k][j];
            }

        }
    }


    printf("\n\n Multiplication of Matrix is : \n");
    for(i=0;i<row1;i++){
        for(j=0;j<col2;j++){
            printf("%d ",mat3[i][j]);
        }
        printf("\n");
    }
    return 0;
}
