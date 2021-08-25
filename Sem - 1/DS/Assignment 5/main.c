#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
struct node{
    int data;
    struct node *left;
    struct node *right;
};
struct node *root= NULL;

struct node* createNode(int data){
    struct node *newNode = (struct node*)malloc(sizeof(struct node));
    newNode->data= data;
    newNode->left = NULL;
    newNode->right = NULL;
    return newNode;
}

void insert(int data) {
    struct node *newNode = createNode(data);
    if(root == NULL){
        root = newNode;
        return;
    }
    else {
        struct node *current = root, *parent = NULL;
        while(true) {
            parent = current;
            if(data < current->data) {
                current = current->left;
                if(current == NULL) {
                    parent->left = newNode;
                    return;
                }
            }
            else {
                current = current->right;
                if(current == NULL) {
                    parent->right = newNode;
                    return;
                }
            }
        }
    }
}

struct node* minNode(struct node *root) {
    if (root->left != NULL)
        return minNode(root->left);
    else
        return root;
}

struct node* deleteNode(struct node *node, int value) {
    if(node == NULL){
        printf("\nTree is Empty!");
        return NULL;
    }
    else {
        if(value < node->data)
            node->left = deleteNode(node->left, value);
        else if(value > node->data)
            node->right = deleteNode(node->right, value);
        else {
            if(node->left == NULL && node->right == NULL)
                node = NULL;
            else if(node->left == NULL) {
                node = node->right;
            }
            else if(node->right == NULL) {
                node = node->left;
            }
            else {
                struct node *temp = minNode(node->right);
                node->data = temp->data;
                node->right = deleteNode(node->right, temp->data);
            }
        }
        return node;
    }
}

void inorderTraversal(struct node *node) {
    if(root == NULL){
        printf("\nTree is empty\n");
        return;
    }
    else {
        if(node->left!= NULL)
            inorderTraversal(node->left);
        printf("%d ", node->data);
        if(node->right!= NULL)
            inorderTraversal(node->right);
    }
}

struct node* search(struct node *root, int value)
{
if (root==NULL){
    printf("\n Element not Found!");
}else
if(root->data==value){
    printf("\n Element Found!");
} else
if (root->data < value)
    return search(root->right, value);
else
    return search(root->left, value);
}

int main()
{
    while (1){
        int ch,n;
        printf("\n\n===== BST =====");
        printf("\n1.Insert");
        printf("\n2.Delete");
        printf("\n3.Transversal");
        printf("\n4.Search");
        printf("\nEnter the Choice:");
        scanf("%d",&ch);
        switch (ch) {
            case 1:
                printf("Enter the Element :");
                scanf("%d",&n);
                insert(n);
                break;
            case 2:
                printf("Enter the Element to delete :");
                scanf("%d",&n);
                deleteNode(root,n);
                printf("\nElement Deleted!");
                break;
            case 3:
                inorderTraversal(root);
                break;
            case 4:
                printf("Enter the Element to Search :");
                scanf("%d",&n);
                search(root,n);
                break;
            default:
                printf("\n Invalid Choice");
        }
    }
    return 0;
}