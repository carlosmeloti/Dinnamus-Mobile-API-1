package br.dinnamus.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.dinnamus.model.ItensGradeProduto;
import br.dinnamus.model.ItensTabelaPreco;
import br.dinnamus.repository.ItensTabelaPrecoRepository;

@RestController
@RequestMapping("/itenstabelapreco")
public class ItensTabelaPrecoResource {
	
	@Autowired
	private ItensTabelaPrecoRepository itensTabelaPrecoRepository;
	
	
	@GetMapping List<ItensTabelaPreco> listar() {
		return itensTabelaPrecoRepository.findAll();
	}
	

}
