package com.taxaselic.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Parcela {
	private Integer numeroParcela;
	private Double valor;
	private Double taxaJurosAoMes;
}
