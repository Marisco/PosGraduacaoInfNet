package br.edu.infnet.appreciclavel.model.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appreciclavel.model.domain.Reciclavel;

@Repository
public interface ReciclavelRepository extends CrudRepository<Reciclavel, Integer> {
	
	@Query("from Reciclavel r where r.usuario.id = :userid")
	List<Reciclavel> obterLista(Integer userid);	

}
