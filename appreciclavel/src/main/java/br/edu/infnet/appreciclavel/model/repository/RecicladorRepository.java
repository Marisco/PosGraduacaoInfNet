package br.edu.infnet.appreciclavel.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appreciclavel.model.domain.Reciclador;

@Repository
public interface RecicladorRepository extends CrudRepository<Reciclador, Integer> {

}
