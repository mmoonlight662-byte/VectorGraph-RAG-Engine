package vectorgraph.app;

import vectorgraph.model.Document;
import javax.swing.*;
import java.awt.*;

public class VectorGraph {
    public static void main(String[] args) {
        Document[] docs = new Document[3];
        docs[0] = new Document(1, "Ali works at Google", new double[]{0.1, 0.9, 0.2});
        docs[1] = new Document(2, "Google is located in California", new double[]{0.2, 0.8, 0.3});
        docs[2] = new Document(3, "Sara is Ali's manager", new double[]{0.9, 0.1, 0.4});

        JFrame frame = new JFrame("VectorGraph RAG Engine");
        frame.setSize(500, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JButton button = new JButton("Show Documents");
        JTextArea area = new JTextArea();
        area.setEditable(false);

        button.addActionListener(e -> {
            area.setText("");
            for (int i = 0; i < docs.length; i++) {
                area.append(docs[i] + "\n");
            }
        });

        frame.add(button, BorderLayout.NORTH);
        frame.add(new JScrollPane(area), BorderLayout.CENTER);
        frame.setVisible(true);
    }
}