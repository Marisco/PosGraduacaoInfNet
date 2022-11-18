package br.edu.infnet.appreciclavel.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appreciclavel.model.domain.Reciclador;

@Repository
public interface RecicladorRepository extends CrudRepository<Reciclador, Integer> {
	
	@Query("from Reciclador r where r.usuario.id = :userid")
	List<Reciclador> obterLista(Integer userid);	

}
