/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.ControllerClientes;
import controller.ControllerRecebimentos;
import controller.ControllerVendas;
import controller.ControllerVendasCliente;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.ModelClientes;
import model.ModelRecebimentos;
import model.ModelVendas;
import model.ModelVendasCliente;
import util.BLDatas;

/**
 *
 * @author Usuario
 */
public class ViewDividas extends javax.swing.JFrame {

    ModelVendas modelVendas = new ModelVendas();
    ControllerVendas controllerVenda = new ControllerVendas();

    ModelClientes modelCliente = new ModelClientes();
    ControllerClientes controllerCliente = new ControllerClientes();
    ArrayList<ModelClientes> listaModelClientes = new ArrayList<>();

    ModelRecebimentos modelRecebimentos = new ModelRecebimentos();
    ControllerRecebimentos controllerRecebimentos = new ControllerRecebimentos();

    ControllerVendasCliente controllerVendasCliente = new ControllerVendasCliente();
    ArrayList<ModelVendasCliente> listaModelVendasCliente = new ArrayList<>();

    double valorTotal = 0;
    int linha = 0;

    //Formata a data para o formato US
    BLDatas bLDatas = new BLDatas();

    /**
     * Creates new form ViewDividas
     */
    public ViewDividas() {
        initComponents();
        this.listarClientes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jbRealizarRecebimento = new javax.swing.JButton();
        jtfValorTotal = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtDividas = new javax.swing.JTable();
        jcbCliente = new componentes.UJComboBox();
        jLabel2 = new javax.swing.JLabel();
        jtfCodigo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jbVoltar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jbVoltar1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtfData = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jcMetodoPagamento = new javax.swing.JComboBox<>();
        jtfCodigoCliente = new javax.swing.JTextField();
        jbCancelar = new javax.swing.JButton();
        jbEfetuarRecebimento = new javax.swing.JButton();
        jtfCliente = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jtfCodigoVenda = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jtfValorPago = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jtfValorVenda = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jtfValorRestante = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jtfValorReceber = new javax.swing.JTextField();
        jbCompletarValorRestante = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Dívidas");

        jbRealizarRecebimento.setText("Realizar recebimento");
        jbRealizarRecebimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRealizarRecebimentoActionPerformed(evt);
            }
        });

        jLabel3.setText("Valor total:");

        jtDividas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código venda", "Data", "Valor", "Valor pago", "Valor restante"
            }
        ));
        jScrollPane1.setViewportView(jtDividas);

        jcbCliente.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jcbClientePopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jLabel2.setText("Cliente");

        jtfCodigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jtfCodigoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfCodigoFocusLost(evt);
            }
        });

        jLabel1.setText("Código");

        jbVoltar.setText("Voltar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jbRealizarRecebimento)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jtfValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jcbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jbVoltar))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jbVoltar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtfValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jbRealizarRecebimento)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Dívidas", jPanel2);

        jbVoltar1.setText("Voltar");

        jLabel4.setText("Código do cliente:");

        jLabel5.setText("Cliente:");

        jtfData.setEditable(false);

        jLabel6.setText("Data");

        jLabel7.setText("Método de pagamento:");

        jcMetodoPagamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dinheiro", "Pix", "Cartão de crédito", "Cartão de débito", "Cheque" }));

        jtfCodigoCliente.setEditable(false);
        jtfCodigoCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfCodigoClienteFocusLost(evt);
            }
        });

        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jbEfetuarRecebimento.setText("Efetuar recebimento");
        jbEfetuarRecebimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEfetuarRecebimentoActionPerformed(evt);
            }
        });

        jtfCliente.setEditable(false);

        jLabel8.setText("Código da venda:");

        jtfCodigoVenda.setEditable(false);
        jtfCodigoVenda.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtfCodigoVendaFocusLost(evt);
            }
        });

        jLabel9.setText("Valor da venda:");

        jtfValorPago.setEditable(false);

        jLabel10.setText("Valor pago:");

        jtfValorVenda.setEditable(false);

        jLabel11.setText("Valor restante:");

        jtfValorRestante.setEditable(false);

        jLabel12.setText("Valor a receber:");

        jbCompletarValorRestante.setText("*");
        jbCompletarValorRestante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCompletarValorRestanteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jbCancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbEfetuarRecebimento))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jcMetodoPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7))
                                        .addGap(29, 29, 29)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(3, 3, 3)
                                                .addComponent(jLabel12))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jtfValorReceber, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jbCompletarValorRestante))))
                                    .addComponent(jLabel8)
                                    .addComponent(jtfCodigoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtfCodigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4))
                                        .addGap(26, 26, 26)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jtfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jtfData, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(jtfValorVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jtfValorPago, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel10))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11)
                                            .addComponent(jtfValorRestante, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 117, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jbVoltar1)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbVoltar1)
                .addGap(33, 33, 33)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfCodigoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfCodigoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfValorVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfValorPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfValorRestante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcMetodoPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtfValorReceber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbCompletarValorRestante))))
                .addGap(74, 74, 74)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCancelar)
                    .addComponent(jbEfetuarRecebimento))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Recebimento", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jcbClientePopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jcbClientePopupMenuWillBecomeInvisible
        if (jcbCliente.isPopupVisible()) {
            this.carregarComboBoxClientes();
        }
    }//GEN-LAST:event_jcbClientePopupMenuWillBecomeInvisible

    private void jtfCodigoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfCodigoFocusLost
        this.setComboBoxCliente();
        this.carregarVendas();
    }//GEN-LAST:event_jtfCodigoFocusLost

    private void jtfCodigoClienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfCodigoClienteFocusLost

    }//GEN-LAST:event_jtfCodigoClienteFocusLost

    private void jbEfetuarRecebimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEfetuarRecebimentoActionPerformed
        try {
            //Passa o ID da Venda e o novo valor de Valor Recebido para o objeto modelVendas
            modelVendas.setVenId(Integer.parseInt(jtfCodigoVenda.getText()));
            modelVendas.setVenValorRecebido(
                    Double.parseDouble(jtfValorPago.getText())
                    + Double.parseDouble(jtfValorReceber.getText()));
            //controllerVenda efetua o update no banco de dados com o novo valor de Valor Recebido
            controllerVenda.efetuarRecebimento(modelVendas);

            //-------------------------------------------------------------------------------
            //Passa os dados para registrar um novo Recebimento no banco de dados
            modelRecebimentos.setRecCliente(Integer.parseInt(jtfCodigoCliente.getText()));
            modelRecebimentos.setRecVenda(Integer.parseInt(jtfCodigoVenda.getText()));
            modelRecebimentos.setRecData(bLDatas.converterDataParaDateUS(new java.util.Date(System.currentTimeMillis())));
            modelRecebimentos.setRecMetodo(jcMetodoPagamento.getSelectedItem().toString());
            modelRecebimentos.setRecValor(Double.parseDouble(jtfValorReceber.getText()));

            //controllerRecebimentos insere um novo recebimento no banco de dados
            controllerRecebimentos.salvarRecebimento(modelRecebimentos);
            JOptionPane.showMessageDialog(this, "Recebimento efetuado com sucesso.", "AVISO", JOptionPane.WARNING_MESSAGE);

            //Volta a tela para a primeira página
            jTabbedPane1.setSelectedIndex(0);
            this.limparCamposRecebimento();

            //Faz requestFocus para atualizar os novos valores das vendas do cliente
            jtfCodigo.requestFocus();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Não foi possível efetuar recebimento.", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbEfetuarRecebimentoActionPerformed

    private void jtfCodigoVendaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfCodigoVendaFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfCodigoVendaFocusLost

    private void jbRealizarRecebimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRealizarRecebimentoActionPerformed
        //Ao clicar aqui, os dados da venda selecionada será passada para a tab Recebimento para inserir o recebimento
        try {
            //Seleciona a linha a ser recebida os valores para recebimento
            this.linha = jtDividas.getSelectedRow();
            //Pega os valores nas colunas de venda e atribui às variaveis
            int codigoVenda = (int) jtDividas.getValueAt(linha, 0);
            int codigoCliente = Integer.parseInt(jtfCodigo.getText());

            //atribui os valores das variaveis nos campos no formulario de Vendas
            jtfCodigoVenda.setText(String.valueOf(codigoVenda));
            jtfCodigoCliente.setText(String.valueOf(codigoCliente));
            jtfCliente.setText(String.valueOf(jcbCliente.getSelectedItem().toString()));
            jtfData.setText(String.valueOf(jtDividas.getValueAt(linha, 1)));
            jtfValorVenda.setText(String.valueOf(jtDividas.getValueAt(linha, 2)));
            jtfValorPago.setText(String.valueOf(jtDividas.getValueAt(linha, 3)));
            jtfValorRestante.setText(String.valueOf(jtDividas.getValueAt(linha, 4)));
            jtfValorReceber.requestFocus();

            jTabbedPane1.setSelectedIndex(1);
        } catch (Exception e) {
            e.printStackTrace();
            jTabbedPane1.setSelectedIndex(1);;;
            JOptionPane.showMessageDialog(this, "Erro inesperado.", "ERRO", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_jbRealizarRecebimentoActionPerformed

    private void jbCompletarValorRestanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCompletarValorRestanteActionPerformed
        jtfValorReceber.setText(String.valueOf(jtDividas.getValueAt(linha, 4)));
    }//GEN-LAST:event_jbCompletarValorRestanteActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        this.limparCamposRecebimento();
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jtfCodigoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtfCodigoFocusGained
        this.setComboBoxCliente();
        this.carregarVendas();
    }//GEN-LAST:event_jtfCodigoFocusGained

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
            java.util.logging.Logger.getLogger(ViewDividas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewDividas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewDividas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewDividas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewDividas().setVisible(true);
            }
        });
    }

    //Metodo para carregar os clientes dentro do Combo Box
    private void carregarComboBoxClientes() {
        modelCliente = controllerCliente.retornarClienteController(jcbCliente.getSelectedItem().toString());
        //gambiarra pra retornar como String um valor inteiro
        jtfCodigo.setText(String.valueOf(modelCliente.getIdCliente()));
        this.carregarVendas();
    }

    //Metodo para adicionar a lista com os clientes dentro do ComboBox
    private void listarClientes() {
        //retorna todos os clientes pra dentro da lista
        listaModelClientes = controllerCliente.retornarListaClienteController();
        //remove todos valores dentro do combo box pra evitar repetição
        jcbCliente.removeAllItems();
        //adiciona cada elemento da lista dentro do combo box
        for (int i = 0; i < listaModelClientes.size(); i++) {
            //passa o nome de cada elemento da lista para o combo box
            jcbCliente.addItem(listaModelClientes.get(i).getCliNome());
        }
    }

    //Metodo para passar o nome do cliente ao inserir o código no campo Codigo
    private void setComboBoxCliente() {
        try {
            //pega o cliente e passa para o modelCliente
            modelCliente = controllerCliente.retornarClienteController(Integer.parseInt(jtfCodigo.getText()));
            //pega o nome do cliente e adiciona no combo box ao tirar o foco do campo COd. Cliente
            jcbCliente.setSelectedItem(modelCliente.getCliNome());
        } catch (Exception e) {
        }
    }

    //Metodo para carregar as vendas do cliente na tabela
    private void carregarVendas() {
        this.valorTotal = 0;
        int codigo = Integer.parseInt(jtfCodigo.getText());
        DefaultTableModel modelo = (DefaultTableModel) jtDividas.getModel();
        modelo.setNumRows(0);
        listaModelVendasCliente = controllerVendasCliente.getListaVendasClienteController(codigo);
        int cont = listaModelVendasCliente.size();

        for (int i = 0; i < cont; i++) {
            if (listaModelVendasCliente.get(i).getModelVendas().getVenValorLiquido() >= listaModelVendasCliente.
                    get(i).getModelVendas().getVenValorRecebido()) {
                modelo.addRow(new Object[]{
                    listaModelVendasCliente.get(i).getModelVendas().getVenId(),
                    listaModelVendasCliente.get(i).getModelVendas().getVenDataVenda(),
                    listaModelVendasCliente.get(i).getModelVendas().getVenValorLiquido(),
                    listaModelVendasCliente.get(i).getModelVendas().getVenValorRecebido(),
                    listaModelVendasCliente.get(i).getModelVendas().getVenValorLiquido()
                    - listaModelVendasCliente.get(i).getModelVendas().getVenValorRecebido()
                });

            }
            this.valorTotal += listaModelVendasCliente.get(i).getModelVendas().getVenValorLiquido()
                    - listaModelVendasCliente.get(i).getModelVendas().getVenValorRecebido();
        }
        this.somarValorTotal();
    }

    private void somarValorTotal() {
        this.jtfValorTotal.setText(this.valorTotal + "");
    }

    private void limparCamposRecebimento() {
        jtfCodigoCliente.setText("");
        jtfCodigoVenda.setText("");
        jtfCliente.setText("");
        jtfData.setText("");
        jtfValorVenda.setText("");
        jtfValorPago.setText("");
        jtfValorRestante.setText("");
        jtfValorReceber.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbCompletarValorRestante;
    private javax.swing.JButton jbEfetuarRecebimento;
    private javax.swing.JButton jbRealizarRecebimento;
    private javax.swing.JButton jbVoltar;
    private javax.swing.JButton jbVoltar1;
    private javax.swing.JComboBox<String> jcMetodoPagamento;
    private componentes.UJComboBox jcbCliente;
    private javax.swing.JTable jtDividas;
    private javax.swing.JTextField jtfCliente;
    private javax.swing.JTextField jtfCodigo;
    private javax.swing.JTextField jtfCodigoCliente;
    private javax.swing.JTextField jtfCodigoVenda;
    private javax.swing.JTextField jtfData;
    private javax.swing.JTextField jtfValorPago;
    private javax.swing.JTextField jtfValorReceber;
    private javax.swing.JTextField jtfValorRestante;
    private javax.swing.JTextField jtfValorTotal;
    private javax.swing.JTextField jtfValorVenda;
    // End of variables declaration//GEN-END:variables
}
