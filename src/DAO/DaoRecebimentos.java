/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import conexoes.ConexaoMySql;
import java.util.ArrayList;
import model.ModelRecebimentos;

/**
 *
 * @author Usuario
 */
public class DaoRecebimentos extends ConexaoMySql {

    public int salvarRecebimentoDAO(ModelRecebimentos pModelPagamentos) {
        try {
            this.conectar();
            return this.insertSQL("INSERT INTO tbl_recebimento("
                    + "fk_venda,"
                    + "fk_cliente,"
                    + "rec_data,"
                    + "rec_valor,"
                    + "rec_metodo"
                    + ") VALUES ("
                    + "'" + pModelPagamentos.getRecVenda() + "',"
                    + "'" + pModelPagamentos.getRecCliente() + "',"
                    + "'" + pModelPagamentos.getRecData() + "',"
                    + "'" + pModelPagamentos.getRecValor() + "',"
                    + "'" + pModelPagamentos.getRecMetodo() + "');");
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.fecharConexao();
        }
    }

    public ArrayList<ModelRecebimentos> retornarListaRecebimentosDAO() {
        ArrayList<ModelRecebimentos> listaModelRecebimentos = new ArrayList<>();
        ModelRecebimentos modelRecebimentos = new ModelRecebimentos();
        try {
            this.conectar();
            this.executarSQL("SELECT "
                    + "pk_id_recebimento,"
                    + "fk_venda,"
                    + "fk_cliente,"
                    + "rec_data,"
                    + "rec_valor,"
                    + "rec_metodo "
                    + "FROM tbl_recebimento ORDER BY pk_id_recebimento ASC;");
            while (this.getResultSet().next()) {
                modelRecebimentos = new ModelRecebimentos();
                modelRecebimentos.setRecId(this.getResultSet().getInt(1));
                modelRecebimentos.setRecVenda(this.getResultSet().getInt(2));
                modelRecebimentos.setRecCliente(this.getResultSet().getInt(3));
                modelRecebimentos.setRecData(this.getResultSet().getDate(4));
                modelRecebimentos.setRecValor(this.getResultSet().getDouble(5));
                modelRecebimentos.setRecMetodo(this.getResultSet().getString(6));
                listaModelRecebimentos.add(modelRecebimentos);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }

        return listaModelRecebimentos;
    }
    
    public boolean excluirRecebimentoDAO(int pIdRecebimento) {
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                    "DELETE FROM tbl_recebimento WHERE pk_id_recebimento  = '" + pIdRecebimento + "';");
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.fecharConexao();
        }

    }
}
