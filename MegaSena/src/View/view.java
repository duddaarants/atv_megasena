/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import static java.lang.System.exit;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author ETECIA
 */
public class view extends javax.swing.JFrame {

    /**
     * Creates new form view
     */
    public view() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelImage1 = new org.edisoncor.gui.panel.PanelImage();
        jLabel1 = new javax.swing.JLabel();
        buttonIcon3 = new org.edisoncor.gui.button.ButtonIcon();
        jLabel2 = new javax.swing.JLabel();
        buttonIcon2 = new org.edisoncor.gui.button.ButtonIcon();
        buttonIcon4 = new org.edisoncor.gui.button.ButtonIcon();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        buttonIcon5 = new org.edisoncor.gui.button.ButtonIcon();
        resultado = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 0));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(null);

        panelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/loterias-caixa-logo-vector-400x400.png"))); // NOI18N
        panelImage1.setLayout(null);
        jPanel1.add(panelImage1);
        panelImage1.setBounds(110, 0, 180, 140);

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(209, 78, 145));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Lotofácil");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(170, 190, 70, 20);

        buttonIcon3.setBackground(new java.awt.Color(2, 108, 59));
        buttonIcon3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/megasena-icon.png"))); // NOI18N
        buttonIcon3.setText("Mega Sena");
        buttonIcon3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonIcon3ActionPerformed(evt);
            }
        });
        jPanel1.add(buttonIcon3);
        buttonIcon3.setBounds(20, 110, 70, 70);

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(2, 108, 59));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Sena");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 210, 70, 20);

        buttonIcon2.setBackground(new java.awt.Color(76, 80, 148));
        buttonIcon2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/quina-icon.png"))); // NOI18N
        buttonIcon2.setText("Quina");
        buttonIcon2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonIcon2ActionPerformed(evt);
            }
        });
        jPanel1.add(buttonIcon2);
        buttonIcon2.setBounds(310, 110, 70, 70);

        buttonIcon4.setBackground(new java.awt.Color(209, 78, 145));
        buttonIcon4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/unnamed.png"))); // NOI18N
        buttonIcon4.setText("lotofacil\n");
        buttonIcon4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonIcon4ActionPerformed(evt);
            }
        });
        jPanel1.add(buttonIcon4);
        buttonIcon4.setBounds(170, 110, 70, 70);

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(76, 80, 148));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Quina");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(310, 190, 70, 20);

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(2, 108, 59));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Mega");
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 190, 70, 20);

        buttonIcon5.setBackground(new java.awt.Color(204, 0, 0));
        buttonIcon5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icons8-sair-100.png"))); // NOI18N
        buttonIcon5.setText("buttonIcon5");
        buttonIcon5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonIcon5ActionPerformed(evt);
            }
        });
        jPanel1.add(buttonIcon5);
        buttonIcon5.setBounds(190, 240, 40, 50);

        resultado.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(resultado);
        resultado.setBounds(40, 410, 390, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(500, 500));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonIcon3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonIcon3ActionPerformed
          Model.Aleatorio.gera();
          resultado.setText(String.valueOf(Model.Aleatorio.x));
    }//GEN-LAST:event_buttonIcon3ActionPerformed

    private void buttonIcon4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonIcon4ActionPerformed
    Random gera = new Random();
    String x = "";
    int vet[] = new int[15];
    for(int i=0; i<15; i++){
        vet[i] = gera.nextInt(25);
        x = x + vet[i] + "|";
    }
    JOptionPane.showMessageDialog(null,x );        // TODO add your handling code here:
    }//GEN-LAST:event_buttonIcon4ActionPerformed

    private void buttonIcon2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonIcon2ActionPerformed
    Random gera = new Random();
    String x = "";
    int vet[] = new int[5];
    for(int i=0; i<5; i++){
        vet[i] = gera.nextInt(80);
        x = x + vet[i] + "|";
    }
    JOptionPane.showMessageDialog(null,x );        // TODO add your handling code here:
    }//GEN-LAST:event_buttonIcon2ActionPerformed

    private void buttonIcon5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonIcon5ActionPerformed

        int valor = JOptionPane.showConfirmDialog(null, "Você quer sair?");
        
        if (valor==0){
            exit(0);
        }
        
        
    }//GEN-LAST:event_buttonIcon5ActionPerformed

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
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(view.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new view().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.button.ButtonIcon buttonIcon2;
    private org.edisoncor.gui.button.ButtonIcon buttonIcon3;
    private org.edisoncor.gui.button.ButtonIcon buttonIcon4;
    private org.edisoncor.gui.button.ButtonIcon buttonIcon5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private org.edisoncor.gui.panel.PanelImage panelImage1;
    private javax.swing.JLabel resultado;
    // End of variables declaration//GEN-END:variables
}
