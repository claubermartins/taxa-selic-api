package com.taxaselic.domain.model;

import java.util.List;
import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Response {
	List<Parcela> parcelas;
}
