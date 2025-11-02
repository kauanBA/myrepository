
package br.com.sistema.dao;

import br.com.sistema.jdbc.ConexaoBanco;
import br.com.sistema.model.Clientes;
import br.com.sistema.model.Fornecedores;
import br.com.sistema.model.Produtos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ProdutosDAO {
    private Connection conn;
    
    public ProdutosDAO(){
        this.conn = new ConexaoBanco().pegarConexao();
    }
    
    public void Salvar(Produtos obj){
        try {
            // Criar o SQL
            String sql = "insert into tb_produtos (descricao,preco,qtd_estoque,for_id)"
                    + "values(?,?,?,?)";
            // Preparar conexão SQL para se conectar com o banco
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, obj.getDescricao());
            stmt.setDouble(2, obj.getPreco());
            stmt.setInt(3, obj.getQtdEstoque());
            stmt.setInt(4, obj.getFornecedores().getId());
            
            // Executar sql
            stmt.execute();
            
            // Fechar conexao
            stmt.close();
            JOptionPane.showMessageDialog(null, "Produto salvo com sucesso!");
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao salvar o produto!"+e);
        }
    
    }
    
    public void Editar(Produtos obj){
        try {
            // Criar o SQL
            String sql = "update tb_produtos set descricao=?,preco=?,qtd_estoque=?,for_id=? where id=?";
            // Preparar conexão SQL para se conectar com o banco
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, obj.getDescricao());
            stmt.setDouble(2, obj.getPreco());
            stmt.setInt(3, obj.getQtdEstoque());
            stmt.setInt(4, obj.getFornecedores().getId());
            stmt.setInt(5, obj.getId());
            
            // Executar sql
            stmt.execute();
            
            // Fechar conexao
            stmt.close();
            JOptionPane.showMessageDialog(null, "Produto editado com sucesso!");
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro ao editar o produto!"+e);
        }
    
    }
    
    public void Excluir(Produtos obj) {
        try {
            String sql = "delete from tb_produtos where id=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, obj.getId());
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Produto excluído com sucesso!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir produto: "+e);
        }
    
    }
    
    
    public Produtos BsucarProdutos(String nome){
        try{
            String sql = "select p.id,p.descricao,p.preco,p.qtd_estoque,f.nome from tb_produtos as p inner join"
                    + " tb_fornecedores as f on (p.for_id=f.id) where p.descricao =?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, nome);
            ResultSet rs = stmt.executeQuery();
            Produtos obj = new Produtos();
            Fornecedores f = new Fornecedores();
            if (rs.next()) {
                obj.setId(rs.getInt("p.id"));
                obj.setDescricao(rs.getString("p.descricao"));
                obj.setPreco(rs.getDouble("p.preco"));
                obj.setQtdEstoque(rs.getInt("p.qtd_estoque"));
                
                f.setNome(rs.getString("f.nome"));
                
                obj.setFornecedores(f);
             
            }
            return obj;
            
        } catch(Exception erro){
            JOptionPane.showMessageDialog(null, "Erro ao buscar produto"+erro);
        }
        return null;
    }
    
    public Produtos BsucarProdutosCodigo(int id){
        try{
            String sql = "select p.id,p.descricao,p.preco,p.qtd_estoque,f.nome from tb_produtos as p inner join"
                    + " tb_fornecedores as f on (p.for_id=f.id) where p.id =?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            Produtos obj = new Produtos();
            Fornecedores f = new Fornecedores();
            if (rs.next()) {
                obj.setId(rs.getInt("p.id"));
                obj.setDescricao(rs.getString("p.descricao"));
                obj.setPreco(rs.getDouble("p.preco"));
                obj.setQtdEstoque(rs.getInt("p.qtd_estoque"));
                
                f.setNome(rs.getString("f.nome"));
                
                obj.setFornecedores(f);
             
            }
            return obj;
            
        } catch(Exception erro){
            JOptionPane.showMessageDialog(null, "Erro ao buscar produto"+erro);
        }
        return null;
    }
    
    public List<Produtos>listar(){
        List<Produtos> lista = new ArrayList<>();
        try {
            String sql = "select p.id,p.descricao,p.preco,p.qtd_estoque,f.nome from tb_produtos as p inner join tb_fornecedores as f on(p.for_id=f.id)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                Produtos obj = new Produtos();
                Fornecedores f = new Fornecedores();
                obj.setId(rs.getInt("p.id"));
                obj.setDescricao(rs.getString("p.descricao"));
                obj.setPreco(rs.getDouble("p.preco"));
                obj.setQtdEstoque(rs.getInt("p.qtd_estoque"));
                f.setNome(rs.getString("f.nome"));
                obj.setFornecedores(f);
                lista.add(obj);
                          
            }
            return lista;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao criar a lista: " + e);
        }
        return null;
    }
    
    public List<Produtos>filtrar(String nome){
        List<Produtos> lista = new ArrayList<>();
        try {
            String sql = "select p.id,p.descricao,p.preco,p.qtd_estoque,f.nome from tb_produtos as p inner join "
                    + "tb_fornecedores as f on(p.for_id=f.id) where p.descricao like ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, nome);
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                Produtos obj = new Produtos();
                Fornecedores f = new Fornecedores();
                obj.setId(rs.getInt("p.id"));
                obj.setDescricao(rs.getString("p.descricao"));
                obj.setPreco(rs.getDouble("p.preco"));
                obj.setQtdEstoque(rs.getInt("p.qtd_estoque"));
                f.setNome(rs.getString("f.nome"));
                obj.setFornecedores(f);
            
                lista.add(obj);
                          
            }
            return lista;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao criar a lista: " + e);
        }
        return null;
    }
    public void adicionarEstoque(int id, int qtdNova){
        try {
            String sql = "update tb_produtos set qtd_estoque=? where id=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, qtdNova);
            stmt.setInt(2, id);
            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Adicionado com sucesso ao estoque!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao adicionar ao estoque: "+e);
        }
    }
    
    public void baixaEstoque(int id, int qtdNova){
        try {
            String sql = "update tb_produtos set qtd_estoque=? where id=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, qtdNova);
            stmt.setInt(2, id);
            stmt.execute();
            stmt.close();
//            JOptionPane.showMessageDialog(null, "Baixa no estoque efetuada com sucesso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao dar baixa no estoque: "+e);
        }
    }
    
    public int retornaQtdAtualEstoque(int id) {
        try {
            int qtdAtualEstoque = 0;
            String sql = "select qtd_estoque from tb_produtos where id=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()){
                qtdAtualEstoque = (rs.getInt("qtd_estoque"));
            }
            return qtdAtualEstoque;
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao retornar a quantidade atual do estoque: "+e);
        }
    }
    
}
