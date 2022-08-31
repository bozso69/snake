package ai.Sajat;
import interfaces.Ai;
import kukac.Board;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class snakeSajat extends JFrame {
    Board board;
    private JMenu jMenu1;
    private JMenuBar jMenuBar1;
    private JMenuItem jMenuItem1;

    public snakeSajat() {
        this.initComponents();
        this.board = new Board();
        this.add(this.board, "Center");
        this.pack();
        this.repaint();
        this.setSize(520, 580);
    }

    public void paint(Graphics g) {
        super.paint(g);
    }

    public void addAI(Ai ai, Color color) {
        this.board.addAI(ai, color);
    }

    public void start() {
        this.setVisible(true);
    }

    private void initComponents() {
        this.jMenuBar1 = new JMenuBar();
        this.jMenu1 = new JMenu();
        this.jMenuItem1 = new JMenuItem();
        this.setDefaultCloseOperation(3);
        this.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent evt) {
                snakeSajat.this.formKeyPressed(evt);
            }
        });
        this.jMenu1.setText("File");
        this.jMenuItem1.setText("New");
        this.jMenuItem1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                snakeSajat.this.jMenuItem1ActionPerformed(evt);
            }
        });
        this.jMenu1.add(this.jMenuItem1);
        this.jMenuBar1.add(this.jMenu1);
        this.setJMenuBar(this.jMenuBar1);
        this.pack();
    }

    private void formKeyPressed(KeyEvent evt) {
        this.board.formKeyPressed(evt);
    }

    private void jMenuItem1ActionPerformed(ActionEvent evt) {
        this.board.indit();
    }

}
