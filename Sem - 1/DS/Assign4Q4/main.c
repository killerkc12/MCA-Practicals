#include <stdio.h>
#include <stdlib.h>

struct node{
    int data;
    struct node *next;
};
struct node *front,*rear;

int e;

int main()
{
    int ch;
    while(1){
        printf("\n\n =====Menu Queue Implementation Using Linked List=====");
        printf("\n 1.Enqueue");
        printf("\n 2.Dequeue");
        printf("\n 3.Display");
        printf("\n 4.Exit");
        printf("\n Enter the choice : ");
        scanf("%d",&ch);
        switch(ch){
            case 1 : Enqueue();
            break;
            case 2 : Dequeue();
            break;
            case 3 : Display();
            break;
            case 4 : exit(0);
            break;
            default: printf("\n Invalid Choice!");
            break;
        }
    }
    return 0;
}


int Enqueue(){
    struct node *newNode;
    printf("\n Enter the Element : ");
    scanf("%d",&e);
    newNode = (struct node*)malloc(sizeof(struct node));
    newNode->data = e;
    if(front==NULL){
        front = newNode;
        rear = newNode;
    }else{
        rear->next = newNode;
        rear = newNode;
        printf("\n Element Inserted!");
    }
}

int Dequeue(){
    struct node *currentNode;
    if(front==NULL){
        printf("\n Queue is Empty!");
    }else{
        if(front == rear){
            front = rear = NULL;
            free(front);
        }else{
            currentNode = front->next;
            front = currentNode;
            currentNode = NULL;
            free(currentNode);
        }

        printf("\n Element Deleted!");
    }
}

int Display(){
    struct node *currentNode;
    if(front == NULL)
        printf("\n Queue is Empty!");
    else{
        printf("\n Queue using Linked List : ");
        for(currentNode = front;currentNode != rear;currentNode = currentNode->next){
            printf("%d ",currentNode->data);
        }
        printf("%d",currentNode->data);
    }
}
