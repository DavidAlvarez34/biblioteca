package com.biblioteca.pruebas.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;


@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
@Table(name = "localizacion")
public class Localizacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idLocalizacion;

    @Column(name = "posicion")
    private String posicion;

    @Column(name = "librero")
    private String librero;

    @Column(name = "sala")
    private String sala;

    @Column(name = "estante")
    private String estante;
    @Column(name = "libro_id")
    private Long idlibro;
    public Long getLibroId() {
        return idlibro;
    }

    public void setLibroId(Long libroId) {
        this.idlibro = libroId;
    }

    public Long getIdLocalizacion() {
        return idLocalizacion;
    }

    public void setIdLocalizacion(Long idLocalizacion) {
        this.idLocalizacion = idLocalizacion;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getLibrero() {
        return librero;
    }

    public void setLibrero(String librero) {
        this.librero = librero;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getEstante() {
        return estante;
    }

    public void setEstante(String estante) {
        this.estante = estante;
    }




}
