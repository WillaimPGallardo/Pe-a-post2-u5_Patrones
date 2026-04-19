package com.universidad.patrones.repository;

import com.universidad.patrones.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibroRepository extends JpaRepository<Libro, Long> {
}