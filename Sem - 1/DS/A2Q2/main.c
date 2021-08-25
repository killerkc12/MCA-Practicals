#include<stdio.h>
#define SIZE 100

int isOperand(char);
void push(char);
char pop();
int prec(char);

char stack[SIZE];
int top=-1;

int main(){
    char infix[SIZE];
    int i;

    printf("\n Enter an Arithmetic Experession : ");
    scanf("%s",infix);

    printf("\n Postfix Expression : ");
    for(i=0;infix[i]!='\0';i++){
        if(isOperand(infix[i])==1)
            printf("%c",infix[i]);
        else
        if(infix[i]=='(')
            push(infix[i]);
        else
        if(infix[i]==')'){
            while(stack[top]!='('){
                printf("%c",pop());
            }
            pop();
        }
        else{
            while(prec(infix[i])<=prec(stack[top]))
                printf("%c",pop());
            push(infix[i]);
        }
    }
    while(top!=-1)
        printf("%c",pop());

    return 0;
}

int isOperand(char ch){
    if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z') || (ch>='0' && ch<=9))
        return 1;
    else
        return 0;
}

void push(char ch){
    stack[++top]=ch;
}

char pop(){
    return stack[top--];
}

int prec(char ch){
    switch(ch){
        case '^' : return 3;
        case '*' :
        case '/' : return 2;
        case '+' :
        case '-' : return 1;
        default  : return 0;
    }
}
