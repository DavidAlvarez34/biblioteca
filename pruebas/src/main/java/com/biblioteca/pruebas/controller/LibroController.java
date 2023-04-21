package com.biblioteca.pruebas.controller;

import com.biblioteca.pruebas.Models.Libro;
import com.biblioteca.pruebas.dao.DaoLibro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestControllerAdvice
@RequestMapping("/api/libro")
public class LibroController {
    @Autowired
    private DaoLibro daoLibro;

    @GetMapping
    public List<Libro> listarProductos() {
        return daoLibro.findAll();
    }

    @PostMapping
    public Libro crearProducto(@RequestBody Libro producto) {
        return daoLibro.save(producto);
    }
}
