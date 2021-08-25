#include<stdio.h>
#include<stdlib.h>

#define MAX 100

#define initial 1
#define visited 2

void graph_traversal();
void DFS(int vertex);
void make_graph();
void push(int vertex);
int pop();
int isEmpty();

int stack[MAX];
int top = -1;
int vertices;
int adjacent_matrix[MAX][MAX];
int vertex_status[MAX];

int main()
{
    make_graph();
    graph_traversal();
    return 0;
}

void make_graph()
{
    int i,j;
    printf("Enter total number of vertices:\t");
    scanf("%d", &vertices);

    printf("\n Enter graph data in matrix form:\n");
    for(i=1; i<=vertices; i++)
    {
        vertex_status[i] = initial;
        for(j=1;j<=vertices;j++)
        {
            scanf("%d", &adjacent_matrix[i][j]);
        }
    }
}

void graph_traversal()
{
    int vertex;

    printf("Enter Starting Vertex for DFS:\t");
    scanf("%d", &vertex);
    DFS(vertex);
    printf("\n");
}

void DFS(int vertex)
{
    int count;
    push(vertex);
    while(!isEmpty())
    {
        vertex = pop();
        if(vertex_status[vertex] == initial)
        {
            printf("%3d", vertex);
            vertex_status[vertex] = visited;
        }
        for(count = vertices - 1; count >= 0; count--)
        {
            if(adjacent_matrix[vertex][count] == 1 && vertex_status[count] == initial)
            {
                push(count);
            }
        }
    }
}

void push(int vertex)
{
    if(top == (MAX - 1))
    {
        printf("Stack Overflow\n");
        return;
    }
    top = top + 1;
    stack[top] = vertex;
}

int pop()
{
    int vertex;
    if(top == -1)
    {
        printf("Stack Underflow\n");
        exit(1);
    }
    else
    {
        vertex = stack[top];
        top = top - 1;
        return vertex;
    }
}

int isEmpty()
{
    if(top == -1)
    {
        return 1;
    }
    else
    {
        return 0;
    }
}

