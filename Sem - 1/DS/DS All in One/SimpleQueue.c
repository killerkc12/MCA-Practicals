#include <stdio.h>
#include <stdlib.h>
#define SIZE 10

//variable declaration
int front =-1,rear =-1,arr[SIZE],element;

void insert();

void delete();

void view();

// main function where execution start
int main() {
    //while loop for diplay menu until exit by user
    while (1){
        printf("\n\n==== Simple Queue =====");
        printf("\n1.insert");
        printf("\n2.delete");
        printf("\n3.view");
        printf("\n4.exit");
        printf("\nEnter the Choice :");
        int ch ;
        scanf("%d",&ch);
        //switch case for user will choose the operation from menu
        switch (ch) {
            case 1: insert();
                break;
            case 2: delete();
                break;
            case 3: view();
                break;
            case 4: exit(0);
                break;
            default:
                printf("\nInvalid Choice");
                break;
        }
    }
    return 0;
}
// function to display the queue element
void view() {
    //checking queue is empty or not
    if(front == -1)
        printf("\nQueue is UnderFlow!");
    // if queue is not empty else condition will execute
    else{
        // this line will the statement
        printf("\nQueue is : ");
        // for loop is used for travel the queue from front to rear
        for (int i = front; i <= rear; ++i)
            //this line will display the each element from the queue
            printf("%d ",arr[i]);
    }
}

// this function is for delete element from front end
void delete() {
    //checking queue is empty or not
    if(front == -1 || front>rear)
        printf("\nQueue Underflow");
    //if queue is not empty else conditon will execute
    else
        printf("\nElement delete from queue is : %d ",arr[front++]);
}

//insert function for inserting element at rear end
void insert() {
    //checking condintion for queue is full or not
    if(rear == SIZE-1){
        printf("Queue Overflow!");
    }else{
        //if there is not not any element in the array this will execute for 1 time only
        if(front == -1)
            front = 0;
        //Asking for user to enter the element
        printf("Enter the Element : ");
        //this line take a input from user
        scanf("%d",&element);
        // element will insert in the queue at rear end
        arr[++rear] = element;
    }
}
