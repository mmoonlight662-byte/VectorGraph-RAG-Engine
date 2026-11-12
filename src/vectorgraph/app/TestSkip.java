package vectorgraph.app;

import vectorgraph.structures.SkipList;

public class TestSkip {
    public static void main(String[] args) {
        SkipList sl = new SkipList();
        int[] values = {3, 6, 7, 9, 12, 19, 17, 26};
        for (int i = 0; i < values.length; i++) {
            sl.insert(values[i]);
        }
        System.out.println(sl);
    }
}
