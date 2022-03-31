package com.taxaselic.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.taxaselic.api.SelicApi;
import com.taxaselic.domain.model.CondicaoPagamento;
import com.taxaselic.domain.model.Parcela;
import com.taxaselic.domain.model.Produto;
import com.taxaselic.domain.model.Request;
import com.taxaselic.domain.model.Response;
import com.taxaselic.domain.model.dto.SelicResponse;

@Service
public class ProdutoService {
	
	
	public Response obterParcelas(Request request) {
		Response response = new Response();
		List<Parcela> parcelas = new ArrayList<>();
		
		CondicaoPagamento condPague = request.getCondicaoPagamento();
		Produto produto = request.getProduto();
		Double taxaSelic = 0.0;
		Double parcela;
		Double aux;
		for(int i = 1; i<= condPague.getQtdeParcelas(); i++) {
			if(i == 7) taxaSelic = ConsultaTaxaSelic();
			aux = (produto.getValor()-condPague.getValorEntrada())/i;
			
			parcela = (1 + taxaSelic)*aux;
			parcelas.add(new Parcela(i, parcela, taxaSelic));
				
			}
		response.setParcelas(parcelas);
		return response;
		}
	
	
	
	public List<SelicResponse> ConsultaUltimasTaxasSelic(){
		SelicApi selic = new SelicApi();
		return selic.obterTodos();
	}
	
	public Double ConsultaTaxaSelic(){
		SelicApi selic = new SelicApi();
		List<SelicResponse> taxas = selic.obterTodos();
		
		SelicResponse selicResp =  taxas.get(taxas.size()-1);
		return selicResp.getValor();
	}

}
