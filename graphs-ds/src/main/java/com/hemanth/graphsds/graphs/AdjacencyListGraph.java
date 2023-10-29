package com.hemanth.graphsds.graphs;

import java.util.LinkedList;
import java.util.Queue;

public class AdjacencyListGraph {

    /*
     * Graph representation using array and linked-list
     * */


    private LinkedList<Integer>[] adj;
    private int V;
    private int E;

    public AdjacencyListGraph(int nodes) {
        this.V = nodes;
        this.E = 0;
        this.adj = new LinkedList[nodes];
        for (int v = 0; v < V; v++) {
            this.adj[v] = new LinkedList<>();
        }
    }

    public void addEdge(int u, int v) {
        adj[u].add(v);
        adj[v].add(u);
        E++;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(V + " vertices " + E + " edges " + " \n");
        for (int v = 0; v < V; v++) {
            sb.append(v + " : ");
            for (int w : adj[v]) {
                sb.append(w + " ");
            }
            sb.append("\n");
        }

        return sb.toString();
    }


    public void bfs(int s){
        boolean[] isVisited = new boolean[V];
        Queue<Integer> q = new LinkedList<>();
        q.offer(s);
        isVisited[s] = true;
        while (!q.isEmpty()){
            int u = q.poll();
            System.out.print(u+" -> ");
            for (int v: adj[u]){
                if (!isVisited[v]){
                    isVisited[v] = true;
                    q.offer(v);
                }
            }
        }
    }


    public static void main(String[] args) {
        AdjacencyListGraph graph = new AdjacencyListGraph(5);
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 0);
        graph.addEdge(2,4);

        System.out.println(graph);

        graph.bfs(0);
    }


}
