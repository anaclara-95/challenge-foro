package com.aluracursos.challengeforo.repository;

import com.aluracursos.challengeforo.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository  extends JpaRepository<Usuario, Long> {
}
