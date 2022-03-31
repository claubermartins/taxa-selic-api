package com.taxaselic.domain.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class SelicResponse {
	private String data;
	private Double valor;
}
