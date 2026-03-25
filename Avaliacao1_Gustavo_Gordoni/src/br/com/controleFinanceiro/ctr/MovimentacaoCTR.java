/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.controleFinanceiro.ctr;

import br.com.controleFinanceiro.dao.MovimentacaoDAO;
import br.com.controleFinanceiro.dao.ConexaoDAO;
import br.com.controleFinanceiro.dto.MovimentacaoDTO;
import java.sql.ResultSet;

/**
 *
 * @author gordoni
 */
public class MovimentacaoCTR {

    MovimentacaoDAO movimentacaoDAO = new MovimentacaoDAO();

    public MovimentacaoCTR() {
    }

    public String inserirMovimentacao(MovimentacaoDTO movimentacaoDTO) {
        try {
            if (movimentacaoDAO.inserirMovimentacao(movimentacaoDTO)) {
                return "Movimentacao cadastrada com sucesso!";
            } else {
                return "Movimentacao NÃO cadastrada!";
            }
        } catch (Exception e) {
            System.err.println("Erro: " + e.getMessage());
            return "Movimentacao NÃO cadastrada!";
        }
    }

    public ResultSet consultarMovimentacao(MovimentacaoDTO movimentacaoDTO, int opcao) {
        ResultSet rs = null;

        rs = movimentacaoDAO.consultarMovimentacao(movimentacaoDTO, opcao);

        return rs;
    }

    public String alterarMovimentacao(MovimentacaoDTO movimentacaoDTO) {
        try {
            if (movimentacaoDAO.alterarMovimentacao(movimentacaoDTO)) {
                return "Movimentação atualizada com sucesso!";
            } else {
                return "Movimentação NÃO atualizada!";
            }
        } catch (Exception e) {
            System.err.println("Erro: " + e.getMessage());
            return "Movimentacao NÃO atualizada!";
        }
    }

    public String excluirMovimentacao(MovimentacaoDTO movimentacaoDTO) {
        try {
            if (movimentacaoDAO.excluirMovimentacao(movimentacaoDTO)) {
                return "Movimentacao excluída com sucesso!";
            } else {
                return "Movimentacao NÃO excluída!";
            }
        } catch (Exception e) {
            System.err.println("Erro: " + e.getMessage());
            return "Movimentacao NÃO excluída!";
        }
    }

    public void CloseDB() {
        ConexaoDAO.CloseDB();
    }
}
