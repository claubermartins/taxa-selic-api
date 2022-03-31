package com.taxaselic.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class CondicaoPagamento {
	private Double valorEntrada;
	private Integer qtdeParcelas;
}