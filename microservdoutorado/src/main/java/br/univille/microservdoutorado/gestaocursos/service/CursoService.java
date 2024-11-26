package br.univille.microservdoutorado.gestaocursos.service;

import java.util.List;

import br.univille.microservdoutorado.gestaocursos.entity.Curso;



public interface CursoService {
    List<Curso> getAll();
    Curso save(Curso curso);
    Curso update(String id, Curso curso);
    Curso delete(String id);   
}
