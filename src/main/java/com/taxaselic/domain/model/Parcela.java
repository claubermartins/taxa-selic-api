package com.taxaselic.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Parcela {
	private Integer numeroParcela;
	private Double valor;
	private Double taxaJurosAoMes;
}
