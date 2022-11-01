/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class ViewPrincipal extends javax.swing.JFrame {

    int valorPermissao = -1;

    public ViewPrincipal() {
        initComponents();
    }

    public ViewPrincipal(int valorPermissao) {
        initComponents();
        this.valorPermissao = valorPermissao;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        uJPanelImagem1 = new componentes.UJPanelImagem();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCadastros = new javax.swing.JMenu();
        jmiCliente = new javax.swing.JMenuItem();
        jmiProduto = new javax.swing.JMenuItem();
        jmiUsuario = new javax.swing.JMenuItem();
        jMenuMovimentações = new javax.swing.JMenu();
        jmiVendas = new javax.swing.JMenuItem();
        jmiPagamentos = new javax.swing.JMenuItem();
        jmiRecebimentos = new javax.swing.JMenuItem();
        jmiRecebimentos1 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Principal");
        setResizable(false);

        uJPanelImagem1.setImagem(new java.io.File("C:\\Users\\Usuario\\Desktop\\Backup Valdineis Moreira\\Usuario\\Documents\\NetBeansProjects\\SistemaVendas\\src\\imagens\\pexels-chan-walrus-941864.jpg"));

        javax.swing.GroupLayout uJPanelImagem1Layout = new javax.swing.GroupLayout(uJPanelImagem1);
        uJPanelImagem1.setLayout(uJPanelImagem1Layout);
        uJPanelImagem1Layout.setHorizontalGroup(
            uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 684, Short.MAX_VALUE)
        );
        uJPanelImagem1Layout.setVerticalGroup(
            uJPanelImagem1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 495, Short.MAX_VALUE)
        );

        jMenuCadastros.setText("Cadastros");

        jmiCliente.setText("Cliente");
        jmiCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiClienteActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jmiCliente);

        jmiProduto.setText("Produto");
        jmiProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiProdutoActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jmiProduto);

        jmiUsuario.setText("Usuário");
        jmiUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiUsuarioActionPerformed(evt);
            }
        });
        jMenuCadastros.add(jmiUsuario);

        jMenuBar1.add(jMenuCadastros);

        jMenuMovimentações.setText("Movimentações");

        jmiVendas.setText("Vendas");
        jmiVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiVendasActionPerformed(evt);
            }
        });
        jMenuMovimentações.add(jmiVendas);

        jmiPagamentos.setText("Pagamentos");
        jmiPagamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiPagamentosActionPerformed(evt);
            }
        });
        jMenuMovimentações.add(jmiPagamentos);

        jmiRecebimentos.setText("Contas a receber");
        jmiRecebimentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiRecebimentosActionPerformed(evt);
            }
        });
        jMenuMovimentações.add(jmiRecebimentos);

        jmiRecebimentos1.setText("Caixa");
        jmiRecebimentos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiRecebimentos1ActionPerformed(evt);
            }
        });
        jMenuMovimentações.add(jmiRecebimentos1);

        jMenuBar1.add(jMenuMovimentações);

        jMenu1.setText("Sair");

        jMenuSair.setText("Logout");
        jMenuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuSairActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuSair);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(uJPanelImagem1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(uJPanelImagem1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jmiPagamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiPagamentosActionPerformed
        new ViewPagamentos(this.valorPermissao).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jmiPagamentosActionPerformed

    private void jmiClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiClienteActionPerformed
        new ViewCliente(this.valorPermissao).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jmiClienteActionPerformed

    private void jmiProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiProdutoActionPerformed
        new ViewProduto(this.valorPermissao).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jmiProdutoActionPerformed

    private void jmiUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiUsuarioActionPerformed
        if (this.valorPermissao == 1) {
            new ViewUsuario(this.valorPermissao).setVisible(true);
            this.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(
                    this, "Acesso restrito à admin.", "Atenção", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jmiUsuarioActionPerformed

    private void jmiVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiVendasActionPerformed
        new ViewVenda(this.valorPermissao).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jmiVendasActionPerformed

    private void jmiRecebimentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiRecebimentosActionPerformed
        new ViewRecebimentos(this.valorPermissao).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jmiRecebimentosActionPerformed

    private void jmiRecebimentos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiRecebimentos1ActionPerformed
        new ViewCaixa(this.valorPermissao).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jmiRecebimentos1ActionPerformed

    private void jMenuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuSairActionPerformed
        new ViewLogin().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuSairActionPerformed

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
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewPrincipal().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastros;
    private javax.swing.JMenu jMenuMovimentações;
    private javax.swing.JMenuItem jMenuSair;
    private javax.swing.JMenuItem jmiCliente;
    private javax.swing.JMenuItem jmiPagamentos;
    private javax.swing.JMenuItem jmiProduto;
    private javax.swing.JMenuItem jmiRecebimentos;
    private javax.swing.JMenuItem jmiRecebimentos1;
    private javax.swing.JMenuItem jmiUsuario;
    private javax.swing.JMenuItem jmiVendas;
    private componentes.UJPanelImagem uJPanelImagem1;
    // End of variables declaration//GEN-END:variables
}
