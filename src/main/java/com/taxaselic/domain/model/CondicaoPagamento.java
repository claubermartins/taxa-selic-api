package com.taxaselic.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CondicaoPagamento {
	private Double valorEntrada;
	private Integer qtdeParcelas;
}
