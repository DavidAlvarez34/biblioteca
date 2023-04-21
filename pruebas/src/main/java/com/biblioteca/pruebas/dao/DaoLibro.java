package com.biblioteca.pruebas.dao;

import com.biblioteca.pruebas.Models.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DaoLibro extends JpaRepository<Libro, Long>{

}
