package br.edu.infnet.appreciclavel.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.appreciclavel.model.domain.Vidro;

@Repository
public interface VidroRepository extends CrudRepository<Vidro, Integer> {

}
