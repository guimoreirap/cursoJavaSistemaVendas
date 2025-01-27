/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.ControllerCaixa;
import controller.ControllerRelatorio;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import model.ModelCaixa;

/**
 *
 * @author Usuario
 */
public class ViewCaixa extends javax.swing.JFrame {

    /**
     * Creates new form ViewCaixa
     */
    ArrayList<ModelCaixa> listaModelCaixa = new ArrayList<>();
    ControllerCaixa controllerCaixa = new ControllerCaixa();
    ModelCaixa modelCaixa = new ModelCaixa();
    int valorPermissao = -1;

    public ViewCaixa() {
        initComponents();
        this.carregarFluxoCaixa();
    }

    public ViewCaixa(int valorPermissao) {
        initComponents();
        this.carregarFluxoCaixa();
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

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtCaixa = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jcbMovimetacao = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jtfData = new javax.swing.JFormattedTextField();
        jbLimparData = new javax.swing.JButton();
        jbLimparDataFinal = new javax.swing.JButton();
        jtfDataFinal = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtfValorLiquido = new javax.swing.JTextField();
        jbRelatorio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Caixa");
        setResizable(false);

        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jtCaixa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Data", "Movimentação", "Ator", "Valor"
            }
        ));
        jScrollPane1.setViewportView(jtCaixa);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Filtros"));

        jLabel1.setText("Movimentação:");

        jLabel2.setText("Data Inicial:");

        jcbMovimetacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Geral", "Recebimento", "Pagamento" }));
        jcbMovimetacao.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbMovimetacaoItemStateChanged(evt);
            }
        });
        jcbMovimetacao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcbMovimetacaoMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jcbMovimetacaoMouseReleased(evt);
            }
        });
        jcbMovimetacao.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jcbMovimetacaoInputMethodTextChanged(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("aaaa-mm-dd");

        try {
            jtfData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jtfData.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtfDataKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfDataKeyReleased(evt);
            }
        });

        jbLimparData.setText("Limpar");
        jbLimparData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparDataActionPerformed(evt);
            }
        });

        jbLimparDataFinal.setText("Limpar");
        jbLimparDataFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparDataFinalActionPerformed(evt);
            }
        });

        try {
            jtfDataFinal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jtfDataFinal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfDataFinalKeyReleased(evt);
            }
        });

        jLabel5.setText("Data Final:");

        jLabel6.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6.setText("aaaa-mm-dd");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jtfData, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbLimparData)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jtfDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbLimparDataFinal)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcbMovimetacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfDataFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbLimparDataFinal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcbMovimetacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbLimparData))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLabel4.setText("Valor líquido:");

        jtfValorLiquido.setEditable(false);
        jtfValorLiquido.setBackground(new java.awt.Color(255, 102, 102));
        jtfValorLiquido.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jbRelatorio.setText("Gerar relatorio");
        jbRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRelatorioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbRelatorio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jtfValorLiquido, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtfValorLiquido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbRelatorio))
                .addGap(26, 26, 26))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new ViewPrincipal(this.valorPermissao).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jcbMovimetacaoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcbMovimetacaoMouseReleased

    }//GEN-LAST:event_jcbMovimetacaoMouseReleased

    private void jcbMovimetacaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcbMovimetacaoMouseClicked

    }//GEN-LAST:event_jcbMovimetacaoMouseClicked

    private void jcbMovimetacaoInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jcbMovimetacaoInputMethodTextChanged

    }//GEN-LAST:event_jcbMovimetacaoInputMethodTextChanged

    private void jcbMovimetacaoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbMovimetacaoItemStateChanged
        this.carregarFluxoCaixa();
    }//GEN-LAST:event_jcbMovimetacaoItemStateChanged

    private void jtfDataKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfDataKeyReleased
        this.carregarFluxoCaixa();
    }//GEN-LAST:event_jtfDataKeyReleased

    private void jbLimparDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparDataActionPerformed
        this.jtfData.setText("");
        this.carregarFluxoCaixa();
    }//GEN-LAST:event_jbLimparDataActionPerformed

    private void jbLimparDataFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparDataFinalActionPerformed
        this.jtfDataFinal.setText("");
        this.carregarFluxoCaixa();
    }//GEN-LAST:event_jbLimparDataFinalActionPerformed

    private void jtfDataFinalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfDataFinalKeyReleased
        this.carregarFluxoCaixa();
    }//GEN-LAST:event_jtfDataFinalKeyReleased

    private void jtfDataKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfDataKeyPressed
        this.carregarFluxoCaixa();
    }//GEN-LAST:event_jtfDataKeyPressed

    private void jbRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRelatorioActionPerformed
        ControllerRelatorio controllerRelatorio = new ControllerRelatorio();
        String movimentacao = "Geral";
        
        if(jcbMovimetacao.getSelectedItem().equals("Recebimento")){
            movimentacao = "Recebimento";
        } else if(jcbMovimetacao.getSelectedItem().equals("Pagamento")){
            movimentacao = "Pagamento";
        } else {
            movimentacao = "Geral";
        }
        controllerRelatorio.gerarPdfCaixa(movimentacao, this.jtfData.getText(), this.jtfDataFinal.getText());
    }//GEN-LAST:event_jbRelatorioActionPerformed

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
            java.util.logging.Logger.getLogger(ViewCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewCaixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewCaixa().setVisible(true);
            }
        });
    }

    private void carregarFluxoCaixa() {
        String formatacaoData = "    -  -  ";
        String movimentacao = jcbMovimetacao.getSelectedItem().toString();
        String data = jtfData.getText();
        String dataFinal = jtfDataFinal.getText();

        if (!data.equals(formatacaoData) && jcbMovimetacao.getSelectedItem().equals("Geral") && dataFinal.equals(formatacaoData)) {
            listaModelCaixa = controllerCaixa.retornarListaCaixaDataController(data);
        } else if (data.equals(formatacaoData) && !jcbMovimetacao.getSelectedItem().equals("Geral") && dataFinal.equals(formatacaoData)) {
            listaModelCaixa = controllerCaixa.retornarListaCaixaMovimentacaoController(movimentacao);
        } else if (!data.equals(formatacaoData) && !jcbMovimetacao.getSelectedItem().equals("Geral") && dataFinal.equals(formatacaoData)) {
            listaModelCaixa = controllerCaixa.retornarListaCaixaController(movimentacao, data);
        } else if (!data.equals(formatacaoData) && !dataFinal.equals(formatacaoData) && jcbMovimetacao.getSelectedItem().equals("Geral")) {
            listaModelCaixa = controllerCaixa.retornarListaCaixaDataController(data, dataFinal);
        } else if (!data.equals(formatacaoData) && !dataFinal.equals(formatacaoData) && !jcbMovimetacao.getSelectedItem().equals("Geral")) {
            listaModelCaixa = controllerCaixa.retornarListaCaixaDataController(data, dataFinal, movimentacao);
        } else {
            listaModelCaixa = controllerCaixa.retornarListaCaixaController();
        }

        //atribui os valores retornados a uma lista
        DefaultTableModel modelo = (DefaultTableModel) jtCaixa.getModel();
        double valorLiquidoCaixa = 0;

        //Cada vez que o metodo é chamado, a tabela é zerada as linhas - evita dados repetidos na tela
        modelo.setNumRows(0);

        //inserir produtos na tabela
        int count = listaModelCaixa.size(); //pega o tamanho da lista pra percorrer todos os dados dela
        for (int i = 0; i < count; i++) {
            modelo.addRow(new Object[]{ //adiciona uma linha 
                //passa o que cada coluna da linha apresentará em ordem
                listaModelCaixa.get(i).getCaixaData(),
                listaModelCaixa.get(i).getCaixaMovimentacao(),
                listaModelCaixa.get(i).getCaixaAtor(),
                formatarValor(listaModelCaixa.get(i).getCaixaValor())
            });
            if (listaModelCaixa.get(i).getCaixaMovimentacao().equalsIgnoreCase("Pagamento")) {
                valorLiquidoCaixa -= listaModelCaixa.get(i).getCaixaValor();
            } else if (listaModelCaixa.get(i).getCaixaMovimentacao().equalsIgnoreCase("Recebimento")) {
                valorLiquidoCaixa += listaModelCaixa.get(i).getCaixaValor();
            }
        }

        this.jtfValorLiquido.setText(formatarValor(valorLiquidoCaixa));
        if(Double.parseDouble(this.jtfValorLiquido.getText()) < 0){
            jtfValorLiquido.setBackground(new java.awt.Color(255, 51, 51));
        } else if(Double.parseDouble(this.jtfValorLiquido.getText()) > 0){
            jtfValorLiquido.setBackground(new java.awt.Color(102, 255, 102));
        } else {
            jtfValorLiquido.setBackground(new java.awt.Color(255, 255, 255));
        }
    }

    private String formatarValor(Double valor) {
        return String.format("%.2f", valor).replaceAll(",", ".");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbLimparData;
    private javax.swing.JButton jbLimparDataFinal;
    private javax.swing.JButton jbRelatorio;
    private javax.swing.JComboBox<String> jcbMovimetacao;
    private javax.swing.JTable jtCaixa;
    private javax.swing.JFormattedTextField jtfData;
    private javax.swing.JFormattedTextField jtfDataFinal;
    private javax.swing.JTextField jtfValorLiquido;
    // End of variables declaration//GEN-END:variables
}
