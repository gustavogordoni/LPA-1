/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  gordoni
 * Created: 19 de mar. de 2026
 */

CREATE TABLE movimentacao
(
	id_mov SERIAL,
	nome_mov CHARACTER VARYING(50),
	tipo_mov CHARACTER VARYING(50),
	data_mov CHARACTER VARYING(10),
	categoria_mov CHARACTER VARYING(50),
	forma_pagamento_mov CHARACTER VARYING(50),
	status_mov CHARACTER VARYING(50),
	prioridade_mov CHARACTER VARYING(50),
	recorrencia_mov CHARACTER VARYING(50),
	usuario_mov CHARACTER VARYING(50),	
	observacao_mov CHARACTER VARYING(255),
	valor_mov REAL,
	
	CONSTRAINT movimentacao_pkey PRIMARY KEY (id_mov)
);

select * from movimentacao;