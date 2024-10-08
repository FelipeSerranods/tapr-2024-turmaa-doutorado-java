package br.univille.microservdoutorado.gestaocursos.entity;

import java.util.UUID;

public class Aluno {

    private UUID idMatricula;
    private UUID idCurso;
    private UUID idMateria;
    private String nomeAluno;
    private String statusMatricula;

    public UUID getIdMatricula() {
        return idMatricula;
    }

    public void setIdMatricula(UUID idMatricula) {
        this.idMatricula = idMatricula;
    }

    public UUID getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(UUID idCurso) {
        this.idCurso = idCurso;
    }

    public UUID getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(UUID idMateria) {
        this.idMateria = idMateria;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNome(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getStatusMatricula() {
        return statusMatricula;
    }

    public void setStatusMatricula(String statusMatricula) {
        this.statusMatricula = statusMatricula;
    }

}
