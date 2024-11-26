package br.univille.microservdoutorado.gestaocursos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.univille.microservdoutorado.gestaocursos.entity.Curso;
import br.univille.microservdoutorado.gestaocursos.service.CursoService;

@RestController
@RequestMapping("/api/v1/cursos")
public class CursoAPIController {
    @Autowired
    private CursoService service;

    @GetMapping
    public ResponseEntity<List<Curso>> get(){
        var listaCursos = service.getAll();
        return new ResponseEntity<List<Curso>>(listaCursos, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Curso> post(@RequestBody Curso curso){
        if(curso == null){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        var cursoSalvo = service.save(curso);
        return new ResponseEntity<Curso>(cursoSalvo, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Curso> put(@PathVariable("id") String id, @RequestBody Curso curso){
        if(curso == null || id == "" || id == null){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        curso = service.update(id, curso);
        if(curso == null){
            return new ResponseEntity<Curso>(curso, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Curso>(curso, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Curso> delete (@PathVariable("id") String id){
        if(id == "" || id == null){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        var curso = service.delete(id);
        if(curso == null){
            return new ResponseEntity<Curso>(curso, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Curso>(curso, HttpStatus.OK);
    }
}
