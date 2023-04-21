package com.biblioteca.pruebas.dao;


import com.biblioteca.pruebas.Models.Localizacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DaoLocalizacion extends JpaRepository<Localizacion, Long> {
}
