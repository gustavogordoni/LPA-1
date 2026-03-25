/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.controleFinanceiro.dto;

/**
 *
 * @author gordoni
 */
public class MovimentacaoDTO {

    private int id_mov;
    private String nome_mov, tipo_mov, data_mov, categoria_mov, forma_pagamento_mov, status_mov, observacao_mov,
            recorrencia_mov, usuario_mov, prioridade_mov;
    private double valor_mov;

    public int getId_mov() {
        return id_mov;
    }

    public void setId_mov(int id_mov) {
        this.id_mov = id_mov;
    }

    public String getNome_mov() {
        return nome_mov;
    }

    public void setNome_mov(String nome_mov) {
        this.nome_mov = nome_mov;
    }

    public String getTipo_mov() {
        return tipo_mov;
    }

    public void setTipo_mov(String tipo_mov) {
        this.tipo_mov = tipo_mov;
    }

    public String getData_mov() {
        return data_mov;
    }

    public void setData_mov(String data_mov) {
        this.data_mov = data_mov;
    }

    public String getCategoria_mov() {
        return categoria_mov;
    }

    public void setCategoria_mov(String categoria_mov) {
        this.categoria_mov = categoria_mov;
    }

    public String getForma_pagamento_mov() {
        return forma_pagamento_mov;
    }

    public void setForma_pagamento_mov(String forma_pagamento_mov) {
        this.forma_pagamento_mov = forma_pagamento_mov;
    }

    public String getStatus_mov() {
        return status_mov;
    }

    public void setStatus_mov(String status_mov) {
        this.status_mov = status_mov;
    }

    public String getObservacao_mov() {
        return observacao_mov;
    }

    public void setObservacao_mov(String observacao_mov) {
        this.observacao_mov = observacao_mov;
    }

    public String getRecorrencia_mov() {
        return recorrencia_mov;
    }

    public void setRecorrencia_mov(String recorrencia_mov) {
        this.recorrencia_mov = recorrencia_mov;
    }

    public String getUsuario_mov() {
        return usuario_mov;
    }

    public void setUsuario_mov(String usuario_mov) {
        this.usuario_mov = usuario_mov;
    }

    public String getPrioridade_mov() {
        return prioridade_mov;
    }

    public void setPrioridade_mov(String prioridade_mov) {
        this.prioridade_mov = prioridade_mov;
    }

    public double getValor_mov() {
        return valor_mov;
    }

    public void setValor_mov(double valor_mov) {
        this.valor_mov = valor_mov;
    }   
}
