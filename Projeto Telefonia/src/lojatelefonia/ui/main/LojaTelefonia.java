/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lojatelefonia.ui.main;

import lojatelefonia.ui.clientes.FormCadastrarCliente;
import lojatelefonia.ui.clientes.FormConsultarCliente;
import lojatelefonia.ui.produtos.FormCadastrarProduto;
import lojatelefonia.ui.produtos.FormConsultarProduto;
import lojatelefonia.ui.venda.FormRealizarVenda;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JInternalFrame;

/**
 *
 * @author matheus.esanto1
 */
public class LojaTelefonia extends javax.swing.JFrame {

    FormCadastrarCliente cadastrarCliente = null;
    FormConsultarCliente consultarCliente = null;
    FormCadastrarProduto cadastrarProduto = null;
    FormConsultarProduto consultarProduto = null;
    FormRealizarVenda realizarVenda = null;

    /**
     * Creates new form LojaTelefonia
     */
    public LojaTelefonia() {
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

        desktop = new javax.swing.JDesktopPane(){
            private Image image;
            {
                try {
                    image = ImageIO.read(new File("src/image/telefonia.jpg"));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }
        }
        ;
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuProdutos = new javax.swing.JMenu();
        jMenuItemCadastrarProduto = new javax.swing.JMenuItem();
        jMenuItemConsultarProduto = new javax.swing.JMenuItem();
        jMenuClientes = new javax.swing.JMenu();
        jMenuItemCadastrarCliente = new javax.swing.JMenuItem();
        jMenuItemConsultarCliente = new javax.swing.JMenuItem();
        jMenuVenda = new javax.swing.JMenu();
        jMenuItemRealizarVenda = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Loja Telefonia");

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 733, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 506, Short.MAX_VALUE)
        );

        jMenuProdutos.setText("Produtos");

        jMenuItemCadastrarProduto.setText("Cadastrar Produto");
        jMenuItemCadastrarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastrarProdutoActionPerformed(evt);
            }
        });
        jMenuProdutos.add(jMenuItemCadastrarProduto);

        jMenuItemConsultarProduto.setText("Consultar Produto");
        jMenuItemConsultarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemConsultarProdutoActionPerformed(evt);
            }
        });
        jMenuProdutos.add(jMenuItemConsultarProduto);

        jMenuBar1.add(jMenuProdutos);

        jMenuClientes.setText("Clientes");

        jMenuItemCadastrarCliente.setText("Cadastrar Cliente");
        jMenuItemCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCadastrarClienteActionPerformed(evt);
            }
        });
        jMenuClientes.add(jMenuItemCadastrarCliente);

        jMenuItemConsultarCliente.setText("Consultar Cliente");
        jMenuItemConsultarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemConsultarClienteActionPerformed(evt);
            }
        });
        jMenuClientes.add(jMenuItemConsultarCliente);

        jMenuBar1.add(jMenuClientes);

        jMenuVenda.setText("Venda");

        jMenuItemRealizarVenda.setText("Realizar Venda");
        jMenuItemRealizarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRealizarVendaActionPerformed(evt);
            }
        });
        jMenuVenda.add(jMenuItemRealizarVenda);

        jMenuBar1.add(jMenuVenda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktop)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemCadastrarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastrarProdutoActionPerformed
        // TODO add your handling code here:
        if (cadastrarProduto == null || !cadastrarProduto.isDisplayable()) {
            cadastrarProduto = new FormCadastrarProduto();
            desktop.add(cadastrarProduto);
            this.openFrameInCenter(cadastrarProduto);
        }
        cadastrarProduto.toFront();
    }//GEN-LAST:event_jMenuItemCadastrarProdutoActionPerformed

    private void jMenuItemCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCadastrarClienteActionPerformed
        // TODO add your handling code here:
        if (cadastrarCliente == null || !cadastrarCliente.isDisplayable()) {
            cadastrarCliente = new FormCadastrarCliente();
            desktop.add(cadastrarCliente);
            this.openFrameInCenter(cadastrarCliente);
        }
        cadastrarCliente.toFront();
    }//GEN-LAST:event_jMenuItemCadastrarClienteActionPerformed

    private void jMenuItemConsultarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemConsultarClienteActionPerformed
        // TODO add your handling code here:
        if (consultarCliente == null || !consultarCliente.isDisplayable()) {
            consultarCliente = new FormConsultarCliente();
            desktop.add(consultarCliente);
            this.openFrameInCenter(consultarCliente);
        }
        consultarCliente.toFront();
    }//GEN-LAST:event_jMenuItemConsultarClienteActionPerformed

    private void jMenuItemConsultarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemConsultarProdutoActionPerformed
        // TODO add your handling code here:
        if (consultarProduto == null || !consultarProduto.isDisplayable()) {
            consultarProduto = new FormConsultarProduto();
            desktop.add(consultarProduto);
            this.openFrameInCenter(consultarProduto);
        }
        consultarProduto.toFront();
    }//GEN-LAST:event_jMenuItemConsultarProdutoActionPerformed

    private void jMenuItemRealizarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRealizarVendaActionPerformed
        // TODO add your handling code here:
        if (realizarVenda == null || !realizarVenda.isDisplayable()) {
            realizarVenda = new FormRealizarVenda();
            desktop.add(realizarVenda);
            this.openFrameInCenter(realizarVenda);
        }
        realizarVenda.toFront();
    }//GEN-LAST:event_jMenuItemRealizarVendaActionPerformed

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
            java.util.logging.Logger.getLogger(LojaTelefonia.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LojaTelefonia.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LojaTelefonia.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LojaTelefonia.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LojaTelefonia().setVisible(true);
            }
        });
    }

    public void openFrameInCenter(JInternalFrame jif) {
        Dimension desktopSize = desktop.getSize();
        Dimension jInternalFrameSize = jif.getSize();
        int width = (desktopSize.width - jInternalFrameSize.width) / 2;
        int height = (desktopSize.height - jInternalFrameSize.height) / 2;
        jif.setLocation(width, height);
        jif.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuClientes;
    private javax.swing.JMenuItem jMenuItemCadastrarCliente;
    private javax.swing.JMenuItem jMenuItemCadastrarProduto;
    private javax.swing.JMenuItem jMenuItemConsultarCliente;
    private javax.swing.JMenuItem jMenuItemConsultarProduto;
    private javax.swing.JMenuItem jMenuItemRealizarVenda;
    private javax.swing.JMenu jMenuProdutos;
    private javax.swing.JMenu jMenuVenda;
    // End of variables declaration//GEN-END:variables

}