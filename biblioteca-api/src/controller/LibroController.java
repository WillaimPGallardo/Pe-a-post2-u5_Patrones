package com.universidad.patrones.controller;

import com.universidad.patrones.dto.*;
import com.universidad.patrones.mapper.LibroMapper;
import com.universidad.patrones.service.LibroService;
import jakarta.validation.Valid;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/libros")
public class LibroController {

    private final LibroService service;

    public LibroController(LibroService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<LibroResponseDTO>> listar() {
        List<LibroResponseDTO> lista = service.listar()
                .stream()
                .map(LibroMapper::toDTO)
                .collect(Collectors.toList());

        return ResponseEntity.ok(lista);
    }

    @PostMapping
    public ResponseEntity<LibroResponseDTO> crear(@RequestBody @Valid LibroRequestDTO dto) {
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(LibroMapper.toDTO(service.guardar(LibroMapper.toEntity(dto))));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Long id) {
        service.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}