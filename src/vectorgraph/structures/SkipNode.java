package vectorgraph.structures;

public class SkipNode {
    public int data;
    public SkipNode[] next;

    public SkipNode(int data, int levels) {
        this.data = data;
        this.next = new SkipNode[levels];
    }
}
