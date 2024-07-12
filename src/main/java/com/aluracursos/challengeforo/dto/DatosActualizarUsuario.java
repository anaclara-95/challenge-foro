package com.aluracursos.challengeforo.dto;

import com.aluracursos.challengeforo.models.Tipo;

public record DatosActualizarUsuario(Long id, String nombre, String email, String contrasena, Tipo tipo) {
}
