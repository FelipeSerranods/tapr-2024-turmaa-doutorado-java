package br.univille.microservdoutorado.gestaocursos.entity;

import java.util.List;

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
    private int duracao;
    private List<String> materias;

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

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public List<String> getMaterias() {
        return materias; 
    }

    public void setMaterias(List<String> materias) {
        this.materias = materias;
    }

}
