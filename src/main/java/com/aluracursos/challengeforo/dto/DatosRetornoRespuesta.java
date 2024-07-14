package com.aluracursos.challengeforo.dto;

import com.aluracursos.challengeforo.models.Respuesta;

public record DatosRetornoRespuesta(String mensaje, String topico, String autor) {
    public DatosRetornoRespuesta(Respuesta respuesta) {
        this(respuesta.getMensaje(), respuesta.getTopico().getTitulo(), respuesta.getAutor().getNombre());
    }
}
