package br.edu.infnet.appreciclavel.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appreciclavel.model.domain.Entrega;

@Repository
public interface EntregaRepository extends CrudRepository<Entrega, Integer> {
	
	@Query("from Entrega e where e.usuario.id = :userid")
	List<Entrega> obterLista(Integer userid);	

}
