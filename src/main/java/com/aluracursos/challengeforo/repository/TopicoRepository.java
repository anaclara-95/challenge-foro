package com.aluracursos.challengeforo.repository;

import com.aluracursos.challengeforo.models.Topico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicoRepository extends JpaRepository<Topico, Long> {
}