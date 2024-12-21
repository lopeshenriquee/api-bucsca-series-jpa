package br.com.alura.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;

import java.util.OptionalDouble;

public class Serie {
    private String titulo;
    private Integer totalTemporadas;
    private Double avaliacao;
    private Categoria genero;
    private String atores;
    private String poster;
    private String sinopse;

    public Serie (DadosSerie dadosSeries) {
        this.titulo = dadosSeries.titulo();
        this.totalTemporadas = dadosSeries.totalTemporadas();
        this.avaliacao = OptionalDouble.of(Double.valueOf(dadosSeries.avaliacao())).orElse(0);
        this.genero = Categoria.fromString(dadosSeries.genero().split(",")[0].trim());
        this.atores = dadosSeries.atores();
        this.poster = dadosSeries.poster();
        this.sinopse = dadosSeries.sinopse();
    }

}
