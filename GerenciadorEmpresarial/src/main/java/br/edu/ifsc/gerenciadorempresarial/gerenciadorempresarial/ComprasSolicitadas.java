
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

public class ComprasSolicitadas {
    private Integer id;
    private double valor_total;
    private String datahora;
    private Integer solicitante;
    private String aprovada;
    private Integer produto;
    private String dataEntregue;

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

    public String getDatahora() {
        return datahora;
    }

    public void setDatahora(String datahora) {
        this.datahora = datahora;
    }

    public Integer getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(Integer solicitante) {
        this.solicitante = solicitante;
    }

    public String getAprovada() {
        return aprovada;
    }

    public void setAprovada(String aprovada) {
        this.aprovada = aprovada;
    }

    public Integer getProduto() {
        return produto;
    }

    public void setProduto(Integer produto) {
        this.produto = produto;
    }

    public String getDataEntregue() {
        return dataEntregue;
    }

    public void setDataEntregue(String dataEntregue) {
        this.dataEntregue = dataEntregue;
    }



    public static List<ComprasSolicitadas> buscaCompras() throws Exception {
        DBController db = new DBController();
        ResultSet rset;
        List<ComprasSolicitadas> compras = new ArrayList<>();
                
        db.conectar();
        rset = db.executeQuery("SELECT * FROM Compra");
            
        try {
            while (rset.next()) {
                ComprasSolicitadas c = new ComprasSolicitadas();
                c.id = rset.getInt("id");
                c.valor_total = rset.getDouble("valor_total");
                c.datahora = rset.getString("datahora");
                c.solicitante = rset.getInt("solicitante")-1;
                c.aprovada = rset.getString("aprovada");
                c.produto = rset.getInt("id_produto")-1;
                c.dataEntregue = rset.getString("dataentregue");
                
                
                compras.add(c);
            }
        } catch (SQLException ex) {
            throw new Exception("Erro ao percorrer resultados!");
        }
            
        db.desconectar();
                
        return compras;
    }
    public void atualizar() throws Exception {
        DBController db = new DBController();
        Map<String,String> dados = new HashMap<>();
        Map<String,String> where = new HashMap<>();
        
        dados.put("aprovada", aprovada);
        where.put("id", String.valueOf(id));
        
        db.conectar();
        db.update("Compra", dados, where);
        db.desconectar();
    }
    public void atualizarEntrega() throws Exception{
        DBController db = new DBController();
        Map<String,String> dados = new HashMap<>();
        Map<String,String> where = new HashMap<>();
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();

        System.out.println(dtf.format(now));
        dados.put("dataentregue", dtf.format(now));
        where.put("id", String.valueOf(id));
        
        db.conectar();
        db.update("Compra", dados, where);
        db.desconectar();
    }
    
}
