package br.univille.microservdoutorado.gestaocursos.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import br.univille.microservdoutorado.gestaocursos.entity.Curso;
import br.univille.microservdoutorado.gestaocursos.repository.CursoRepository;
import br.univille.microservdoutorado.gestaocursos.service.CursoService;

public class CursoServiceImpl implements CursoService {

    @Autowired
    private CursoRepository repository;
    
    @Override
    public List<Curso> getAll() {
        var retornoIterador = repository.findAll();
        var listaCursos = new ArrayList<Curso>();
        retornoIterador.forEach(listaCursos::add);
        return listaCursos;
    }
    
    @Override
    public Curso save(Curso curso) {
        return repository.save(curso);
    }
    
    @Override
    public Curso update(String id, Curso curso) {
        var buscarCurso = repository.findById(id);
        if(buscarCurso.isPresent()){
            var cursoAntigo = buscarCurso.get();
            cursoAntigo.setNomeCurso(curso.getNomeCurso());
            repository.save(cursoAntigo);
            return cursoAntigo;
        }
        return null;
    }

    @Override
    public Curso delete(String id){
        var buscarCurso = repository.findById(id);
        if(buscarCurso.isPresent()){
            var cursoDeletado = buscarCurso.get();
            repository.delete(cursoDeletado);
            return cursoDeletado;
        }
        return null;
    }  
}
