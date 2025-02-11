package org.example.dao;

import org.example.dao.jdbc.ConnectionFactory;
import org.example.domain.Produto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Project: exemplojdbc
 * Package: org.example.dao.jdbc
 * <p>
 * User: MegaD
 * Email: davylopes866@gmail.com
 * Date: 11/02/2025
 * Time: 14:29
 * <p>
 */
public class ProdutoDAO implements IProdutoDAO{

    @Override
    public Integer cadastrar(Produto produto) throws Exception {
        Connection connection = null;
        PreparedStatement stm = null;
        try{
            connection = ConnectionFactory.getConnection();
            String sql = getSqlInsert();
            stm = connection.prepareStatement(sql);
            adicionarParametrosInsert(stm, produto);
            return stm.executeUpdate();
        }catch (Exception e) {
            throw e;
        }finally {
            closeConnection(connection, stm, null);
        }
    }

    @Override
    public Produto consultar(String codigo)throws Exception {
        Connection connection = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        Produto produto = null;
        try {
            connection = ConnectionFactory.getConnection();
            String sql = getSqlSelect();
            stm = connection.prepareStatement(sql);
            adicionarParametrosSelect(stm, codigo);
            rs = stm.executeQuery();

            if (rs.next()) {
                produto = new Produto();
                produto.setId(rs.getLong("ID"));
                produto.setCodigo(rs.getString("CODIGO"));
                produto.setNome(rs.getString("NOME"));
                produto.setPreco(rs.getDouble("PRECO"));
                produto.setId(rs.getLong("ID"));
                produto.setPreco(rs.getDouble("PRECO"));
                produto.setNome(rs.getString("NOME"));
                produto.setCodigo(rs.getString("CODIGO"));
            }
        }catch (Exception e){
            throw e;
        }finally {
            closeConnection(connection, stm, rs);
        }
        return produto;
    }

    @Override
    public Integer alterar(Produto produto)throws Exception {
        Connection connection = null;
        PreparedStatement stm = null;
        try{
            connection = ConnectionFactory.getConnection();
            String sql = getSqlDelt();
            stm = connection.prepareStatement(sql);
            adicionarParametrosDelt(stm, produto);
            return stm.executeUpdate();
        }catch (Exception e) {
            throw e;
        }finally {
            closeConnection(connection, stm, null);
        }
    }

    @Override
    public Integer excluir(Produto produto)throws Exception {
        Connection connection = null;
        PreparedStatement stm = null;
        try{
            connection = ConnectionFactory.getConnection();
            String sql = getSqlChange();
            stm = connection.prepareStatement(sql);
            adicionarParametrosChange(stm, produto);
            return stm.executeUpdate();
        }catch (Exception e) {
            throw e;
        }finally {
            closeConnection(connection, stm, null);
        }
    }

    @Override
    public List<Produto> listar() throws Exception {
         Connection connection = null;
         PreparedStatement stm = null;
         ResultSet rs = null;
         List<Produto> produtos = new ArrayList<>();
         try {
             connection = ConnectionFactory.getConnection();
             String sql = getSqlAll();
             stm = connection.prepareStatement(sql);
             rs = stm.executeQuery();
             while (rs.next()) {
                 Produto produto = new Produto();
                 produto = new Produto();
                 produto.setId(rs.getLong("ID"));
                 produto.setCodigo(rs.getString("CODIGO"));
                 produto.setNome(rs.getString("NOME"));
                 produto.setPreco(rs.getDouble("PRECO"));
                 produto.setId(rs.getLong("ID"));
                 produto.setPreco(rs.getDouble("PRECO"));
                 produto.setNome(rs.getString("NOME"));
                 produto.setCodigo(rs.getString("CODIGO"));
             }

         }catch (Exception e) {
             throw e;
         }finally {
             closeConnection(connection, stm, rs);
         }
        return List.of();
    }

    private String getSqlAll() {
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT * FROM TB_PRODUTO");
        return sql.toString();
    }

    private String getSqlInsert() {
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO TB_PRODUTO (ID, CODIGO, NOME, PRECO) ");
        sql.append("VALUES (nextval('SQ_CLIENTE'),?,?,?)");
        return sql.toString();
    }

    private void adicionarParametrosInsert(PreparedStatement stm, Produto produto) throws SQLException {
        stm.setString(1,produto.getCodigo());
        stm.setString(2,produto.getNome());
        stm.setDouble(3,produto.getPreco());
    }
    private String getSqlChange() {
        StringBuilder sql = new StringBuilder();
        sql.append("INSERT INTO TB_PRODUTO");
        sql.append("CODIGO = ?, NOME = ?, PRECO = ?");
        sql.append("WHERE ID = ?");
        return sql.toString();
    }

    private void adicionarParametrosChange(PreparedStatement stm, Produto produto) throws SQLException {
        stm.setString(1, produto.getCodigo());
        stm.setString(2, produto.getNome());
        stm.setDouble(3, produto.getPreco());
        stm.setLong(4, produto.getId());
    }


    private String getSqlDelt() {
        StringBuilder sql = new StringBuilder();
        sql.append("DELETE FROM TB_PRODUTO");
        sql.append("WHERE ID = ?");
        return sql.toString();
    }

    private void adicionarParametrosDelt(PreparedStatement stm, Produto produto) throws SQLException {
        stm.setLong(1, produto.getId());
    }

    private String getSqlSelect() {
        StringBuilder sql = new StringBuilder();
        sql.append("SELECT * FROM TB_PRODUTO");
        sql.append(" WHERE CODIGO = ?");
        return sql.toString();
    }

    private void adicionarParametrosSelect(PreparedStatement stm, String codigo) throws SQLException {
        stm.setString(1,codigo);
    }

    private void closeConnection(Connection connection, PreparedStatement stm, ResultSet rs) {
        try {
            if (rs != null && !rs.isClosed()) {
                rs.close();
            }
            if (stm != null && !stm.isClosed()) {
                stm.close();
            }
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e1) {
            e1.printStackTrace();
        }
    }
}
