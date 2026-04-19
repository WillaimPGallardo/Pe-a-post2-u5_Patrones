package com.universidad.patrones.service;

import com.universidad.patrones.model.Libro;
import com.universidad.patrones.repository.LibroRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroService {

    private final LibroRepository repo;

    public LibroService(LibroRepository repo) {
        this.repo = repo;
    }

    public List<Libro> listar() {
        return repo.findAll();
    }

    public Libro guardar(Libro libro) {
        return repo.save(libro);
    }

    public void eliminar(Long id) {
        repo.deleteById(id);
    }
}