package br.univille.microservdoutorado.gestaocursos.entity;

import org.springframework.data.annotation.Id;
import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.GeneratedValue;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;

@Container(containerName = "cursos", autoCreateContainer = true)
public class Curso {
    @Id
    @PartitionKey
    @GeneratedValue

    private String idCurso; 
    private String nomeCurso;
    private Double custoCurso;
    private Integer duracao;
    private String materia;

    public String getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(String idCurso) {
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

    public Integer getDuracao() {
        return duracao;
    }

    public void setDuracao(Integer duracao) {
        this.duracao = duracao;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

}
