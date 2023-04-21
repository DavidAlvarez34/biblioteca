package com.biblioteca.pruebas.controller;


import com.biblioteca.pruebas.Models.Libro;
import com.biblioteca.pruebas.Models.Localizacion;
import com.biblioteca.pruebas.dao.DaoLocalizacion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestControllerAdvice
@RequestMapping("/api/localizacion")
public class LocalizacionController {
    @Autowired
    private DaoLocalizacion daoLocalizacion;

    @GetMapping
    public List<Localizacion> listarProductos() {
        return daoLocalizacion.findAll();
    }
    @PostMapping
    public Localizacion crearLocalizacion(@RequestBody Localizacion localizacion) {
        return daoLocalizacion.save(localizacion);
    }
}
