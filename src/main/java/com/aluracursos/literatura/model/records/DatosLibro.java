package com.aluracursos.literatura.model.records;


import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.print.attribute.standard.Media;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosLibro(

        @JsonAlias("id") Long libroId,
        @JsonAlias("title") String titulo,
        @JsonAlias("authors")List<Autor> autor,
        @JsonAlias("subjects")List<String> genero,
        @JsonAlias("languages")List<String> idioma,
        @JsonAlias("download_count") Long cantidadDescargas
        ) {
}
