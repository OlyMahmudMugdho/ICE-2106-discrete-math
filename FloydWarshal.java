public class FloydWarshal {

    final static int INF = 99999;
    public static void shortestPath(int[][] graph, int vertices) {
        for (int k=0; k < vertices; k++) {
            for (int i=0; i < vertices; i++) {
                for (int j=0; j < vertices; j++) {
                    if((graph[i][j]) > (graph[i][k] + graph[k][j])){
                        graph[i][j] = graph[i][k] + graph[k][j];
                    }
                }
            }
        }
    }

    public static void showShortestPath(int[][] graph,int vertices){
        for (int i = 0; i < vertices; i++) {
            System.out.print("[ ");
            for (int j=0; j < vertices; j++){
                if(graph[i][j] == INF) {
                    System.out.print("INF ");
                    continue;
                }
                System.out.print(" " + graph[i][j] + "  ");
            }
            System.out.println("]");
        }
    }

    public static void main(String[] args) {
        int[][] graph = {
                {0,5,INF,10},
                {INF,0,3,INF},
                {INF, INF, 0,1},
                {INF,INF,INF,0}
        };

        shortestPath(graph,4);
        showShortestPath(graph,4);
    }
}
