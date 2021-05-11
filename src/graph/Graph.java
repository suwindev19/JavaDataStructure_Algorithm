package graph;

import LinkedListProblems.LinkedList;

import java.util.ArrayList;

public class Graph {
    int[][] adjMatrix; // 2D matrix
    Vertex[] vertexArr; // this is for vertex
    ArrayList[] adjList;
    int maxNumVertex;
    int i;

    public Graph(int maxNumVertex) {
        this.adjMatrix = new int[maxNumVertex][maxNumVertex];
        this.maxNumVertex = maxNumVertex;
        this.vertexArr = new Vertex[maxNumVertex];
        this.i = 0;
        this.adjList = new ArrayList[maxNumVertex];

        for (int i =0; i < maxNumVertex; i++){
            for(int j =0; j < maxNumVertex; j++){
                adjMatrix[i][j] = 0;
            }
        }

        for(int i =0; i < maxNumVertex; i++){
            adjList[i] = new ArrayList<>();
        }
    }

    public void addVertex(char label){
        Vertex vertex = new Vertex(label);
        vertexArr[i++] = vertex;
    }

    public void addEdge(int i , int j){
        adjMatrix[i][j] = 1; // uni-directional , only one direction
        //adjMatrix[j][i] = 1; // if I add this, it will be bidirectional
        adjList[i].add(j);

    }

    // For directional graph
    public void addEdge(int i , int j, int weight){
        adjMatrix[i][j] = weight;
        //adjMatrix[j][i] = 1; // if I add this, it will be bidirectional

    }

    public static void main(String[] args) {
        Graph gp = new Graph(4);
        gp.addVertex('A');
        gp.addVertex('B');
        gp.addVertex('C');
        gp.addVertex('D');
        gp.addEdge(0,1); // ab
        gp.addEdge(0,2); // ac

        gp.addEdge(1,2); // bc
        gp.addEdge(1,3); // bd

        gp.addEdge(2,0); // ca
        gp.addEdge(2,3); // cd

        gp.addEdge(3,2); // dc

        System.out.println(gp);
    }
}
