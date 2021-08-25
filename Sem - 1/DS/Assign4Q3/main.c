#include <stdio.h>
#include <stdlib.h>

struct node{
    int data;
    struct node *next;
};
struct node *top;

int e;

int main()
{
    int ch;
    while(1){
        printf("\n\n =====Menu Stack Implementation Using Linked List=====");
        printf("\n 1.Push");
        printf("\n 2.Pop");
        printf("\n 3.Display");
        printf("\n 4.Exit");
        printf("\n Enter the choice : ");
        scanf("%d",&ch);
        switch(ch){
            case 1 : Push();
            break;
            case 2 : Pop();
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


int Push(){
    struct node *newNode;
    printf("\n Enter the Element : ");
    scanf("%d",&e);
    newNode = (struct node*)malloc(sizeof(struct node));
    newNode->data = e;
    if(top==NULL){
        top = newNode;
    }else{
        newNode->next = top;
        top = newNode;
        printf("\n Element Inserted!");
    }
}

int Pop(){
    struct node *currentNode;
    if(top==NULL){
        printf("\n Stack is Empty!");
    }else{
        if(top->next == NULL){
            top = NULL;
            free(top);
        }else{
            currentNode = top->next;
            top = currentNode;
            currentNode = NULL;
            free(currentNode);
        }

        printf("\n Element Deleted!");
    }
}

int Display(){
    struct node *currentNode;
    if(top == NULL)
        printf("\n Stack is Empty!");
    else{
        printf("\n Stack using Linked List : ");
        for(currentNode = top;currentNode->next != NULL;currentNode = currentNode->next){
            printf("%d ",currentNode->data);
        }
        printf("%d",currentNode->data);
    }
}
