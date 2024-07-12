package com.aluracursos.challengeforo.dto;

import com.aluracursos.challengeforo.models.Usuario;

public record DatosRespuestaUsuario(String nombre, String email, String tipo) {
    public DatosRespuestaUsuario(Usuario usuario) {
        this(usuario.getNombre(), usuario.getEmail(), usuario.getTipo().toString());
    }
}
