/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import Repositorio.RepAluno;
import javax.swing.JOptionPane;
import model.Aluno;

/**
 *
 * @author ESCOLA
 */
public class JDAluno extends javax.swing.JDialog {

    /**
     * Creates new form JDAluno
     */
    public JDAluno(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldID = new javax.swing.JTextField();
        jTextFieldnome = new javax.swing.JTextField();
        jTextFieldcpf = new javax.swing.JTextField();
        jTextFieldendereco = new javax.swing.JTextField();
        jTextFieldnumero = new javax.swing.JTextField();
        jTextFieldbairro = new javax.swing.JTextField();
        jTextFieldcidade = new javax.swing.JTextField();
        jButtonCadastrar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldtelefone = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nome");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        jLabel2.setText("CPF");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 30, -1));

        jLabel3.setText("Endereço");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, -1, -1));

        jLabel4.setText("Bairro");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jLabel5.setText("Numero");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jLabel6.setText("Cidade");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, -1, 20));

        jLabel7.setText("ID");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jTextFieldID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIDActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldID, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 100, -1));

        jTextFieldnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldnomeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldnome, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 210, -1));
        getContentPane().add(jTextFieldcpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 100, -1));
        getContentPane().add(jTextFieldendereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 190, -1));
        getContentPane().add(jTextFieldnumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 160, 110, -1));

        jTextFieldbairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldbairroActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldbairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 130, -1));
        getContentPane().add(jTextFieldcidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 120, -1));

        jButtonCadastrar.setText("Cadastrar");
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, -1, -1));

        jLabel8.setText("Telefone");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, -1, -1));
        getContentPane().add(jTextFieldtelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 130, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIDActionPerformed

    private void jTextFieldnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldnomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldnomeActionPerformed

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
  // TODO add your handling code here:
        Aluno aluno = new Aluno();
        
        if(!jTextFieldID.getText().equals("")){
            aluno.setId(Integer.parseInt(jTextFieldID.getText()));
        }
        aluno.setNome(jTextFieldnome.getText());
        aluno.setCpf(jTextFieldcpf.getText());
        aluno.setTelefone(jTextFieldtelefone.getText());
        aluno.setEndereco(jTextFieldendereco.getText());
        aluno.setBairro(jTextFieldbairro.getText());
        aluno.setNumero(jTextFieldnumero.getText());
        aluno.setCidade(jTextFieldcidade.getText());
        
        RepAluno repAluno = new RepAluno();
        repAluno.inserir(aluno);
        JOptionPane.showMessageDialog(null,
                "Cadastrado com sucesso.");
    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void jTextFieldbairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldbairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldbairroActionPerformed

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
            java.util.logging.Logger.getLogger(JDAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDAluno dialog = new JDAluno(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldbairro;
    private javax.swing.JTextField jTextFieldcidade;
    private javax.swing.JTextField jTextFieldcpf;
    private javax.swing.JTextField jTextFieldendereco;
    private javax.swing.JTextField jTextFieldnome;
    private javax.swing.JTextField jTextFieldnumero;
    private javax.swing.JTextField jTextFieldtelefone;
    // End of variables declaration//GEN-END:variables
}
