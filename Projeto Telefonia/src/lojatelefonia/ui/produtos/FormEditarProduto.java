/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lojatelefonia.ui.produtos;

import javax.swing.JOptionPane;
import loja.telefonia.services.cliente.ServicoCliente;
import lojatelefonia.db.dao.ProdutoDAO;
import lojatelefonia.model.produtos.Produto;
import lojatelefonia.services.produto.ServicoProduto;
import lojatelefonia.ui.main.LojaTelefonia;

/**
 *
 * @author Matheus
 */
public class FormEditarProduto extends javax.swing.JInternalFrame {

    Produto produto = new Produto();

    /**
     * Creates new form FormEditarCliente
     */
    public FormEditarProduto() {
        initComponents();
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonSave = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jPanelProduct = new javax.swing.JPanel();
        jLabelProductName = new javax.swing.JLabel();
        jTextFieldProductName = new javax.swing.JTextField();
        jLabelProductDesc = new javax.swing.JLabel();
        jComboBoxProductDesc = new javax.swing.JComboBox();
        jComboBoxProductColor = new javax.swing.JComboBox();
        jLabelProductColor = new javax.swing.JLabel();
        jLabelProductQty = new javax.swing.JLabel();
        jComboBoxChoosePattern = new javax.swing.JComboBox();
        jLabelPattern = new javax.swing.JLabel();
        jLabelProductCode = new javax.swing.JLabel();
        jFormattedTextFieldQtd = new javax.swing.JFormattedTextField();
        jFormattedTextFieldSerie = new javax.swing.JFormattedTextField();
        jLabelProductCode1 = new javax.swing.JLabel();
        jFormattedTextFieldProductPrice = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();

        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jButtonSave.setText("Salvar");
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });

        jButtonCancel.setText("Cancelar");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        jPanelProduct.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelProductName.setText("Nome");

        jLabelProductDesc.setText("Descrição");

        jComboBoxProductDesc.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Celulares", "Cases", "Fones de Ouvido" }));

        jComboBoxProductColor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Vermelho", "Azul", "Verde", "Amarelo", "Preto", "Branco" }));

        jLabelProductColor.setText("Cor");

        jLabelProductQty.setText("Quantidade");

        jComboBoxChoosePattern.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Outras...", "Samsung", "Apple", "LG", "Nokia", "Lenovo", "Motorola", "ASUS" }));

        jLabelPattern.setText("Marca");

        jLabelProductCode.setText("N° Série");

        jFormattedTextFieldQtd.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jFormattedTextFieldQtd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldQtdActionPerformed(evt);
            }
        });

        jFormattedTextFieldSerie.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jFormattedTextFieldSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldSerieActionPerformed(evt);
            }
        });
        jFormattedTextFieldSerie.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jFormattedTextFieldSerieKeyTyped(evt);
            }
        });

        jLabelProductCode1.setText("Valor");

        jFormattedTextFieldProductPrice.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));

        jLabel1.setText("R$");

        javax.swing.GroupLayout jPanelProductLayout = new javax.swing.GroupLayout(jPanelProduct);
        jPanelProduct.setLayout(jPanelProductLayout);
        jPanelProductLayout.setHorizontalGroup(
            jPanelProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProductLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanelProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelPattern)
                    .addComponent(jLabelProductQty)
                    .addComponent(jLabelProductDesc)
                    .addComponent(jLabelProductName))
                .addGap(18, 18, 18)
                .addGroup(jPanelProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldProductName)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelProductLayout.createSequentialGroup()
                        .addGroup(jPanelProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelProductLayout.createSequentialGroup()
                                .addGroup(jPanelProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelProductLayout.createSequentialGroup()
                                        .addComponent(jFormattedTextFieldQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabelProductCode))
                                    .addGroup(jPanelProductLayout.createSequentialGroup()
                                        .addComponent(jComboBoxProductDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabelProductColor)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(jPanelProductLayout.createSequentialGroup()
                                .addComponent(jComboBoxChoosePattern, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelProductCode1)
                                .addGap(25, 25, 25)))
                        .addGroup(jPanelProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelProductLayout.createSequentialGroup()
                                .addComponent(jFormattedTextFieldProductPrice)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1))
                            .addComponent(jFormattedTextFieldSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxProductColor, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanelProductLayout.setVerticalGroup(
            jPanelProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProductLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelProductName)
                    .addComponent(jTextFieldProductName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelProductDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxProductDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxProductColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelProductColor))
                .addGap(18, 18, 18)
                .addGroup(jPanelProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelProductQty)
                    .addComponent(jLabelProductCode)
                    .addComponent(jFormattedTextFieldQtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextFieldSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPattern)
                    .addComponent(jComboBoxChoosePattern, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelProductCode1)
                    .addComponent(jFormattedTextFieldProductPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(60, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSave, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanelProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancel)
                    .addComponent(jButtonSave))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        // TODO add your handling code here:
        int option = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja salvar?");
        if (option == JOptionPane.YES_OPTION) {
            //Configura os novos valores dos campos de edição da tela
            //para o objeto de cliente, a fim de passá-lo para o serviço
            //e realizar as atualizações no banco de dados
            produto.setNome(jTextFieldProductName.getText());
            produto.setSerie(Integer.parseInt(jFormattedTextFieldSerie.getText()));
            produto.setDesc((String) jComboBoxProductDesc.getSelectedItem());
            produto.setCor((String) jComboBoxProductColor.getSelectedItem());
            produto.setMarca((String) jComboBoxChoosePattern.getSelectedItem());
            produto.setQtd(Integer.parseInt(jFormattedTextFieldQtd.getText()));
            produto.setValor(Double.parseDouble(jFormattedTextFieldProductPrice.getText()));
            try {
                //Chama o serviço para realizar as alterações necessárias
                ServicoProduto.atualizarProduto(produto);
            } catch (Exception e) {
                //Exibe alguma mensagem de erro que pode ter vindo do serviço
                JOptionPane.showMessageDialog(rootPane, e.getMessage(),
                        "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }

            //Atualiza a tela de consulta de clientes, caso possível. Para isso,
            //obtém o "top level ancestor" (ou seja, o componente pai mais acima
            //do formulário, no nosso caso, o desktop) para conseguir o frame
            //de consulta e daí solicitar a atualização da lista através da
            //chamada de seu método público de atualização
            try {
                if (this.getDesktopPane().getTopLevelAncestor() instanceof LojaTelefonia) {
                    LojaTelefonia principal = (LojaTelefonia) this.
                            getDesktopPane().getTopLevelAncestor();
                    if (principal != null) {
                        principal.getConsultarCliente().refreshList();
                    }
                }
            } catch (Exception e) {
                //Exibe erros de atualização da lista no
                //console, mas esconde-os do usuário
                e.printStackTrace();
            }
            JOptionPane.showMessageDialog(rootPane, "Produto atualizado com sucesso",
                    "Cadastro atualizado", JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
        } else if (option == JOptionPane.NO_OPTION) {
            this.dispose();
        }
    }//GEN-LAST:event_jButtonSaveActionPerformed

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jFormattedTextFieldQtdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldQtdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldQtdActionPerformed

    private void jFormattedTextFieldSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldSerieActionPerformed

    }//GEN-LAST:event_jFormattedTextFieldSerieActionPerformed

    private void jFormattedTextFieldSerieKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFormattedTextFieldSerieKeyTyped
        // TODO add your handling code here:
        if (jFormattedTextFieldSerie.getText().length() >= 4) {
            evt.consume();
        }
    }//GEN-LAST:event_jFormattedTextFieldSerieKeyTyped

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // TODO add your handling code here:
        jTextFieldProductName.setText(produto.getNome());
        jFormattedTextFieldSerie.setText(String.valueOf(produto.getSerie()));
        for (int i = 0; i < jComboBoxProductDesc.getItemCount(); i++) {
            if (jComboBoxProductDesc.getItemAt(i).equals(produto.getDesc())) {
                jComboBoxProductDesc.setSelectedIndex(i);
                break;
            }
        }
        for (int i = 0; i < jComboBoxProductColor.getItemCount(); i++) {
            if (jComboBoxProductColor.getItemAt(i).equals(produto.getCor())) {
                jComboBoxProductColor.setSelectedIndex(i);
                break;
            }
        }
        for (int i = 0; i < jComboBoxChoosePattern.getItemCount(); i++) {
            if (jComboBoxChoosePattern.getItemAt(i).equals(produto.getMarca())) {
                jComboBoxChoosePattern.setSelectedIndex(i);
                break;
            }
        }
        jFormattedTextFieldQtd.setText(String.valueOf(produto.getQtd()));
        jFormattedTextFieldProductPrice.setText(String.valueOf(produto.getValor()));
    }//GEN-LAST:event_formInternalFrameOpened


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JComboBox jComboBoxChoosePattern;
    private javax.swing.JComboBox jComboBoxProductColor;
    private javax.swing.JComboBox jComboBoxProductDesc;
    private javax.swing.JFormattedTextField jFormattedTextFieldProductPrice;
    private javax.swing.JFormattedTextField jFormattedTextFieldQtd;
    private javax.swing.JFormattedTextField jFormattedTextFieldSerie;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelPattern;
    private javax.swing.JLabel jLabelProductCode;
    private javax.swing.JLabel jLabelProductCode1;
    private javax.swing.JLabel jLabelProductColor;
    private javax.swing.JLabel jLabelProductDesc;
    private javax.swing.JLabel jLabelProductName;
    private javax.swing.JLabel jLabelProductQty;
    private javax.swing.JPanel jPanelProduct;
    private javax.swing.JTextField jTextFieldProductName;
    // End of variables declaration//GEN-END:variables
}