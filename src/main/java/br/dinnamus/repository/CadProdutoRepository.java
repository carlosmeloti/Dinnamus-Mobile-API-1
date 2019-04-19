package br.dinnamus.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.dinnamus.model.CadProduto;
//Por Carlos Melo

public interface CadProdutoRepository extends JpaRepository<CadProduto, Long>{
	
	

	@Query(value = "SELECT cadproduto.chaveunica, cadproduto.Codigo, cadproduto.nome, itensgradeproduto.cor, "
			+ "itensgradeproduto.tamanho, Itenstabelapreco.PRECOVENDA "
			+ "FROM cadproduto "
			+ "INNER JOIN itensgradeproduto ON cadproduto.chaveunica = itensgradeproduto.codigo  "
			+ " INNER JOIN Itenstabelapreco ON itensgradeproduto.chaveunica = Itenstabelapreco.Codigoproduto "
			+ " where cadproduto.chaveunica = 430" , nativeQuery = true)
	List<CadProduto> findByCodigo(Long codigoproduto);

}
