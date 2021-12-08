package br.edu.ifsc.gerenciadorempresarial.gerenciadorempresarial;

import Conexao.DBController;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Funcionario {
    private Integer id;
    private String nome;
    private String cpf;
    private String datanasc;
    private String login;
    private String senha;
    private Integer setor;
    private Integer funcao;
    private Integer funcLogado;
    
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDatanasc() {
        return datanasc;
    }

    public void setDatanasc(String datanasc) {
        this.datanasc = datanasc;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Integer getSetor() {
        return setor;
    }

    public void setSetor(Integer setor) {
        this.setor = setor;
    }

    public Integer getFuncao() {
        return funcao;
    }

    public void setFuncao(Integer funcao) {
        this.funcao = funcao;
    }

    public Integer getFuncLogado() {
        return funcLogado;
    }

    public void setFuncLogado(Integer funcLogado) {
        this.funcLogado = funcLogado;
    }
    
    
    public void adicionar() throws Exception {
        DBController db = new DBController();
        Map<String,String> dados = new HashMap<>();
        
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        try{
            Date data = formatter.parse(datanasc);
            System.out.println(data);
        }catch(Exception e){
            throw new Exception("Erro ao transformar a data");
        }
        
        dados.put("nome", nome);
        dados.put("cpf", cpf);
        dados.put("datanasc", datanasc);
        dados.put("login", login);
        dados.put("senha", senha);
        dados.put("setor_id", String.valueOf(setor));
        dados.put("funcoes_id", String.valueOf(funcao));
        
        db.conectar();
        db.insert("Funcionario", dados);
        db.desconectar();
    }
    
    public void atualizar() throws Exception {
        DBController db = new DBController();
        Map<String,String> dados = new HashMap<>();
        Map<String,String> where = new HashMap<>();
        
        dados.put("nome", nome);
        dados.put("cpf", cpf);
        dados.put("datanasc", datanasc);
        dados.put("login", login);
        dados.put("senha", senha);
        dados.put("setor_id", String.valueOf(setor));
        dados.put("funcoes_id", String.valueOf(funcao));
        where.put("id", String.valueOf(id));
        
        db.conectar();
        db.update("Funcionario", dados, where);
        db.desconectar();
    }
    
    public static List<Funcionario> buscaFuncionarios() throws Exception {
        DBController db = new DBController();
        ResultSet rset;
        List<Funcionario> funcs = new ArrayList<>();
                
        db.conectar();
        rset = db.executeQuery("SELECT * FROM Funcionario");
            
        try {
            while (rset.next()) {
                Funcionario f = new Funcionario();
                f.id = rset.getInt("id");
                f.nome = rset.getString("nome");
                f.cpf = rset.getString("cpf");
                f.datanasc = rset.getString("datanasc");
                f.login = rset.getString("login");
                f.senha = rset.getString("senha");
                f.setor = rset.getInt("setor_id");
                f.funcao = rset.getInt("funcoes_id");
                
                funcs.add(f);
            }
        } catch (SQLException ex) {
            throw new Exception("Erro ao percorrer resultados!");
        }
            
        db.desconectar();
                
        return funcs;
    }
}
