/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

/**
 *
 * @author gustavo.pmiranda1
 */
public class IdiomasChecbox extends javax.swing.JFrame {

    /**
     * Creates new form IdiomasChecbox
     */
    public IdiomasChecbox() {
        initComponents();
    }
    public void enquete(){
        String texto="";
        if(cbIngles.isSelected()){
            texto+="Ingl�\n";
        }
        if(cbItaliano.isSelected()){
            texto+="Italiano\n";
        }
        if(cbespanhol.isSelected)(){
            texto+="Espanhol\n";
        }
                
                
           
           
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

        jLabel1 = new javax.swing.JLabel();
        cbIngles = new javax.swing.JCheckBox();
        cbItaliano = new javax.swing.JCheckBox();
        cbEspanhol = new javax.swing.JCheckBox();
        btOk = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("jLabel1");

        cbIngles.setText("Ingl�s");
        cbIngles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbInglesActionPerformed(evt);
            }
        });

        cbItaliano.setText("Italiano");
        cbItaliano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbItalianoActionPerformed(evt);
            }
        });

        cbEspanhol.setText("Espanhol");
        cbEspanhol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEspanholActionPerformed(evt);
            }
        });

        btOk.setText("Ok");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btOk)
                    .addComponent(cbEspanhol)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(cbIngles)
                        .addComponent(jLabel1))
                    .addComponent(cbItaliano))
                .addContainerGap(252, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addComponent(cbIngles)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbItaliano)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbEspanhol)
                .addGap(44, 44, 44)
                .addComponent(btOk)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbInglesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbInglesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbInglesActionPerformed

    private void cbItalianoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbItalianoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbItalianoActionPerformed

    private void cbEspanholActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEspanholActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbEspanholActionPerformed

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
            java.util.logging.Logger.getLogger(IdiomasChecbox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IdiomasChecbox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IdiomasChecbox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IdiomasChecbox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IdiomasChecbox().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btOk;
    private javax.swing.JCheckBox cbEspanhol;
    private javax.swing.JCheckBox cbIngles;
    private javax.swing.JCheckBox cbItaliano;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
