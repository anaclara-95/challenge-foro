package com.aluracursos.challengeforo.dto;

import com.aluracursos.challengeforo.models.Curso;

public record DatosRespuestaCurso(String nombre, String categoria) {
    public DatosRespuestaCurso(Curso curso) {
        this(curso.getNombre(), curso.getCategoria());
    }
}
