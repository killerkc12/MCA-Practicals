#include <stdio.h>
#include <stdlib.h>
#define SIZE 5

int enqueue();
int dequeue();
int display();

int front = -1,rear = -1,n,i,queue[SIZE],ch;

int main()
{
    while(1){
        printf("\n\n =====Menu=====");
        printf("\n 1.Insert");
        printf("\n 2.Delete");
        printf("\n 3.View");
        printf("\n 0.Exit");
        printf("\n Enter the Choice : ");
        scanf("%d",&ch);
        switch(ch){
            case 1 : enqueue();
            break;
            case 2 : dequeue();
            break;
            case 3 : display();
            break;
            case 0 : exit(0);
            break;
            default : printf("\n Invalid Choice");
            break;
        }
    }

    return 0;
}

int enqueue(){
    if(rear == SIZE)
        printf("\n Queue is Full");
    else{
        printf("\n Enter the Element : ");
        scanf("%d",&n);
        if(front == -1 && rear == -1)
            front = rear = 0;
        queue[rear++] = n;
    }
    return 0;
}

int display(){
    if(front == -1)
        printf("\n Queue is Empty");
    else{
        printf("\n Queue is : ");
        for(i=front;i<rear;i++)
            printf("%d ",queue[i]);
    }
    return 0;
}

int dequeue(){
    if(front == -1 || front >= rear)
        printf("\n Queue is Empty");
    else{
        printf("\n %d Element is delete from Queue",queue[front++]);
    }
    return 0;
}