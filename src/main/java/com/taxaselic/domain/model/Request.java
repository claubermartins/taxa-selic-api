package com.taxaselic.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Request {
	private Produto produto;
	private CondicaoPagamento condicaoPagamento;

}
