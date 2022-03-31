package com.taxaselic.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Produto {
	private Long codigo;
	private String nome;
	private Double valor;
}
