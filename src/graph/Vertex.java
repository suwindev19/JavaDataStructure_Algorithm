package graph;

class Vertex {
    char label;
    boolean wasVisited;

    public Vertex(char label){
        this.label = label;
        this.wasVisited = false;
    }
}
