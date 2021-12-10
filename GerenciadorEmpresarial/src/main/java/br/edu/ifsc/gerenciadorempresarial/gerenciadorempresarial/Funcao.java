
package br.edu.ifsc.gerenciadorempresarial.gerenciadorempresarial;

import Conexao.DBController;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class Funcao {
    private Integer id;
    private String nome;
    private String descricao;
    private Integer setor_id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public Integer getSetor_id() {
        return setor_id;
    }

    public void setSetor_id(Integer setor_id) {
        this.setor_id = setor_id;
    }
    
    public static List<Funcao> buscaFuncoes() throws Exception {
        DBController db = new DBController();
        ResultSet rset;
        List<Funcao> funcoes = new ArrayList<>();
                
        db.conectar();
        rset = db.executeQuery("SELECT * FROM Funcoes");
            
        try {
            while (rset.next()) {
                Funcao f = new Funcao();
                f.id = rset.getInt("id");
                f.nome = rset.getString("nome");
                f.descricao = rset.getString("descricao");
                f.setor_id = rset.getInt("setor_id");
                
                funcoes.add(f);
            }
        } catch (SQLException ex) {
            throw new Exception("Erro ao percorrer resultados!");
        }
            
        db.desconectar();
                
        return funcoes;
    }
}
