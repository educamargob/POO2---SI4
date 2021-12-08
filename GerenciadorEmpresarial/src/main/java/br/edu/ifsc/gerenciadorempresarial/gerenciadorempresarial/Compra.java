package br.edu.ifsc.gerenciadorempresarial.gerenciadorempresarial;

import Conexao.DBController;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Compra {
    Integer id;
    double valor_total;
    Funcionario solicitante;
    Produto produto;

    public Compra(double valor_total, Funcionario solicitante, Produto produto) {
        this.valor_total = valor_total;
        this.solicitante = solicitante;
        this.produto = produto;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public double getValor_total() {
        return valor_total;
    }

    public void setValor_total(double valor_total) {
        this.valor_total = valor_total;
    }

    public Funcionario getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(Funcionario solicitante) {
        this.solicitante = solicitante;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
    
    public void salvar() throws Exception {
        DBController db = new DBController();
        Map<String, String> dados = new HashMap<>();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();

        System.out.println(dtf.format(now));

        dados.put("valor_total", String.valueOf(valor_total));
        dados.put("datahora", dtf.format(now));
        dados.put("solicitante", String.valueOf(solicitante.getId()));
        dados.put("id_produto", String.valueOf(produto.getId()));
        

        db.conectar();
        db.insert("Compra", dados);
        db.desconectar();
    }
    
    
    
}

