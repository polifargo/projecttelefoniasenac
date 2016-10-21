/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lojatelefonia.ui.produtos;

import javax.swing.JOptionPane;

/**nn
 * dsdsaasdsadasasd
 * @author matheus.esanto1
 */
public class FormCadastrarProduto extends javax.swing.JInternalFrame {

    /**
     * Creates new form JInternalFrame
     */
    public FormCadastrarProduto() {
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

        jLabelProductName = new javax.swing.JLabel();
        jLabelProductDesc = new javax.swing.JLabel();
        jLabelProductQty = new javax.swing.JLabel();
        jComboBoxProductDesc = new javax.swing.JComboBox();
        jTextFieldProductQty = new javax.swing.JTextField();
        jTextFieldProductName = new javax.swing.JTextField();
        jLabelProductColor = new javax.swing.JLabel();
        jComboBoxProductColor = new javax.swing.JComboBox();
        jLabelProductCode = new javax.swing.JLabel();
        jTextFieldProductCode = new javax.swing.JTextField();
        jButtonSave = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jLabelPattern = new javax.swing.JLabel();
        jComboBoxChoosePattern = new javax.swing.JComboBox();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Cadastrar Produto");

        jLabelProductName.setText("Nome");

        jLabelProductDesc.setText("Descrição");

        jLabelProductQty.setText("Quantidade");

        jComboBoxProductDesc.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Celulares", "Cases", "Fones de Ouvido" }));

        jLabelProductColor.setText("Cor");

        jComboBoxProductColor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Vermelho", "Azul", "Verde", "Amarelo", "Preto", "Branco" }));

        jLabelProductCode.setText("N° Série");

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

        jLabelPattern.setText("Marca");

        jComboBoxChoosePattern.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Outras...", "Samsung", "Apple", "LG", "Nokia", "Lenovo", "Motorola", "ASUS" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonCancel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonSave))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelProductName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldProductName))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabelPattern)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBoxChoosePattern, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabelProductQty)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldProductQty))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabelProductDesc)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBoxProductDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelProductColor)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBoxProductColor, 0, 143, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelProductCode)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldProductCode)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelProductName)
                    .addComponent(jTextFieldProductName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelProductDesc)
                    .addComponent(jComboBoxProductDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelProductColor)
                    .addComponent(jComboBoxProductColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelProductQty)
                    .addComponent(jTextFieldProductQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelProductCode)
                    .addComponent(jTextFieldProductCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelPattern)
                    .addComponent(jComboBoxChoosePattern, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSave)
                    .addComponent(jButtonCancel))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
        // TODO add your handling code here:
           if (jTextFieldProductQty.getText().equalsIgnoreCase("")
                || jTextFieldProductName.getText().equalsIgnoreCase("")
                || jTextFieldProductCode.getText().equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(null, "Campos obrigatórios não preenchidos", "Failure", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                String erro = jLabelProductCode.getText();
                String erro2 = jLabelProductQty.getText();
                if(!erro.equals("1234567890") || erro2.equals("123456789"));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Digite apenas numeros!");
                return;
            }
            int option = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja salvar?");
            if (option == JOptionPane.YES_OPTION) {

                JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso.");
            } else if (option == JOptionPane.NO_OPTION) {
                this.dispose();
            } 
        }
    }//GEN-LAST:event_jButtonSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JComboBox jComboBoxChoosePattern;
    private javax.swing.JComboBox jComboBoxProductColor;
    private javax.swing.JComboBox jComboBoxProductDesc;
    private javax.swing.JLabel jLabelPattern;
    private javax.swing.JLabel jLabelProductCode;
    private javax.swing.JLabel jLabelProductColor;
    private javax.swing.JLabel jLabelProductDesc;
    private javax.swing.JLabel jLabelProductName;
    private javax.swing.JLabel jLabelProductQty;
    private javax.swing.JTextField jTextFieldProductCode;
    private javax.swing.JTextField jTextFieldProductName;
    private javax.swing.JTextField jTextFieldProductQty;
    // End of variables declaration//GEN-END:variables
}
