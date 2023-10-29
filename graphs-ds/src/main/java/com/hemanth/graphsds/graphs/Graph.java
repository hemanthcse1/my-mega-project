package com.hemanth.graphsds.graphs;

public class Graph {

    private int V;
    private int E;
    private int[][] adjMatrix;


    public Graph(int nodes) {
        this.V = nodes;
        this.E = 0;
        this.adjMatrix = new int[nodes][nodes];
    }

    public void addNodes(int u, int v) {
        this.adjMatrix[u][v] = 1;
        this.adjMatrix[v][u] = 1;
        this.E++;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(V + " vertices " + E + " edges " + "\n");
        for (int v = 0; v < V; v++) {
            sb.append(v + " : ");
            for (int w : adjMatrix[v]) {
                sb.append(w + " ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }


    public static void main(String[] args) {


        Graph graph = new Graph(4);
        graph.addNodes(0, 1);
        graph.addNodes(1, 2);
        graph.addNodes(2, 3);
        graph.addNodes(3, 0);

        System.out.println(graph);


    }
}
