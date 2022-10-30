/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.ControllerProdutos;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import model.ModelProdutos;
import util.Formatador;

/**
 *
 * @author Usuario
 */
public class ViewProduto extends javax.swing.JFrame {

    ArrayList<ModelProdutos> listaModelProdutos = new ArrayList<>();
    ControllerProdutos controllerProdutos = new ControllerProdutos();
    ModelProdutos modelProdutos = new ModelProdutos();
    String salvarAlterar = "salvar";
    Formatador formatador = new Formatador();
    int valorPermissao = -1;

    /**
     * Creates new form ViewProduto
     */
    public ViewProduto() {
        initComponents();
        this.carregarProdutos();
        this.buttonGroupEstoque.add(jrbAdicionarEstoque);
        this.buttonGroupEstoque.add(jrbRemoverEstoque);
        this.desabilitarGerenciarProduto();
        //this.habilitarDesabilitarCampos(false);
    }

    public ViewProduto(int valorPermissao) {
        initComponents();
        this.carregarProdutos();
        this.buttonGroupEstoque.add(jrbAdicionarEstoque);
        this.buttonGroupEstoque.add(jrbRemoverEstoque);
        this.desabilitarGerenciarProduto();
        this.valorPermissao = valorPermissao;
        //this.habilitarDesabilitarCampos(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupEstoque = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProdutos = new javax.swing.JTable();
        jtfCodigo = new javax.swing.JTextField();
        jtfNome = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtfPesquisar = new javax.swing.JTextField();
        jButtonPesquisar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonNovo = new javax.swing.JButton();
        jButtonSalvar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jtfEstoque = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        jtfValor = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jtfNovoEstoque = new javax.swing.JFormattedTextField();
        jrbAdicionarEstoque = new javax.swing.JRadioButton();
        jrbRemoverEstoque = new javax.swing.JRadioButton();
        jbVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Produtos");
        setResizable(false);

        jLabel1.setText("Código:");

        jLabel2.setText("Nome:");

        jTableProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome", "Estoque", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableProdutos);
        if (jTableProdutos.getColumnModel().getColumnCount() > 0) {
            jTableProdutos.getColumnModel().getColumn(1).setMinWidth(300);
            jTableProdutos.getColumnModel().getColumn(1).setMaxWidth(300);
        }

        jtfCodigo.setEnabled(false);

        jLabel5.setText("Filtro de produto:");

        jtfPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfPesquisarKeyReleased(evt);
            }
        });

        jButtonPesquisar.setText("Pesquisar");
        jButtonPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPesquisarActionPerformed(evt);
            }
        });

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jButtonAlterar.setText("Alterar");
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });

        jButtonNovo.setText("Novo");
        jButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoActionPerformed(evt);
            }
        });

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Gerenciar estoque"));

        jtfEstoque.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        jLabel3.setText("Quantidade:");

        jtfValor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));

        jLabel4.setText("Valor:");

        jtfNovoEstoque.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jtfNovoEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNovoEstoqueActionPerformed(evt);
            }
        });

        jrbAdicionarEstoque.setText("Adicionar");

        jrbRemoverEstoque.setText("Remover");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jtfEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfNovoEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jrbAdicionarEstoque)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jrbRemoverEstoque))
                    .addComponent(jLabel4)
                    .addComponent(jtfValor, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfNovoEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrbAdicionarEstoque)
                    .addComponent(jrbRemoverEstoque))
                .addGap(27, 27, 27))
        );

        jbVoltar.setText("Voltar");
        jbVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSalvar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jtfPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButtonPesquisar))))
                        .addGap(0, 14, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(jbVoltar)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jbVoltar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtfPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonExcluir)
                    .addComponent(jButtonAlterar)
                    .addComponent(jButtonNovo)
                    .addComponent(jButtonSalvar))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        if (salvarAlterar.equals("salvar")) {
            this.salvarProduto();
        } else if (salvarAlterar.equals("alterar")) {
            this.alterarProduto();
        }

    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        //Exclui um produto no banco
        int linha = jTableProdutos.getSelectedRow();
        int codigoProduto = (int) jTableProdutos.getValueAt(linha, 0);

        try {
            controllerProdutos.excluirProdutoController(codigoProduto);
            JOptionPane.showMessageDialog(
                    this, "Produto excluído com sucesso.", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    this, "Ocorreu um erro ao excluir o produto no banco de dados.", "ERRO", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        } finally {
            this.carregarProdutos();
            this.limparTabela();
        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoActionPerformed
        this.limparTabela();
        //this.habilitarDesabilitarCampos(true);
        this.salvarAlterar = "salvar";
        this.desabilitarGerenciarProduto();

    }//GEN-LAST:event_jButtonNovoActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        this.salvarAlterar = "alterar";
        this.habilitarGerenciarProduto();
        this.jtfEstoque.setEnabled(false);
        this.jtfNovoEstoque.setText("0");

        int linha = this.jTableProdutos.getSelectedRow();
        try {
            int codigoProduto = (int) this.jTableProdutos.getValueAt(linha, 0);
            //this.habilitarDesabilitarCampos(true);
            this.jtfNome.requestFocus();
            //recupera os dados do banco
            modelProdutos = controllerProdutos.retornarProdutoController(codigoProduto);
            //seta nos campos na interface
            this.jtfCodigo.setText(String.valueOf(modelProdutos.getIdProduto()));
            this.jtfNome.setText(modelProdutos.getProNome());
            this.jtfEstoque.setText(String.valueOf(modelProdutos.getProEstoque()));
            //this.jtfValor.setText(String.valueOf(modelProdutos.getProValor()));
            //Altera os pontos por virgula, para nao bugar ao salvar o valor
            this.jtfValor.setText(String.valueOf(modelProdutos.getProValor()).replace(".", ","));
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(
                    this, "Código inválido ou nenhum registro selecionado.", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPesquisarActionPerformed
        this.filtrarProduto();
    }//GEN-LAST:event_jButtonPesquisarActionPerformed

    private void jtfPesquisarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfPesquisarKeyReleased
        this.filtrarProduto();
    }//GEN-LAST:event_jtfPesquisarKeyReleased

    private void jbVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVoltarActionPerformed
        new ViewPrincipal(this.valorPermissao).setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jbVoltarActionPerformed

    private void jtfNovoEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNovoEstoqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNovoEstoqueActionPerformed

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
            java.util.logging.Logger.getLogger(ViewProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewProduto().setVisible(true);
            }
        });
    }

    public void carregarProdutos() {
        listaModelProdutos = controllerProdutos.retornarListaProdutoController(); //atribui os valores retornados a uma lista
        DefaultTableModel modelo = (DefaultTableModel) jTableProdutos.getModel();

        //Cada vez que o metodo é chamado, a tabela é zerada as linhas - evita dados repetidos na tela
        modelo.setNumRows(0);

        //inserir produtos na tabela
        int count = listaModelProdutos.size(); //pega o tamanho da lista pra percorrer todos os dados dela
        for (int i = 0; i < count; i++) {
            modelo.addRow(new Object[]{ //adiciona uma linha 
                //passa o que cada coluna da linha apresentará em ordem
                listaModelProdutos.get(i).getIdProduto(),
                listaModelProdutos.get(i).getProNome(),
                listaModelProdutos.get(i).getProEstoque(),
                listaModelProdutos.get(i).getProValor()
            });
        }

    }

    //limpa todos os dados presentes na view
    public void limparTabela() {
        this.jtfCodigo.setText("");
        this.jtfNome.setText("");
        this.jtfEstoque.setText("");
        this.jtfValor.setText("");
        this.jtfNome.requestFocus();
        this.jtfNovoEstoque.setText("");
        this.jtfEstoque.setEnabled(true);
        this.jtfNovoEstoque.setEnabled(false);
        this.jrbAdicionarEstoque.setSelected(false);
        this.jrbRemoverEstoque.setSelected(false);
    }

    //habilita/desabilita a edição dos campos da view
    /*private void habilitarDesabilitarCampos(boolean condicao) {
        jtfNome.setEnabled(condicao);
        jtfEstoque.setEnabled(condicao);
        jtfValor.setEnabled(condicao);
        jButtonSalvar.setEnabled(condicao);
    }*/
    //metodo para o botão salvar produto
    private void salvarProduto() {
        //pega os valores dos campos da interface e coloca dentro de cada atributo do objeto
        modelProdutos.setProNome(this.jtfNome.getText());
        modelProdutos.setProEstoque(Integer.parseInt(this.jtfEstoque.getText()));
//        modelProdutos.setProValor(formatador.converterVirgulaParaPontoReturnFloat(this.jtfValor.getText()));
        modelProdutos.setProValor(Double.parseDouble(this.jtfValor.getText().replaceAll(",", ".")));

        try {
            controllerProdutos.salvarProdutoController(modelProdutos);
            JOptionPane.showMessageDialog(
                    this, "Produto inserido com sucesso.", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    this, "Ocorreu um erro ao inserir o produto no banco de dados.", "ERRO", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        } finally {
            this.carregarProdutos();
            this.limparTabela();
        }
    }

    private void alterarProduto() {
        //pega os valores dos campos da interface e coloca dentro de cada atributo do objeto
        modelProdutos.setIdProduto(Integer.parseInt(this.jtfCodigo.getText()));
        modelProdutos.setProNome(this.jtfNome.getText());
        modelProdutos.setProValor(formatador.converterVirgulaParaPontoReturnFloat(this.jtfValor.getText()));

        int estoqueOriginal = Integer.parseInt(this.jtfEstoque.getText());
        int quantidadeInserida = Integer.parseInt(this.jtfNovoEstoque.getText());

        try {
            if (jrbAdicionarEstoque.isSelected()) {
                modelProdutos.setProEstoque(estoqueOriginal + quantidadeInserida);
            } else if (jrbRemoverEstoque.isSelected()) {
                modelProdutos.setProEstoque(estoqueOriginal - quantidadeInserida);
            } else {
                modelProdutos.setProEstoque(estoqueOriginal + 0);
            }
        } catch (Exception e) {
        }

        try {
            controllerProdutos.alterarProdutoController(modelProdutos);
            JOptionPane.showMessageDialog(
                    this, "Produto alterado com sucesso.", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    this, "Ocorreu um erro ao inserir o produto no banco de dados.", "ERRO", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        } finally {
            this.carregarProdutos();
            this.limparTabela();
        }
    }

    //faz um filtro para todos os produtos através do nome passado
    private void filtrarProduto() {
        DefaultTableModel modelo = (DefaultTableModel) this.jTableProdutos.getModel();
        final TableRowSorter<TableModel> classificador = new TableRowSorter<>(modelo);
        this.jTableProdutos.setRowSorter(classificador);
        String texto = jtfPesquisar.getText();

        //texto é o nome do produto a ser filtrado, e 1 é a coluna onde a informação esta localizada na tabela
        classificador.setRowFilter(RowFilter.regexFilter(texto, 1));
    }

    private void desabilitarGerenciarProduto() {
        this.jrbAdicionarEstoque.setEnabled(false);
        this.jrbRemoverEstoque.setEnabled(false);
        this.jtfNovoEstoque.setEnabled(false);
    }

    private void habilitarGerenciarProduto() {
        this.jrbAdicionarEstoque.setEnabled(true);
        this.jrbRemoverEstoque.setEnabled(true);
        this.jtfNovoEstoque.setEnabled(true);
    }

    private void alternarSelecaoRadioButton() {
//        if(this.jrbAdicionarEstoque.isSelected()){
//            this.jrbRemoverEstoque.();
//        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupEstoque;
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonNovo;
    private javax.swing.JButton jButtonPesquisar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableProdutos;
    private javax.swing.JButton jbVoltar;
    private javax.swing.JRadioButton jrbAdicionarEstoque;
    private javax.swing.JRadioButton jrbRemoverEstoque;
    private javax.swing.JTextField jtfCodigo;
    private javax.swing.JFormattedTextField jtfEstoque;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JFormattedTextField jtfNovoEstoque;
    private javax.swing.JTextField jtfPesquisar;
    private javax.swing.JFormattedTextField jtfValor;
    // End of variables declaration//GEN-END:variables
}
