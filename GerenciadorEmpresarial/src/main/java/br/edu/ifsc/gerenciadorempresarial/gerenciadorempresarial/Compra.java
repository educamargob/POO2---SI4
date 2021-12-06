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

    public Compra(double valor_total, Funcionario solicitante) {
        this.valor_total = valor_total;
        this.solicitante = solicitante;
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
    
    public void salvar() throws Exception {
        DBController db = new DBController();
        Map<String, String> dados = new HashMap<>();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();

        System.out.println(dtf.format(now));

        dados.put("valor_total", String.valueOf(valor_total));
        dados.put("datahora", dtf.format(now));
        dados.put("solicitante", String.valueOf(solicitante.getId()));
        

        db.conectar();
        db.insert("Compra", dados);
        db.desconectar();
    }
    
    
}

