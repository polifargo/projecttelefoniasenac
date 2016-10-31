/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lojatelefonia.ui.produtos;

import java.awt.Dimension;
import java.util.List;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import loja.telefonia.exceptions.ProdutoException;
import lojatelefonia.model.produtos.Produto;
import lojatelefonia.services.produto.ServicoProduto;

/**
 *
 * @author Matheus
 */
public class FormConsultarProduto extends javax.swing.JInternalFrame {

    //Instância do form de edição de clientes
    FormEditarProduto formEditarProduto = new FormEditarProduto();
    //Armazena a última pesquisa realizada
    String ultimaPesquisa = null;

    /**
     * Creates new form JInternalFrame
     */
    public FormConsultarProduto() {
        initComponents();
    }

    public void openFrameInCenter(JInternalFrame jif) {
        Dimension desktopSize = this.getParent().getSize();
        Dimension jInternalFrameSize = jif.getSize();
        int width = (desktopSize.width - jInternalFrameSize.width) / 2;
        int height = (desktopSize.height - jInternalFrameSize.height) / 2;
        jif.setLocation(width, height);
        jif.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonSearch = new javax.swing.JButton();
        jTextFieldSearch = new javax.swing.JTextField();
        jButtonCancel = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jButtonDeletar = new javax.swing.JButton();
        jScrollPaneProduct = new javax.swing.JScrollPane();
        jTableProduct = new javax.swing.JTable();

        jButtonSearch.setText("Pesquisar");
        jButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchActionPerformed(evt);
            }
        });

        jButtonCancel.setText("Cancelar");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        jButtonUpdate.setText("Atualizar");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });

        jButtonDeletar.setText("Excluir");
        jButtonDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeletarActionPerformed(evt);
            }
        });

        jTableProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Serie", "Descricao", "Cor", "Marca", "Qtd", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTableProduct.setMaximumSize(new java.awt.Dimension(214213214, 0));
        jTableProduct.setMinimumSize(new java.awt.Dimension(75, 0));
        jTableProduct.setPreferredSize(new java.awt.Dimension(375, 0));
        jTableProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableProductMouseClicked(evt);
            }
        });
        jScrollPaneProduct.setViewportView(jTableProduct);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCancel)
                        .addGap(2, 2, 2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonDeletar)
                    .addComponent(jButtonUpdate)
                    .addComponent(jButtonCancel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        //Inicializa o sucesso da pesquisa com valor negativo, indicando que
        //a pesquisa de clientes não obteve resultados (situação padrão)
        boolean resultSearch = false;
        //Grava o campo de pesquisa como a última pesquisa válida. O valor
        //de última pesquisa válida é utilizado na atualização da lista
        ultimaPesquisa = jTextFieldSearch.getText();

        try {
            //Solicita a atualização da lista com o novo critério
            //de pesquisa (ultimaPesquisa)
            resultSearch = refreshList();
        } catch (Exception e) {
            //Exibe mensagens de erro na fonte de dados e para o listener
            JOptionPane.showMessageDialog(rootPane, e.getMessage(),
                    "Falha ao obter lista", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //Exibe mensagem de erro caso a pesquisa não tenha resultados
        if (!resultSearch) {
            JOptionPane.showMessageDialog(rootPane, "A pesquisa não retornou resultados ",
                    "Sem resultados", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonSearchActionPerformed

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        int option = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja atualizar?");
        if (option == JOptionPane.YES_OPTION) {
            try {
                //Obtém a linha selecionada na tabela de resultados
                final int row = jTableProduct.getSelectedRow();
                //Verifica se há linha selecionada na tabela
                if (row >= 0) {
                    //Obtém a linha selecionada na tabela
                    Integer serie = (Integer) jTableProduct.getValueAt(row, 0);

                    //Solicita ao serviço a obtenção do cliente a partir do
                    //ID selecionado na tabela
                    Produto produto = ServicoProduto.obterProduto(serie);

                    //Cria uma nova instância da tela de edição,
                    //configura o cliente selecionado como elemento a
                    //ser editado e mostra a tela de edição.
                    //Para exibir a tela, é necessário adicioná-la ao
                    //componente de desktop, o "pai" da janela corrente
                    formEditarProduto.dispose();
                    formEditarProduto = new FormEditarProduto();
                    formEditarProduto.setProduto(produto);
                    formEditarProduto.setTitle(produto.getNome() + " " + produto.getSerie());
                    this.getParent().add(formEditarProduto);
                    this.openFrameInCenter(formEditarProduto);
                    formEditarProduto.toFront();
                }
            } catch (Exception e) {
                //Se ocorrer algum erro técnico, mostra-o no console,
                //mas esconde-o do usuário
                e.printStackTrace();
                //Exibe uma mensagem de erro genérica ao usuário
                JOptionPane.showMessageDialog(rootPane, "Não é possível "
                        + "exibir os detalhes deste cliente.",
                        "Erro ao abrir detalhe", JOptionPane.ERROR_MESSAGE);
            }
        } else if (option == JOptionPane.NO_OPTION) {
            this.dispose();
        }
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jButtonDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeletarActionPerformed
        // TODO add your handling code here:
        //Verifica se há itens selecionados para exclusão.
        //Caso negativo, ignora o comando
        if (jTableProduct.getSelectedRow() >= 0) {

            //Obtém a linha do item selecionado
            final int row = jTableProduct.getSelectedRow();
            //Obtém o nome do cliente da linha indicada para exibição
            //de mensagem de confirmação de exclusão utilizando seu nome
            String nome = (String) jTableProduct.getValueAt(row, 1);
            //Mostra o diálogo de confirmação de exclusão
            int resposta = JOptionPane.showConfirmDialog(rootPane,
                    "Excluir o produto \"" + nome + "\"?",
                    "Confirmar exclusão", JOptionPane.YES_NO_OPTION);
            //Se o valor de resposta for "Sim" para a exclusão
            if (resposta == JOptionPane.YES_OPTION) {
                try {
                    //Obtém o ID do cliente
                    Integer serie = (Integer) jTableProduct.getValueAt(row, 0);
                    //Solicita ao serviço a inativação do cliente com o ID
                    ServicoProduto.excluirProduto(serie);
                    //Atualiza a lista após a "exclusão"
                    this.refreshList();
                } catch (Exception e) {
                    //Se ocorrer algum erro técnico, mostra-o no console,
                    //mas esconde-o do usuário
                    e.printStackTrace();
                    //Exibe uma mensagem de erro genérica ao usuário
                    JOptionPane.showMessageDialog(rootPane, e.getMessage(),
                            "Falha na Exclusão", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_jButtonDeletarActionPerformed

    private void jTableProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableProductMouseClicked
        // TODO add your handling code here:
        // TODO add your handling code here:
        //Verifica se o clique é um clique duplo
        if (evt.getClickCount() == 2) {
            try {
                //Obtém a linha selecionada da tabela de resultados
                final int row = jTableProduct.getSelectedRow();
                //Obtém o valor do ID da coluna "ID" da tabela de resultados
                Integer serie = (Integer) jTableProduct.getValueAt(row, 0);

                //Com o ID da coluna, chama o serviço de cliente para
                //obter o cliente com dados atualizados do banco de dados
                Produto produto = ServicoProduto.obterProduto(serie);

                //Cria uma nova instância da tela de edição,
                //configura o cliente selecionado como elemento a
                //ser editado e mostra a tela de edição.
                //Para exibir a tela, é necessário adicioná-la ao
                //componente de desktop, o "pai" da janela corrente
                formEditarProduto.dispose();
                formEditarProduto = new FormEditarProduto();
                formEditarProduto.setProduto(produto);
                formEditarProduto.setTitle(produto.getNome() + " " + produto.getSerie());
                this.getParent().add(formEditarProduto);
                this.openFrameInCenter(formEditarProduto);
                formEditarProduto.toFront();
            } catch (Exception e) {
                //Se ocorrer algum erro técnico, mostra-o no console,
                //mas esconde-o do usuário
                e.printStackTrace();
                //Exibe uma mensagem de erro genérica ao usuário
                JOptionPane.showMessageDialog(rootPane, "Não é possível "
                        + "exibir os detalhes deste cliente.",
                        "Erro ao abrir detalhe", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jTableProductMouseClicked

    public boolean refreshList() throws ProdutoException, Exception {
        //Realiza a pesquisa de clientes com o último valor de pesquisa
        //para atualizar a lista

        List<Produto> resultado = ServicoProduto.
                procurarProduto(ultimaPesquisa);

        //Obtém o elemento representante do conteúdo da tabela na tela
        DefaultTableModel model = (DefaultTableModel) jTableProduct.getModel();
        //Indica que a tabela deve excluir todos seus elementos
        //Isto limpará a lista, mesmo que a pesquisa não tenha sucesso
        model.setRowCount(0);

        //Verifica se não existiram resultados. Caso afirmativo, encerra a
        //atualização e indica ao elemento acionador o não sucesso da pesquisa
        if (resultado == null || resultado.size() <= 0) {
            return false;
        }
        //Percorre a lista de resultados e os adiciona na tabela
        for (int i = 0; i < resultado.size(); i++) {
            Produto prod = resultado.get(i);
            if (prod != null) {
                Object[] row = new Object[5];
                row[0] = prod.getNome();
                row[1] = prod.getSerie();
                row[2] = prod.getDesc();
                row[3] = prod.getCor();
                row[4] = prod.getMarca();
                row[5] = prod.getQtd();
                row[6] = prod.getValor();
                model.addRow(row);
            }
        }

        //Se chegamos até aqui, a pesquisa teve sucesso, então
        //retornamos "true" para o elemento acionante, indicando
        //que não devem ser exibidas mensagens de erro
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonDeletar;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JScrollPane jScrollPaneProduct;
    private javax.swing.JTable jTableProduct;
    private javax.swing.JTextField jTextFieldSearch;
    // End of variables declaration//GEN-END:variables
}
