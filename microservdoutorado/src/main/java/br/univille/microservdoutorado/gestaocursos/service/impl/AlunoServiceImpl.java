package br.univille.microservdoutorado.gestaocursos.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.univille.microservdoutorado.gestaocursos.entity.Aluno;
import br.univille.microservdoutorado.gestaocursos.repository.AlunoRepository;
import br.univille.microservdoutorado.gestaocursos.service.AlunoService;

@Service
public class AlunoServiceImpl implements AlunoService {

    @Autowired
    private AlunoRepository repository;
    
    @Override
    public List<Aluno> getAll() {
        var retornoIterador = repository.findAll();
        var listaAlunos = new ArrayList<Aluno>();
        
        retornoIterador.forEach(listaAlunos::add);
        return listaAlunos;
    }

    @Override
    public Aluno save(Aluno aluno) {
        return repository.save(aluno);
    }
    
    @Override
    public Aluno update(String id, Aluno aluno) {
        var buscarAluno = repository.findById(id);
        if(buscarAluno.isPresent()){
            var alunoAntigo = buscarAluno.get();
            alunoAntigo.setNome(aluno.getNome());
            repository.save(alunoAntigo);
            return alunoAntigo;
        }
        return null;
    }

    @Override
    public Aluno delete(String id) {
        var buscarAluno = repository.findById(id);
        if(buscarAluno.isPresent()){
            var alunoDeletado = buscarAluno.get();
            repository.delete(alunoDeletado);
            return alunoDeletado;
        }
        return null;
    }
}
