/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lojatelefonia.services.produto;

import java.util.List;
import loja.telefonia.exceptions.ClienteException;
import loja.telefonia.exceptions.DataSourceException;
import loja.telefonia.exceptions.ProdutoException;
import lojatelefonia.db.dao.ProdutoDAO;
import lojatelefonia.model.produtos.Produto;

/**
 *
 * @author Matheus
 */
public class ServicoProduto {

    //Insere um produto na fonte de dados
    public static void cadastrarProduto(Produto produto)
            throws DataSourceException, ProdutoException {
        //Realização de validações de negócio
        if (produto == null) {
            throw new ProdutoException("Não foi informado um produto");
        }
        if (produto.getNome() == null || "".equals(produto.getNome())) {
            throw new ProdutoException("É necessário informar"
                    + "um nome de produto");
        }
        if (produto.getSerie() <= 0) {
            throw new ProdutoException("O número de serie precisa ser "
                    + "um valor positivo e maior que zero.");
        }
        if (produto.getQtd() <= 0) {
            throw new ProdutoException("É necessário informar uma"
                    + "quantidade de estoque maior que 0");
        }
        if (produto.getValor() <= 0) {
            throw new ProdutoException("É necessário informar um"
                    + "valor maior que 0");
        }
        try {
            //Realiza a chamada de inserção na fonte de dados
            ProdutoDAO.inserir(produto);
        } catch (Exception e) {
            //Imprime qualquer erro técnico no console e devolve
            //uma exceção e uma mensagem amigável a camada de visão
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }

    //Atualiza um produto na fonte de dados
    public static void atualizarProduto(Produto produto)
            throws DataSourceException, ProdutoException {
        //Realização de validações de negócio
        if (produto == null) {
            throw new ProdutoException("Não foi informado um produto");
        }
        if (produto.getNome() == null || "".equals(produto.getNome())) {
            throw new ProdutoException("É necessário informar"
                    + "um nome de produto");
        }
        if (produto.getSerie() <= 0) {
            throw new ProdutoException("O número de serie precisa ser "
                    + "um valor positivo e maior que zero.");
        }
        if (produto.getQtd() <= 0) {
            throw new ProdutoException("É necessário informar uma"
                    + "quantidade de estoque maior que 0");
        }
        if (produto.getValor() <= 0) {
            throw new ProdutoException("É necessário informar um"
                    + "valor maior que 0");
        }
        try {
            //Realiza a chamada de atualização na fonte de dados
            ProdutoDAO.atualizar(produto);
            return;
        } catch (Exception e) {
            //Imprime qualquer erro técnico no console e devolve
            //uma exceção e uma mensagem amigável a camada de visão
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }

    //Realiza a pesquisa de um produto por nome na fonte de dados
    public static List<Produto> procurarProduto(String nome)
            throws ProdutoException, DataSourceException {
        try {
            //Verifica se um parâmetro de pesquisa não foi informado.
            //Caso afirmativo, realiza uma listagem simples do banco.
            //Caso contrário, realiza uma pesquisa com o parâmetro
            if (nome == null || "".equals(nome)) {
                return ProdutoDAO.listar();
            } else {
                return ProdutoDAO.procurar(nome);
            }
        } catch (Exception e) {
            //Imprime qualquer erro técnico no console e devolve
            //uma exceção e uma mensagem amigável a camada de visão
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }

    //Obtem o cliente com ID informado do banco de dados
    public static Produto obterProduto(Integer serie)
            throws ClienteException, DataSourceException {
        try {
            //Retorna o produto obtido com o DAO
            return ProdutoDAO.obter(serie);
        } catch (Exception e) {
            //Imprime qualquer erro técnico no console e devolve
            //uma exceção e uma mensagem amigável a camada de visão
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }

    //Exclui o cliente com ID informado do banco de dados
    public static void excluirProduto(Integer serie)
            throws ProdutoException, DataSourceException {
        try {
            //Solicita ao DAO a exclusão do cliente informado
            ProdutoDAO.excluir(serie);
        } catch (Exception e) {
            //Imprime qualquer erro técnico no console e devolve
            //uma exceção e uma mensagem amigável a camada de visão
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }
}
