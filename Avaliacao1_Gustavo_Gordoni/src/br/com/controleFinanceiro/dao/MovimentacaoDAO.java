/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.controleFinanceiro.dao;

import java.sql.*;
import br.com.controleFinanceiro.dto.MovimentacaoDTO;

/**
 *
 * @author gordoni
 */
public class MovimentacaoDAO {

    public MovimentacaoDAO() {
    }

    private ResultSet rs = null;
    private Statement stmt = null;

    public boolean inserirMovimentacao(MovimentacaoDTO movimentacaoDTO) {
        try {
            ConexaoDAO.ConectDB();

            stmt = ConexaoDAO.con.createStatement();

            // Vulnerabilidade de SQL Injection... (nos demais comandos tbm)
            String comando = "INSERT INTO movimentacao (nome_mov, tipo_mov, "
                    + "data_mov, categoria_mov, forma_pagamento_mov, status_mov, "
                    + "observacao_mov, prioridade_mov, usuario_mov, recorrencia_mov, valor_mov) values ("
                    + "'" + movimentacaoDTO.getNome_mov() + "', "
                    + "'" + movimentacaoDTO.getTipo_mov() + "', "
                    + "'" + movimentacaoDTO.getData_mov() + "', "
                    + "'" + movimentacaoDTO.getCategoria_mov() + "', "
                    + "'" + movimentacaoDTO.getForma_pagamento_mov() + "', "
                    + "'" + movimentacaoDTO.getStatus_mov() + "', "
                    + "'" + movimentacaoDTO.getObservacao_mov() + "', "
                    + "'" + movimentacaoDTO.getPrioridade_mov() + "', "
                    + "'" + movimentacaoDTO.getUsuario_mov() + "', "
                    + "'" + movimentacaoDTO.getRecorrencia_mov() + "', "
                    + movimentacaoDTO.getValor_mov() + ");";

            System.out.println(comando);
            stmt.execute(comando);

            ConexaoDAO.con.commit();

            stmt.close();

            return true;

        } catch (Exception e) {
            System.err.println("Erro ao realizar a inserçao da movimentação na base de dados."
                    + "\nErro: " + e.getMessage());

            return false;
        } finally {
            ConexaoDAO.CloseDB();
        }
    }

    public ResultSet consultarMovimentacao(MovimentacaoDTO movimentacaoDTO, int opcao) {
        try {
            ConexaoDAO.ConectDB();

            stmt = ConexaoDAO.con.createStatement();
            String comando = "";

            switch (opcao) {
                case 1:
                    comando = "SELECT m.* FROM movimentacao m WHERE nome_mov LIKE '"
                            + movimentacaoDTO.getNome_mov() + "%' ORDER BY m.nome_mov";
                    break;
                case 2:
                    comando = "SELECT m.* FROM movimentacao m WHERE m.id_mov = " + movimentacaoDTO.getId_mov();
                    break;
                case 3:
                    comando = "SELECT m.id_mov, m.nome_mov FROM movimentacao m";
                    break;
            }

            System.out.println(comando);

            rs = stmt.executeQuery(comando);

            return rs;

        } catch (Exception e) {
            System.err.println("" + e.getMessage());
            return rs;
        }
    }

    public boolean alterarMovimentacao(MovimentacaoDTO movimentacaoDTO) {
        try {
            ConexaoDAO.ConectDB();

            stmt = ConexaoDAO.con.createStatement();
            
            String comando = "UPDATE movimentacao SET "
                    + "nome_mov= '" + movimentacaoDTO.getNome_mov() + "', "
                    + "tipo_mov= '" + movimentacaoDTO.getTipo_mov() + "', "
                    + "data_mov= '" + movimentacaoDTO.getData_mov() + "', "
                    + "categoria_mov= '" + movimentacaoDTO.getCategoria_mov() + "', "
                    + "forma_pagamento_mov= '" + movimentacaoDTO.getForma_pagamento_mov() + "', "
                    + "status_mov= '" + movimentacaoDTO.getStatus_mov() + "', "
                    + "observacao_mov= '" + movimentacaoDTO.getObservacao_mov() + "', "
                    + "prioridade_mov= '" + movimentacaoDTO.getPrioridade_mov() + "', "
                    + "recorrencia_mov= '" + movimentacaoDTO.getRecorrencia_mov() + "', "
                    + "usuario_mov= '" + movimentacaoDTO.getUsuario_mov() + "', "
                    + "valor_mov = " + movimentacaoDTO.getValor_mov() + " "
                    + "WHERE id_mov = " + movimentacaoDTO.getId_mov();

            System.out.println(comando);
            stmt.execute(comando);

            ConexaoDAO.con.commit();

            stmt.close();

            return true;

        } catch (Exception e) {
            System.err.println("Erro ao realizar ao atualizar a movimentação na base de dados."
                    + "\nErro: " + e.getMessage());

            return false;
        } finally {
            ConexaoDAO.CloseDB();
        }

    }

    public boolean excluirMovimentacao(MovimentacaoDTO movimentacaoDTO) {
        try {
            ConexaoDAO.ConectDB();

            stmt = ConexaoDAO.con.createStatement();

            String comando = "DELETE FROM movimentacao"
                    + " WHERE id_mov = " + movimentacaoDTO.getId_mov();

            System.out.println(comando.toUpperCase());
            stmt.execute(comando.toUpperCase());

            ConexaoDAO.con.commit();

            stmt.close();

            return true;

        } catch (Exception e) {
            System.err.println("Erro ao realizar a exclusão da movimentação na base de dados."
                    + "\nErro: " + e.getMessage());

            return false;
        } finally {
            ConexaoDAO.CloseDB();
        }
    }
}
