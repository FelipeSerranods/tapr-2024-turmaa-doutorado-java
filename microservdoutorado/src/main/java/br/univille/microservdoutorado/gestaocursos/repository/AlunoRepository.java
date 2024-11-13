package br.univille.microservdoutorado.gestaocursos.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.univille.microservdoutorado.gestaocursos.entity.Aluno;


@Repository
public interface AlunoRepository
    extends CrudRepository<Aluno,String> {
    
}