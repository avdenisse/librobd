package com.example.librobd.model;

public class Libro {
    private int id;
    private String titulo;
    private String autor;
    private String Categoria;
    private double precio;
    private int stock;

    public Libro() {
    }

    public Libro(int id, String titulo, String autor, String categoria, double precio, int stock) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        Categoria = categoria;
        this.precio = precio;
        this.stock = stock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String categoria) {
        Categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
