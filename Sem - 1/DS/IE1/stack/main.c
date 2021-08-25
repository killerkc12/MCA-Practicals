#include <stdio.h>
#include <stdlib.h>
#define SIZE 10

int arr[SIZE];
int c,i,n,top=-1;

int main()
{

    while(1){
        printf("\n\n ===== MENU =====");
        printf("\n 1.Push");
        printf("\n 2.Pop");
        printf("\n 3.Exit");
        printf("\n Enter your choice : ");
        scanf("%d",&c);

        switch(c){
            case 1 : Push();
            break;
            case 2 : Pop();
            break;
            case 3 : exit(0);
            break;
            default : printf("\n Invalid Choice");
            break;
        }
    }
    return 0;
}

void Push(){
    printf("\n Enter the Element : ");
    scanf("%d",&n);
    arr[++top] = n;
    printf("\n Element Pushed!");
    display();
}

void Pop(){
    if(top==-1)
        printf("\n Stack is Empty!");
    else{
        --top;
        printf("\n Element Pop!");
        display();
    }

}

void display(){
    printf("\n\n Stack Elements are : ");
    for(i=0;i<=top;i++){
        printf("%d ",arr[i]);
    }
}
