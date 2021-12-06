package br.edu.ifsc.gerenciadorempresarial.gerenciadorempresarial;

import Conexao.DBController;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Produto {
    private Integer id;
    private String nome;
    private String descricao;
    private Double preco;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
    
    public void adicionar() throws Exception {
        DBController db = new DBController();
        Map<String,String> dados = new HashMap<>();
        
        dados.put("nome", nome);
        dados.put("descricao", descricao);
        dados.put("preco", String.valueOf(preco));
        
        db.conectar();
        db.insert("Produto", dados);
        db.desconectar();
    }
    
    public void atualizar() throws Exception {
        DBController db = new DBController();
        Map<String,String> dados = new HashMap<>();
        Map<String,String> where = new HashMap<>();
        
        dados.put("nome", nome);
        dados.put("descricao", descricao);
        dados.put("preco", String.valueOf(preco));
        where.put("id", String.valueOf(id));
        
        db.conectar();
        db.update("Produto", dados, where);
        db.desconectar();
    }
    
    public static List<Produto> buscaProdutos() throws Exception {
        DBController db = new DBController();
        ResultSet rset;
        List<Produto> prods = new ArrayList<>();
                
        db.conectar();
        rset = db.executeQuery("SELECT * FROM Produto");
            
        try {
            while (rset.next()) {
                Produto p = new Produto();
                p.id = rset.getInt("id");
                p.nome = rset.getString("nome");
                p.descricao = rset.getString("descricao");
                p.preco = rset.getDouble("preco");
                
                prods.add(p);
            }
        } catch (SQLException ex) {
            throw new Exception("Erro ao percorrer resultados!");
        }
            
        db.desconectar();
                
        return prods;
    }
}
    
