package com.aluracursos.challengeforo.repository;

import com.aluracursos.challengeforo.models.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Long> {
}
