package br.univille.microservdoutorado.gestaocursos.entity;

import java.util.UUID;
import java.util.Date;

public class Curso {
    private UUID idCurso;
    private String nomeCurso;
    private Double custoCurso;
    private Date duracao;
    private String materia;

    public UUID getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(UUID idCurso) {
        this.idCurso = idCurso;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public Double getCustoCurso() {
        return custoCurso;
    }

    public void setCustoCurso(Double custoCurso) {
        this.custoCurso = custoCurso;
    }

    public Date getDuracao() {
        return duracao;
    }

    public void setDuracao(Date duracao) {
        this.duracao = duracao;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

}
