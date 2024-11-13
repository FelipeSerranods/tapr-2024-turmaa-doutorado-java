package br.univille.microservdoutorado.gestaocursos.service;

import java.util.List;

import br.univille.microservdoutorado.gestaocursos.entity.Aluno;

public interface AlunoService {
    List<Aluno> getAll();
    Aluno save(Aluno aluno);    
}
