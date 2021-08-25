#include <stdio.h>
#include <stdlib.h>

struct node{
    int data;
    struct node *next;
};
struct node *head;

int e,p,i;

int main()
{
    int ch;
    while(1){
        printf("\n\n =====Menu - Linked List=====");
        printf("\n 1.Create");
        printf("\n 2.Insert at Beginning");
        printf("\n 3.Insert at Specific Position");
        printf("\n 4.Insert at End");
        printf("\n 5.Delete from Beginning");
        printf("\n 6.Delete from Specific Position");
        printf("\n 7.Delete from End");
        printf("\n 8.Search Element");
        printf("\n 9.Display List");
        printf("\n 10.Exit");
        printf("\n Enter the choice : ");
        scanf("%d",&ch);
        switch(ch){
            case 1 : Create();
            break;
            case 2 : InsertAtBeginning();
            break;
            case 3 : InsertAtSpecificPosition();
            break;
            case 4 : InsetAtEnd();
            break;
            case 5 : DeleteFromBeginning();
            break;
            case 6 : DeleteFromSpecificPostiton();
            break;
            case 7 : DeleteFromEnd();
            break;
            case 8 : Search();
            break;
            case 9 : DisplayList();
            break;
            case 10 : exit(0);
            break;
            default: printf("\n Invalid Choice!");
            break;
        }
    }
    return 0;
}

int Create(){
    if(head != NULL)
        printf("\n List is Already Created!");
    else{
        printf("\n Enter the Element : ");
        scanf("%d",&e);
        head = (struct node*)malloc(sizeof(struct node));
        head->data = e;
        head->next = NULL;
        printf("\n List Created!");
    }
}

int InsertAtBeginning(){
    struct node *newNode;
    if(head==NULL){
        printf("\n List is not Created!");
    }else{
        printf("\n Enter the Element : ");
        scanf("%d",&e);
        newNode = (struct node*)malloc(sizeof(struct node));
        newNode->data = e;
        newNode->next = head;
        head = newNode;
        printf("\n Element Inserted at the Beginning!");
    }
}

int InsertAtSpecificPosition(){
    struct node *newNode,*currentNode;
    int i=1;
    if(head == NULL)
        printf("List is not Created!");
    else{
        printf("\n Enter the Element : ");
        scanf("%d",&e);
        printf("\n Enter the Position : ");
        scanf("%d",&p);
        newNode = (struct node*)malloc(sizeof(struct node));
        newNode->data = e;
        currentNode = head;
        if(p == 1 ){
            newNode->next = head;
            head = newNode;
        }else{
            while(i<p-1){
                currentNode = currentNode->next;
                if(currentNode==NULL){
                    printf("\n Invalid Position!");
                    return;
                }
                i++;
            }
            newNode->next = currentNode->next;
            currentNode->next = newNode;
        }
        printf("\n Element Inserted Successfully!");

    }
}

int InsetAtEnd(){
    struct node *newNode,*currentNode;
    if(head==NULL){
        printf("\n List is not Created!");
    }else{
        printf("\n Enter the Element : ");
        scanf("%d",&e);
        newNode = (struct node*)malloc(sizeof(struct node));
        newNode->data = e;
        currentNode = head;
        while(currentNode->next != NULL){
            currentNode = currentNode->next;
        }
        currentNode->next = newNode;
        printf("\n Element Inserted at the End!");
    }
}

int DeleteFromBeginning(){
    struct node *currentNode;
    if(head==NULL){
        printf("\n List is not Created!");
    }else{
        currentNode = head->next;
        head = currentNode;
        printf("\n Element Deleted from biginning!");
    }
}

int DeleteFromSpecificPostiton(){
    int i=1;
    struct node *currentNode,*temp;
    if(head==NULL){
        printf("\n List is not Created!");
    }else{
        printf("\n Enter the Postion : ");
        scanf("%d",&p);
        currentNode = head;
        if(p == 1){
            currentNode = head->next;
            head = currentNode;
            currentNode = NULL;
            free(currentNode);
        }else{
            while(i<p-1){
                currentNode = currentNode->next;
                if(currentNode == NULL){
                    printf("\n Invalid Postion!");
                    return;
                }
                i++;
            }
            if(currentNode->next->next == NULL){
                currentNode->next = NULL;
                free(currentNode->next);
            }else{
                temp = currentNode->next;
                currentNode->next = temp->next;
                free(temp);
            }

        }

        printf("\n Element Deleted from Specific Postion!");
    }
}

int DeleteFromEnd(){
        struct node *currentNode,*tempNode;
    if(head==NULL){
        printf("\n List is not Created!");
    }else{
        currentNode = head;
        if(currentNode->next == NULL){
            currentNode = NULL;
            free(currentNode);
        }else{
            while(currentNode->next != NULL){
                tempNode = currentNode;
                currentNode = currentNode->next;
            }
            tempNode->next = NULL;
            free(currentNode);
        }

        printf("\n Element Deleted from End!");
    }
}

int Search(){
    int i=1,flag=0;
    struct node *currentNode;
    if(head == NULL)
        printf("\n List is not Created");
    else{
        printf("\n Enter Element to Search : ");
        scanf("%d",&e);
        currentNode = head;
        while(currentNode != NULL){
            if(currentNode->data == e){
                printf("\n %d is found at %d",e,i);
                return;
            }
            else{
                currentNode = currentNode->next;
                i++;
            }
        }
        printf("\n %d is not found ",e);
    }
}

int DisplayList(){
    struct node *currentNode;
    if(head == NULL)
        printf("\n List is not Created!");
    else{
        printf("\n Linked List : ");
        for(currentNode = head;currentNode->next != NULL;currentNode = currentNode->next){
            printf("%d ",currentNode->data);
        }
        printf("%d",currentNode->data);
    }
}
