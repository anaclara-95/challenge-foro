package com.aluracursos.challengeforo.repository;

import com.aluracursos.challengeforo.models.Respuesta;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface RespuestaRepository extends JpaRepository<Respuesta, Long> {
    Page<Respuesta> findAll(Pageable paginacion);
}
