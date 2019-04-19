package br.dinnamus.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.dinnamus.model.ItensGradeProduto;
import br.dinnamus.repository.ItensGradeProdutoRepository;



@RestController
@RequestMapping("/itensgradeproduto")
public class ItensGradeProdutoResource {
	
	@Autowired
	private ItensGradeProdutoRepository itensGradeProdutoRepository;
	
	@GetMapping List<ItensGradeProduto> listar() {
		return itensGradeProdutoRepository.findAll();
	}
	

}
