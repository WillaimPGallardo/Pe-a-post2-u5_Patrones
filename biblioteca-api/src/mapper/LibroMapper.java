package com.universidad.patrones.mapper;

import com.universidad.patrones.dto.*;
import com.universidad.patrones.model.Libro;

public class LibroMapper {

    public static Libro toEntity(LibroRequestDTO dto) {
        return new Libro(null, dto.getTitulo(), dto.getAutor(),
                dto.getIsbn(), dto.getAnioPublicacion(), dto.getCategoria());
    }

    public static LibroResponseDTO toDTO(Libro libro) {
        return new LibroResponseDTO(
                libro.getId(),
                libro.getTitulo(),
                libro.getAutor(),
                libro.getIsbn(),
                libro.getAnioPublicacion(),
                libro.getCategoria()
        );
    }
}