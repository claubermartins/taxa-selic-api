package com.taxaselic.domain.model;

import java.util.List;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Response {
	
	@ApiModelProperty(value = "Parcelas")
	List<Parcela> parcelas;

}
