package br.edu.ifsc.gerenciadorempresarial.gerenciadorempresarial;

import Conexao.DBController;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Setor {
    private int id;
    private String nome;
    private String descr;

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

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }
    
    
    
        public void adicionar() throws Exception {
        DBController db = new DBController();
        Map<String,String> dados = new HashMap<>();
        
        dados.put("nome", nome);
        dados.put("descricao", descr);
        
        db.conectar();
        db.insert("Setor", dados);
        db.desconectar();
    }
    
    public void atualizar() throws Exception {
        DBController db = new DBController();
        Map<String,String> dados = new HashMap<>();
        Map<String,String> where = new HashMap<>();
        
        dados.put("nome", nome);
        dados.put("descricao", descr);
        where.put("id", String.valueOf(id));
        
        db.conectar();
        db.update("Setor", dados, where);
        db.desconectar();
    }
    
    public static List<Setor> buscaSetores() throws Exception {
        DBController db = new DBController();
        ResultSet rset;
        List<Setor> setores = new ArrayList<>();
                
        db.conectar();
        rset = db.executeQuery("SELECT * FROM Setor");
            
        try {
            while (rset.next()) {
                Setor s = new Setor();
                s.id = rset.getInt("id");
                s.nome = rset.getString("nome");
                s.descr = rset.getString("descricao");
                
                setores.add(s);
            }
        } catch (SQLException ex) {
            throw new Exception("Erro ao percorrer resultados!");
        }
            
        db.desconectar();
                
        return setores;
    }
}
