/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lojatelefonia.db.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import loja.telefonia.exceptions.ClienteException;
import lojatelefonia.db.utils.ConnectionUtils;
import lojatelefonia.model.produtos.Produto;

/**
 *
 * @author Matheus
 */
public class ProdutoDAO {

    //Insere um produto na tabela "produto" do banco de dados
    public static void inserir(Produto produto)
            throws SQLException, Exception {
        //Monta a string de inserção de um cliente no BD,
        //utilizando os dados do produtos passados como parâmetro
        String sql = "INSERT INTO produtos (nome, serie,"
                + "descricao, color,marca,qtd,valor, enabled) VALUES ("
                + "'" + produto.getNome() + "', "
                + "'" + produto.getSerie() + "', "
                + "'" + produto.getDesc() + "', "
                + "'" + produto.getCor() + "', "
                + "'" + produto.getMarca() + "', "
                + "'" + produto.getQtd() + "', "
                + produto.getValor() + ", "
                + "true"
                + ")";

        //Executa o comando SQL montado
        executarSQL(sql);
    }

    //Realiza a atualização dos dados de um cliente, com ID e dados
    //fornecidos como parâmetro através de um objeto da classe "Cliente"
    public static void atualizar(Produto produto)
            throws SQLException, Exception {
        //Monta a string de atualização do cliente no BD, utilizando
        //os dados e o ID do cliente passados como parâmetro
        String sql = "UPDATE produtos SET "
                + "nome='" + produto.getNome() + "', "
                + "descricao='" + produto.getDesc() + "', "
                + "color='" + produto.getCor() + "', "
                + "marca='" + produto.getMarca() + "', "
                + "qtd='" + produto.getQtd() + "', "
                + "valor=" + produto.getValor() + ", "
                + " WHERE (serie=" + produto.getSerie() + ")";

        //Executa o comando SQL montado
        executarSQL(sql);
    }

    //Realiza a exclusão lógica de um cliente no BD, com ID fornecido
    //como parâmetro. A exclusão lógica simplesmente "desliga" o
    //cliente, configurando um atributo específico, a ser ignorado
    //em todas as consultas de cliente ("enabled").
    public static void excluir(Integer serie) throws SQLException, Exception {
        //Monta a string de atualização do cliente no BD, utilizando
        //o ID do cliente passado como parâmetro para desativá-lo
        String sql = "UPDATE produtos SET "
                + "enabled=false"
                + " WHERE (serie=" + serie + ")";

        //Executa o comando SQL montado
        executarSQL(sql);
    }

    //Lista todos os clientes da tabela clientes
    public static List<Produto> listar()
            throws SQLException, Exception {
        //Monta a string de listagem de clientes no banco, considerando
        //apenas a coluna de ativação de clientes ("enabled")
        String sql = "SELECT * FROM produtos WHERE enabled=true";

        //Retorna o resultado da execução da consulta SQL montada
        return executarConsulta(sql);
    }

    //Procura um cliente no banco de dados, de acordo com o nome
    //ou com o sobrenome, passado como parâmetro
    public static List<Produto> procurar(String valor)
            throws SQLException, Exception {
        //Monta a string de consulta de clientes no banco, utilizando
        //o valor passado como parâmetro para busca nas colunas de
        //nome ou sobrenome (através do "LIKE" e ignorando minúsculas
        //ou maiúsculas, através do "UPPER" aplicado à coluna e ao
        //parâmetro). Além disso, também considera apenas os elementos
        //que possuem a coluna de ativação de clientes configurada com
        //o valor correto ("enabled" com "true")
        String sql = "SELECT * FROM produtos WHERE (UPPER(nome) LIKE UPPER('%"
                + valor + "%') OR UPPER(produtos.serie) "
                + "LIKE UPPER('%" + valor + "%') AND enabled=true)";

        //Retorna o resultado da execução da consulta SQL montada
        return executarConsulta(sql);
    }

    //Obtém uma instância da classe "Cliente" através de dados do
    //banco de dados, de acordo com o ID fornecido como parâmetro
    public static Produto obter(Integer serie)
            throws SQLException, Exception {
        //Compõe uma String de consulta que considera apenas o cliente
        //com o ID informado e que esteja ativo ("enabled" com "true")
        String sql = "SELECT * FROM produtos WHERE (serie=" + serie
                + " AND enabled=true)";

        //Armazena o valor da consulta numa lista temporária
        List<Produto> listaProdutos = executarConsulta(sql);

        //Verifica se a lista de resposta não é nula e contém resultados
        if (listaProdutos != null && listaProdutos.size() > 0) {
            //Como a consulta foi feita por ID, este é uma chave
            //primária (só pode haver um) e a verificação de tamanho
            //da lista foi maior que zero, deve significar que há
            //apenas um item de resultado. Retornaremos este primeiro
            //e único item, já que ele é o que se deseja obter.
            return listaProdutos.get(0);
        }

        //Se chegamos aqui, o "return" anterior não foi executado porque
        //a pesquisa não teve resultados e a lista estava nula ou vazia.
        //Neste caso, não há um elemento a retornar, então retornamos "null"
        return null;
    }

    //Executa um comando SQL não-consulta no banco de dados,
    //tratando da abertura, execução e fechamento de elementos
    //do JDBC necessários.
    private static void executarSQL(String sql) throws
            ClienteException, SQLException, Exception {
        //Conexão para abertura e fechamento
        Connection connection = null;
        //Statement para obtenção através da conexão, execução de
        //comandos SQL e fechamentos
        Statement statement = null;
        try {
            //Abre uma conexão com o banco de dados
            connection = ConnectionUtils.getConnection();
            //Cria um statement para execução de instruções SQL
            statement = connection.createStatement();
            //Exibe no console o que será executado no banco de dados
            System.out.println("Executando COMANDO SQL: " + sql);
            //Executa o comando no banco de dados
            statement.execute(sql);
        } finally {
            //Se o statement ainda estiver aberto, realiza seu fechamento
            if (statement != null && !statement.isClosed()) {
                statement.close();
            }
            //Se a conexão ainda estiver aberta, realiza seu fechamento
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
    }

    //Executa um comando SQL de consulta no banco de dados,
    //tratando da abertura, execução e fechamento de elementos
    //do JDBC necessários e a iteração de elementos de resultado
    //para composição de uma lista de clientes para retorno.
    public static List<Produto> executarConsulta(String sql) throws
            ClienteException, SQLException, Exception {
        //Lista de clientes de resultado
        List<Produto> listaProdutos = null;
        //Conexão para abertura e fechamento
        Connection connection = null;
        //Statement para obtenção através da conexão, execução de
        //comandos SQL e fechamentos
        Statement statement = null;
        //Armazenará os resultados do banco de dados
        ResultSet result = null;
        try {
            //Abre uma conexão com o banco de dados
            connection = ConnectionUtils.getConnection();
            //Cria um statement para execução de instruções SQL
            statement = connection.createStatement();
            //Exibe no console o que será executado no banco de dados
            System.out.println("Executando CONSULTA SQL: " + sql);
            //Executa a consulta SQL no banco de dados
            result = statement.executeQuery(sql);
            //Itera por cada item do resultado
            while (result.next()) {
                //Se a lista não foi inicializada, a inicializa
                if (listaProdutos == null) {
                    listaProdutos = new ArrayList<Produto>();
                }
                //Cria uma instância de Cliente e popula com os valores do BD
                Produto produto = new Produto();
                produto.setNome(result.getString("nome"));
                produto.setSerie(result.getInt("serie"));
                produto.setDesc(result.getString("descricao"));
                produto.setCor(result.getString("color"));
                produto.setMarca(result.getString("marca"));
                produto.setQtd(result.getInt("qtd"));
                produto.setValor(result.getDouble("valor"));
                //Adiciona a instância na lista
                listaProdutos.add(produto);
            }
        } finally {
            //Se o result ainda estiver aberto, realiza seu fechamento
            if (result != null && !result.isClosed()) {
                result.close();
            }
            //Se o statement ainda estiver aberto, realiza seu fechamento
            if (statement != null && !statement.isClosed()) {
                statement.close();
            }
            //Se a conexão ainda estiver aberta, realiza seu fechamento
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
        //Retorna a lista de clientes do banco de dados
        return listaProdutos;
    }
}
