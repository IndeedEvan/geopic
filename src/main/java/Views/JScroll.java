/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.GroupLayout;

/**
 *
 * @author Ehsan
 */
public class JScroll extends javax.swing.JScrollPane implements Serializable{
    /**
     * Creates new form test
     */
    public JScroll(ArrayList<File> files) throws IOException{
        //initComponents();
        JPanelPreview jPanel;
        for (File f: files) {
            jPanel = new JPanelPreview(ImageIO.read(f));
            jPanel.setLayout(new java.awt.GridLayout());
            GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel);
            jPanel.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 133, Short.MAX_VALUE)
        );
            jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        add(jPanel);
            
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

        setLayout(new java.awt.GridLayout());
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
