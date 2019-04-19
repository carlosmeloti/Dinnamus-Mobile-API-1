package br.dinnamus.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.dinnamus.model.CadProduto;
import br.dinnamus.repository.CadProdutoRepository;

@RestController
@RequestMapping("/cadproduto")
public class CadProdutoResource {

	@Autowired
	private CadProdutoRepository cadProdutoRepository;
	
	@GetMapping List<CadProduto> listar(Long codigoproduto) {
		return cadProdutoRepository.findByCodigo(codigoproduto);
	}
	


}
