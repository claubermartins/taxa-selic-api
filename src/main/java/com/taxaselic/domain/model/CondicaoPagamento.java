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
public class CondicaoPagamento {
	
	@ApiModelProperty(value = "Valor da entrada")
	private Double valorEntrada;
	
	@ApiModelProperty(value = "Quantidade de parcelas")
	private Integer qtdeParcelas;
}
