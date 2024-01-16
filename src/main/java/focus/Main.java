package focus;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(Main::buildGUI);
    }

    private static void buildGUI() {
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException |
                 UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        JFrame f = new JFrame("Test");
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JTree tree = new JTree();
        JScrollPane sp = new JScrollPane(tree);
        f.add(sp);

        f.pack();
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
}