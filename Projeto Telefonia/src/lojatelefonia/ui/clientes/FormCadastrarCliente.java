/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lojatelefonia.ui.clientes;

import lojatelefonia.model.clientes.Cliente;
import lojatelefonia.db.dao.ClienteDAO;
import javax.swing.JOptionPane;
import loja.telefonia.services.cliente.ServicoCliente;

/**
 *
 * @author matheus.esanto1
 */
public class FormCadastrarCliente extends javax.swing.JInternalFrame {

    /**
     * Creates new form JInternalFrame
     */
    public FormCadastrarCliente() {
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

        jButtonSave = new javax.swing.JButton();
        jButtonCancel = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabelEC = new javax.swing.JLabel();
        jLabelAddress = new javax.swing.JLabel();
        jTextFieldAddress = new javax.swing.JTextField();
        jComboBoxEC = new javax.swing.JComboBox();
        jLabelName = new javax.swing.JLabel();
        jComboBoxGender = new javax.swing.JComboBox();
        jLabelGender = new javax.swing.JLabel();
        jLabelCPF = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jLabelBirthday = new javax.swing.JLabel();
        jFormattedTextFieldBirthdate = new javax.swing.JFormattedTextField();
        jFormattedTextFieldCPF = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Cadastrar Cliente");

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

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelEC.setText("Estado Civil");

        jLabelAddress.setText("Endereço");

        jComboBoxEC.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Solteiro(a)", "Casado(a)", "Viúvo(a)", "Divorciado(a)", "Separado(a)" }));
        jComboBoxEC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxECActionPerformed(evt);
            }
        });

        jLabelName.setText("Nome");

        jComboBoxGender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Masculino", "Feminino" }));
        jComboBoxGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxGenderActionPerformed(evt);
            }
        });

        jLabelGender.setText("Gênero");

        jLabelCPF.setText("CPF");

        jTextFieldName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNameActionPerformed(evt);
            }
        });

        jLabelBirthday.setText("Data de Nascimento");

        jFormattedTextFieldBirthdate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.SHORT))));

        jFormattedTextFieldCPF.setColumns(11);
        jFormattedTextFieldCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jFormattedTextFieldCPF.setMaximumSize(new java.awt.Dimension(11, 11));
        jFormattedTextFieldCPF.setMinimumSize(new java.awt.Dimension(11, 11));
        jFormattedTextFieldCPF.setName(""); // NOI18N
        jFormattedTextFieldCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldCPFActionPerformed(evt);
            }
        });
        jFormattedTextFieldCPF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jFormattedTextFieldCPFKeyTyped(evt);
            }
        });

        jLabel1.setText("ID");

        jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabelName))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabelCPF)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jFormattedTextFieldCPF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelBirthday)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jFormattedTextFieldBirthdate, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelEC)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelAddress)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextFieldAddress))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(48, 48, 48)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jComboBoxEC, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(61, 61, 61)
                                        .addComponent(jLabelGender)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBoxGender, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jComboBoxEC, jComboBoxGender, jFormattedTextFieldBirthdate});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jTextFieldAddress, jTextFieldName});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelName)
                    .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCPF)
                    .addComponent(jFormattedTextFieldCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelBirthday)
                    .addComponent(jFormattedTextFieldBirthdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAddress)
                    .addComponent(jTextFieldAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelGender)
                    .addComponent(jLabelEC)
                    .addComponent(jComboBoxGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxEC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(313, 313, 313)
                        .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
        int option = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja salvar?");
        if (option == JOptionPane.YES_OPTION) {
            //Cria uma instância do cliente e obtém
            //seus valores dos campos da tela
            Cliente cli = new Cliente();
            cli.setNome(jTextFieldName.getText());
            cli.setCpf(jFormattedTextFieldCPF.getText());
            cli.setEndereco(jTextFieldAddress.getText());
            cli.setEstadoCivil((String) jComboBoxEC.getSelectedItem());
            cli.setGenero((String) jComboBoxGender.getSelectedItem());
            cli.setNascimento(jFormattedTextFieldBirthdate.getText());
            try {
                //Chama o serviço para cadastro do cliente
                ServicoCliente.cadastrarCliente(cli);
            } catch (Exception e) {
                //Exibe mensagens de erro para o usuário
                JOptionPane.showMessageDialog(rootPane, e.getMessage(),
                        "Erro", JOptionPane.ERROR_MESSAGE);
                return;
            }

            //Caso tenha chegado até aqui, o cliente foi inserido com sucesso
            //Então exibe uma mensagem de sucesso para o usuário
            JOptionPane.showMessageDialog(rootPane, "Cliente inserido com sucesso",
                    "Cadastro efetuado", JOptionPane.INFORMATION_MESSAGE);

            //Limpa os campos da tela após realizar a inserção
            jTextFieldName.setText("");
            jTextFieldAddress.setText("");
            jFormattedTextFieldBirthdate.setText("");
        } else if (option == JOptionPane.NO_OPTION) {
            this.dispose();
        }
    }//GEN-LAST:event_jButtonSaveActionPerformed

    private void jTextFieldNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNameActionPerformed

    }//GEN-LAST:event_jTextFieldNameActionPerformed

    private void jComboBoxGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxGenderActionPerformed

    private void jComboBoxECActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxECActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxECActionPerformed

    private void jFormattedTextFieldCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldCPFActionPerformed

    private void jFormattedTextFieldCPFKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jFormattedTextFieldCPFKeyTyped
        // TODO add your handling code here:
        if (jFormattedTextFieldCPF.getText().length() >= 11) {
            evt.consume();
        }
    }//GEN-LAST:event_jFormattedTextFieldCPFKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JComboBox jComboBoxEC;
    private javax.swing.JComboBox jComboBoxGender;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JFormattedTextField jFormattedTextFieldBirthdate;
    private javax.swing.JFormattedTextField jFormattedTextFieldCPF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelAddress;
    private javax.swing.JLabel jLabelBirthday;
    private javax.swing.JLabel jLabelCPF;
    private javax.swing.JLabel jLabelEC;
    private javax.swing.JLabel jLabelGender;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldAddress;
    private javax.swing.JTextField jTextFieldName;
    // End of variables declaration//GEN-END:variables
}
