#include<stdio.h>
#include<stdlib.h>

struct BSTNode
{
    int data;
    struct BSTNode *leftChild;
    struct BSTNode *rightChild;
};

struct BSTNode *root = NULL;

void insert();

void delete();

void search();

void inorder(struct BSTNode *pNode);

void sort();

int main()
{
    int choice, element;
    while(1)
    {
        printf("\n 1. Insert");
        printf("\n 2. Delete");
        printf("\n 3. Search");
        printf("\n 4. Display");
        printf("\n 5. Sort");
        printf("\n 6. Exit");
        printf("\n ----------------");
        printf("\n Enter your choice : ");
        scanf("%d", &choice);
        switch(choice)
        {
            case 1: insert(); break;
            case 2: delete(); break;
            case 3: search(); break;
            case 4: inorder(root); break;
            case 5: sort(); break;
            case 6:
                printf("\n Press any key to exit.");
                exit(0);
            default: printf("\n Invalid Choice.");
        }
    }
    return 0;
}


void insert()
{
    struct BSTNode *newNode, *parentNode, *currentNode;
    int ele;

    printf("\n Enter a Value : ");
    scanf("%d",&ele);

    newNode = (struct BSTNode *)malloc(sizeof(struct BSTNode));
    newNode->data = ele;
    newNode->leftChild = NULL;
    newNode->rightChild = NULL;

    if(root == NULL)
    {
        root = newNode;
        root->leftChild = NULL;
        root->rightChild = NULL;
    }
    else
    {
        parentNode = NULL;
        currentNode = root;
        while(currentNode != NULL)
        {
            parentNode = currentNode;
            if(ele <= currentNode->data)
            {
                currentNode = currentNode->leftChild;
            }
            else
            {
                currentNode = currentNode->rightChild;
            }
        }
        if(ele <= parentNode->data)
        {
            parentNode->leftChild = newNode;
        }
        else
        {
            parentNode->rightChild = newNode;
        }
    }
    printf("\n Value inserted successfully.");
}
void delete()
{
    struct BSTNode *currentNode, *parentNode, *tempRight, *tempParent;
    int key;
    currentNode = root;
    parentNode = NULL;

    printf("\n Enter key : ");
    scanf("%d",&key);

    while(currentNode->data != key && currentNode != NULL)
    {
        parentNode = currentNode;
        if(key < currentNode->data)
        {
            currentNode = currentNode->leftChild;
        }
        else if(key > currentNode->data)
        {
            currentNode = currentNode->rightChild;
        }
    }

    if(currentNode == NULL)
    {
        printf("\n Key not found.");
    }
    else
    {
        if(currentNode->leftChild == NULL && currentNode->rightChild == NULL)
        {
            if(parentNode == NULL)
            {
                free(root);
                root = NULL;
            }
            else
            {
                if(parentNode->leftChild == currentNode)
                {
                    parentNode->leftChild = NULL;
                }
                else
                {
                    parentNode->rightChild = NULL;
                }
                free(currentNode);
            }
        }
        else if(currentNode->leftChild != NULL && currentNode->rightChild == NULL)
        {
            if(parentNode == NULL)
            {
                parentNode = root;
                currentNode = parentNode->leftChild;
                parentNode->data = currentNode->data;
                free(currentNode);
            }
            else
            {
                if(parentNode->leftChild == currentNode)
                {
                    parentNode->leftChild = currentNode->leftChild;
                }
                else
                {
                    parentNode->rightChild = currentNode->leftChild;
                }
                free(currentNode);
            }
        }
        else if(currentNode->leftChild == NULL && currentNode->rightChild != NULL)
        {
            if(parentNode == NULL)
            {
                parentNode = root;
                currentNode = parentNode->rightChild;
                parentNode->data = currentNode->data;
                free(currentNode);
            }
            else
            {
                if(parentNode->leftChild == currentNode)
                {
                    parentNode->leftChild = currentNode->rightChild;
                }
                else
                {
                    parentNode->rightChild = currentNode->rightChild;
                }
                free(currentNode);
            }
        }
        else
        {
            tempRight = currentNode->rightChild;
            tempParent = tempRight;
            while(tempRight->leftChild!=NULL)
            {
                tempParent = tempRight;
                tempRight = tempRight->leftChild;
            }
            currentNode->data = tempRight->data;
            tempParent->leftChild=NULL;
            free(tempRight);
        }
    }//
// Created by kiran on 18/04/21.
//


}



void search()
{
}
void inorder(struct BSTNode *tempRoot) //inorder traversing
{
    if(root == NULL)
    {
        printf("\n Tree is empty.");
    }
    else
    {
        if(tempRoot == NULL)
        {
            return;
        }
        inorder(tempRoot->leftChild);
        printf("\t%d",tempRoot->data);
        inorder(tempRoot->rightChild);
    }
}
void sort()
{
}