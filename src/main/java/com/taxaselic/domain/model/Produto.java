package com.taxaselic.domain.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Produto {
	
	@ApiModelProperty(value = "Codigo do produto")
	private Long codigo;
	
	@ApiModelProperty(value = "Nome do produto")
	private String nome;
	
	@ApiModelProperty(value = "Valor do produto")
	private Double valor;
}
