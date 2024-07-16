package com.aluracursos.challengeforo.repository;

import com.aluracursos.challengeforo.models.Usuario;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface UsuarioRepository  extends JpaRepository <Usuario, Long> {
    Page<Usuario> findAll(Pageable paginacion);
    UserDetails findByEmail(String username);


}
