/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akaripuzzle;

import static akaripuzzle.AkariPuzzle.blackCell;
import static akaripuzzle.AkariPuzzle.board;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author ALOLA
 */
public class Display extends javax.swing.JFrame {

    AkariPuzzle akari = new AkariPuzzle();
//    JLabel[] label = setLabel();

    /**
     * Creates new form Place
     */
    public Display() {
        initComponents();
        paintCell();
    }

    private void label() {
        File imgF = new File("src/akaripuzzle/blackcell.png");
        try {
            System.out.println(
                    "About to load " + imgF.getCanonicalPath()
                    + " exists=" + imgF.exists());
        } catch (IOException ioe) {
            ioe.printStackTrace();
            System.exit(0);
        }
        l1.setIcon(new ImageIcon("src/akaripuzzle/blackcell.png"));
    }

//    public JLabel[] setLabel() {
//        
//        return labels;
//    }
    public void paintCell() {
        cekCell(l1, new int[]{0, 0});
        cekCell(l2, new int[]{0, 1});
        cekCell(l3, new int[]{0, 2});
        cekCell(l4, new int[]{0, 3});
        cekCell(l5, new int[]{0, 4});
        cekCell(l6, new int[]{0, 5});
        cekCell(l7, new int[]{0, 6});

        cekCell(l8, new int[]{1, 0});
        cekCell(l9, new int[]{1, 1});
        cekCell(l10, new int[]{1, 2});
        cekCell(l11, new int[]{1, 3});
        cekCell(l12, new int[]{1, 4});
        cekCell(l13, new int[]{1, 5});
        cekCell(l14, new int[]{1, 6});

        cekCell(l15, new int[]{2, 0});
        cekCell(l16, new int[]{2, 1});
        cekCell(l17, new int[]{2, 2});
        cekCell(l18, new int[]{2, 3});
        cekCell(l19, new int[]{2, 4});
        cekCell(l20, new int[]{2, 5});
        cekCell(l21, new int[]{2, 6});

        cekCell(l22, new int[]{3, 0});
        cekCell(l23, new int[]{3, 1});
        cekCell(l24, new int[]{3, 2});
        cekCell(l25, new int[]{3, 3});
        cekCell(l26, new int[]{3, 4});
        cekCell(l27, new int[]{3, 5});
        cekCell(l28, new int[]{3, 6});

        cekCell(l29, new int[]{4, 0});
        cekCell(l30, new int[]{4, 1});
        cekCell(l31, new int[]{4, 2});
        cekCell(l32, new int[]{4, 3});
        cekCell(l33, new int[]{4, 4});
        cekCell(l34, new int[]{4, 5});
        cekCell(l35, new int[]{4, 6});

        cekCell(l36, new int[]{5, 0});
        cekCell(l37, new int[]{5, 1});
        cekCell(l38, new int[]{5, 2});
        cekCell(l39, new int[]{5, 3});
        cekCell(l40, new int[]{5, 4});
        cekCell(l41, new int[]{5, 5});
        cekCell(l42, new int[]{5, 6});

        cekCell(l43, new int[]{6, 0});
        cekCell(l44, new int[]{6, 1});
        cekCell(l45, new int[]{6, 2});
        cekCell(l46, new int[]{6, 3});
        cekCell(l47, new int[]{6, 4});
        cekCell(l48, new int[]{6, 5});
        cekCell(l49, new int[]{6, 6});
    }

    public void cekCell(javax.swing.JLabel lbl, int[] cell) {
        if (board[cell[0]][cell[1]] == 'B') {
            lbl.setIcon(new ImageIcon("src/icon/blackcell.png"));
        }
        if (board[cell[0]][cell[1]] == '1') {
            lbl.setIcon(new ImageIcon("src/icon/blackcell1.png"));
        }
        if (board[cell[0]][cell[1]] == '2') {
            lbl.setIcon(new ImageIcon("src/icon/blackcell2.png"));
        }
        if (board[cell[0]][cell[1]] == '3') {
            lbl.setIcon(new ImageIcon("src/icon/blackcell3.png"));
        }
        if (board[cell[0]][cell[1]] == '4') {
            lbl.setIcon(new ImageIcon("src/icon/blackcell4.png"));
        }
        if (board[cell[0]][cell[1]] == 'R'){
            lbl.setIcon(new ImageIcon("src/icon/yellowcell.png"));
        }
        if (board[cell[0]][cell[1]] == 'O'){
            lbl.setIcon(new ImageIcon("src/icon/lightbulb.png"));
        }
    }

 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        l1 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        l5 = new javax.swing.JLabel();
        l6 = new javax.swing.JLabel();
        l7 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        l14 = new javax.swing.JLabel();
        l13 = new javax.swing.JLabel();
        l12 = new javax.swing.JLabel();
        l11 = new javax.swing.JLabel();
        l10 = new javax.swing.JLabel();
        l9 = new javax.swing.JLabel();
        l8 = new javax.swing.JLabel();
        l20 = new javax.swing.JLabel();
        l18 = new javax.swing.JLabel();
        l17 = new javax.swing.JLabel();
        l15 = new javax.swing.JLabel();
        l16 = new javax.swing.JLabel();
        l21 = new javax.swing.JLabel();
        l19 = new javax.swing.JLabel();
        l22 = new javax.swing.JLabel();
        l23 = new javax.swing.JLabel();
        l24 = new javax.swing.JLabel();
        l26 = new javax.swing.JLabel();
        l25 = new javax.swing.JLabel();
        l27 = new javax.swing.JLabel();
        l28 = new javax.swing.JLabel();
        l33 = new javax.swing.JLabel();
        l31 = new javax.swing.JLabel();
        l29 = new javax.swing.JLabel();
        l30 = new javax.swing.JLabel();
        l34 = new javax.swing.JLabel();
        l35 = new javax.swing.JLabel();
        l32 = new javax.swing.JLabel();
        l42 = new javax.swing.JLabel();
        l40 = new javax.swing.JLabel();
        l38 = new javax.swing.JLabel();
        l36 = new javax.swing.JLabel();
        l39 = new javax.swing.JLabel();
        l37 = new javax.swing.JLabel();
        l41 = new javax.swing.JLabel();
        l47 = new javax.swing.JLabel();
        l46 = new javax.swing.JLabel();
        l44 = new javax.swing.JLabel();
        l49 = new javax.swing.JLabel();
        l45 = new javax.swing.JLabel();
        l48 = new javax.swing.JLabel();
        l43 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        l1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        l3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        l2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        l5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        l6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        l7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        l4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        l14.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        l13.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        l12.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        l11.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        l10.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        l9.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        l8.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        l20.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        l18.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        l17.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        l15.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        l16.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        l21.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        l19.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        l22.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        l23.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        l24.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        l26.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        l25.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        l27.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        l28.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        l33.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        l31.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        l29.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        l30.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        l34.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        l35.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        l32.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        l42.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        l40.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        l38.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        l36.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        l39.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        l37.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        l41.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        l47.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        l46.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        l44.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        l49.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        l45.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        l48.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        l43.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton1.setText("SOLVE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(l2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(l3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(l4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(l5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(l6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(l7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(l8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(l9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(l10, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(l11, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(l12, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(l13, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(l14, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(l15, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(l16, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(l17, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(l18, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(l19, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(l20, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(l21, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(l22, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(l23, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(l24, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(l25, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(l26, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(l27, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(l28, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(l29, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(l30, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(l31, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(l32, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(l33, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(l34, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(l35, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(l36, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(l37, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(l38, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(l39, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(l40, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(l41, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(l42, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(l43, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(l44, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(l45, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(l46, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(2, 2, 2)
                        .addComponent(l47, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(l48, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(l49, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l11, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l14, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l12, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l10, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l13, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l18, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l21, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l19, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l17, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l16, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l15, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l20, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l25, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l28, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l26, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l24, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l23, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l22, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l27, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l32, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l35, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l33, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l31, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l30, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l29, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l34, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l39, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l42, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l40, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l38, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l37, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l36, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l41, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l46, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l49, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l47, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l45, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l44, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l43, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l48, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(jButton1)
                .addContainerGap(95, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        AkariPuzzle.solving();
        paintCell();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Display.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Display.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Display.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Display.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Display().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l10;
    private javax.swing.JLabel l11;
    private javax.swing.JLabel l12;
    private javax.swing.JLabel l13;
    private javax.swing.JLabel l14;
    private javax.swing.JLabel l15;
    private javax.swing.JLabel l16;
    private javax.swing.JLabel l17;
    private javax.swing.JLabel l18;
    private javax.swing.JLabel l19;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l20;
    private javax.swing.JLabel l21;
    private javax.swing.JLabel l22;
    private javax.swing.JLabel l23;
    private javax.swing.JLabel l24;
    private javax.swing.JLabel l25;
    private javax.swing.JLabel l26;
    private javax.swing.JLabel l27;
    private javax.swing.JLabel l28;
    private javax.swing.JLabel l29;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l30;
    private javax.swing.JLabel l31;
    private javax.swing.JLabel l32;
    private javax.swing.JLabel l33;
    private javax.swing.JLabel l34;
    private javax.swing.JLabel l35;
    private javax.swing.JLabel l36;
    private javax.swing.JLabel l37;
    private javax.swing.JLabel l38;
    private javax.swing.JLabel l39;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l40;
    private javax.swing.JLabel l41;
    private javax.swing.JLabel l42;
    private javax.swing.JLabel l43;
    private javax.swing.JLabel l44;
    private javax.swing.JLabel l45;
    private javax.swing.JLabel l46;
    private javax.swing.JLabel l47;
    private javax.swing.JLabel l48;
    private javax.swing.JLabel l49;
    private javax.swing.JLabel l5;
    private javax.swing.JLabel l6;
    private javax.swing.JLabel l7;
    private javax.swing.JLabel l8;
    private javax.swing.JLabel l9;
    // End of variables declaration//GEN-END:variables
}