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
public class Request {
	
	@ApiModelProperty(value = "Produto")
	private Produto produto;
	
	@ApiModelProperty(value = "Condicao de pagamento")
	private CondicaoPagamento condicaoPagamento;

}
