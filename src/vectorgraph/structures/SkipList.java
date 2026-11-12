package vectorgraph.structures;

import java.util.Random;

public class SkipList {
    private static final int MAX_LEVEL = 4;
    private SkipNode head;
    private int level;
    private Random random = new Random();

    public SkipList() {
        head = new SkipNode(-1, MAX_LEVEL);
        level = 0;
    }

    private int randomLevel() {
        int lvl = 0;
        while (random.nextInt(2) == 1 && lvl < MAX_LEVEL - 1) {
            lvl++;
        }
        return lvl;
    }

    public void insert(int value) {
        SkipNode[] update = new SkipNode[MAX_LEVEL];
        SkipNode cur = head;

        for (int i = level; i >= 0; i--) {
            while (cur.next[i] != null && cur.next[i].data < value) {
                cur = cur.next[i];
            }
            update[i] = cur;
        }

        int newLevel = randomLevel();
        if (newLevel > level) {
            for (int i = level + 1; i <= newLevel; i++) {
                update[i] = head;
            }
            level = newLevel;
        }

        SkipNode node = new SkipNode(value, MAX_LEVEL);
        for (int i = 0; i <= newLevel; i++) {
            node.next[i] = update[i].next[i];
            update[i].next[i] = node;
        }
    }

    public String toString() {
        String result = "";
        for (int i = level; i >= 0; i--) {
            result = result + "Level " + i + ": ";
            SkipNode cur = head.next[i];
            while (cur != null) {
                result = result + cur.data + " ";
                cur = cur.next[i];
            }
            result = result + "\n";
        }
        return result;
    }
}
