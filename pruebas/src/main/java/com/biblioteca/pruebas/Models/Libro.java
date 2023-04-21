package com.biblioteca.pruebas.Models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "libro")
public class Libro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_libro")
    private Long idLibro;

    @Column(name = "numero_volumen")
    private Long numeroVolumen;
    @Column(name = "titulo_libro")
    private String tituloLibro;

    public Long getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(Long idLibro) {
        this.idLibro = idLibro;
    }

    public Long getNumeroVolumen() {
        return numeroVolumen;
    }

    public void setNumeroVolumen(Long numeroVolumen) {
        this.numeroVolumen = numeroVolumen;
    }

    public String getTituloLibro() {
        return tituloLibro;
    }

    public void setTituloLibro(String tituloLibro) {
        this.tituloLibro = tituloLibro;
    }


}
