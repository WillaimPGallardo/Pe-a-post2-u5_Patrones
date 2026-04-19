package com.universidad.patrones.dto;

import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class LibroRequestDTO {

    @NotBlank
    private String titulo;

    @NotBlank
    private String autor;

    @NotBlank
    private String isbn;

    private Integer anioPublicacion;
    private String categoria;
}