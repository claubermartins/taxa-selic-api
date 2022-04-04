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
public class Parcela {
	
	@ApiModelProperty(value = "Numero de parcelas")
	private Integer numeroParcela;
	
	@ApiModelProperty(value = "valor da parcela")
	private Double valor;
	
	@ApiModelProperty(value = "taxa de juro ao mes")
	private Double taxaJurosAoMes;
}
