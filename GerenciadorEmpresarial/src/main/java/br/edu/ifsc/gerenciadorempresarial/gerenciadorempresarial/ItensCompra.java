/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsc.gerenciadorempresarial.gerenciadorempresarial;

import Conexao.DBController;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author ecama
 */
public class ItensCompra {
    Integer id;
    Produto produto;
    Integer compra;

    public ItensCompra(Produto produto, Integer compra) {
        this.produto = produto;
        this.compra = compra;
    }
    
    public void salvar() throws Exception {
        DBController db = new DBController();
        Map<String, String> dados = new HashMap<>();

        dados.put("produto_id", String.valueOf(produto.getId()));
        dados.put("compra_id", String.valueOf(compra));

        db.conectar();
        db.insert("Itens_Compra", dados);
        db.desconectar();
    }
}
