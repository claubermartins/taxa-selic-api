package com.taxaselic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taxaselic.domain.model.Request;
import com.taxaselic.domain.model.Response;
import com.taxaselic.domain.model.dto.SelicResponse;
import com.taxaselic.service.ProdutoService;

import io.swagger.annotations.ApiOperation;



@RestController
@RequestMapping("/compras")
public class Controller {
	
	public ProdutoService produtoService;
	
	@Autowired
	public Controller(ProdutoService produtoService) {
		this.produtoService = produtoService;
	}
	
	@ApiOperation(value = "Response com a lista de parcelas")
	@PostMapping("/parcelas")
	ResponseEntity<Response> obterTodos(@RequestBody Request request){
		Response response = produtoService.obterParcelas(request);
		return 	ResponseEntity.ok(response);	
	}
	
	@ApiOperation(value = "Valores da taxa Selic dos ultimos 30 dias")
	@GetMapping("/taxaselic")
	ResponseEntity<List<SelicResponse>> obterTaxasSelic(){
		List<SelicResponse> taxasSelic = produtoService.ConsultaUltimasTaxasSelic();
		return 	ResponseEntity.ok(taxasSelic);	
	}
	
	
	

}