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

import br.univille.microservdoutorado.gestaocursos.entity.Aluno;
import br.univille.microservdoutorado.gestaocursos.service.AlunoService;

@RestController
@RequestMapping("/api/v1/alunos")
public class AlunoAPIController {

    @Autowired
    private AlunoService service;

    // Buscar todos os alunos
    @GetMapping
    public ResponseEntity<List<Aluno>> get() {
        var listaAlunos = service.getAll();
        return new ResponseEntity<>(listaAlunos, HttpStatus.OK);
    }

    // Inserir um aluno
    @PostMapping
    public ResponseEntity<Aluno> post(@RequestBody Aluno aluno) {
        if (aluno == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        var alunoSalvo = service.save(aluno);
        return new ResponseEntity<>(alunoSalvo, HttpStatus.CREATED); // Retornar CREATED
    }

    // Atualizar um aluno
    @PutMapping("/{id}")
    public ResponseEntity<Aluno> put(@PathVariable("id") String id, @RequestBody Aluno aluno) {
        if (aluno == null || id == "" || id == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        aluno = service.update(id, aluno);
        if (aluno == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(aluno, HttpStatus.OK);
    }

    // Deletar um aluno
    @DeleteMapping("/{id}")
    public ResponseEntity<Aluno> delete(@PathVariable("id") String id) {
        if (id == "" || id == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        var aluno = service.delete(id);
        if (aluno == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(aluno, HttpStatus.OK);
    }
}
