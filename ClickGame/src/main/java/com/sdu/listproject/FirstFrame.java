
package com.sdu.listproject;

import java.util.Random;
import javax.swing.JOptionPane;


public class FirstFrame extends javax.swing.JFrame {

   
    public FirstFrame() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_escape = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_escape.setText("ClickMe!");
        btn_escape.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btn_escapeMouseMoved(evt);
            }
        });
        btn_escape.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_escapeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(298, 298, 298)
                .addComponent(btn_escape)
                .addContainerGap(374, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addComponent(btn_escape)
                .addContainerGap(282, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_escapeMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_escapeMouseMoved
        Random rnd = new Random();
        int width = this.getWidth();
        int height = this.getHeight();
        btn_escape.setLocation(rnd.nextInt(width), rnd.nextInt(height));
    }//GEN-LAST:event_btn_escapeMouseMoved

    private void btn_escapeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_escapeMouseClicked
        JOptionPane.showConfirmDialog(null, "Helal Lan Tıkladın");
    }//GEN-LAST:event_btn_escapeMouseClicked

    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FirstFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_escape;
    // End of variables declaration//GEN-END:variables
}
