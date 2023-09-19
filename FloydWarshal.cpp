#include <iostream>
using namespace std;

#define V 4

#define INF 99999

void showShortestPath(int graph[V][V]) {
    for (int i = 0; i < V; i++)
    {
        cout << "[ ";
        for (int j = 0; j < V; j++)
        {
            if (graph[i][j] == INF)
            {
                cout << "INF ";
                continue;
            }
            
            cout << " " << graph[i][j] << "  ";
        }
        cout << "] " << endl;
    }
    
}

void shortestPath(int graph[V][V]) {
    for (int k = 0; k < V; k++)
    {
        for (int i = 0; i < V; i++)
        {
            for (int j = 0; j < V; j++)
            {  
                if(graph[i][j] > graph[i][k] + graph[k][j]) {
                    graph[i][j] = graph[i][k] + graph[k][j];
                }
                
            }
            
        }
        
    }

    showShortestPath(graph);
    
}




int main(int argc, char *argv[]) {


    int graph[V][V] = {
        {0,5,INF, 10},
        {INF,0,3,INF},
        {INF,INF,0,1},
        {INF,INF,INF,0}
    };

    shortestPath(graph);

    return 0;
}