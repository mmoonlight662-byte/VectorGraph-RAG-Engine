package vectorgraph.model;

public class Document {
    public int id;
    public String text;
    public double[] vec;

    public Document(int id, String text, double[] vec) {
        this.id = id;
        this.text = text;
        this.vec = vec;
    }

    public String toString() {
        return id + ": " + text;
    }
}
