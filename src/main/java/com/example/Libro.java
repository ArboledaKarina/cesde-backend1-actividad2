package com.example;

public class Libro {

    // Atributos privados
    private String titulo;
    private String autor;
    private int paginas;

    // 1️⃣ Constructor vacío
    public Libro() {
        this.titulo = "Desconocido";
        this.autor = "Anónimo";
        this.paginas = 0;
    }

    // 2️⃣ Constructor con título y autor
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = 0;
    }

    // 3️⃣ Constructor completo
    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    // 4️⃣ Método mostrarDetalles()
    public void mostrarDetalles() {
        System.out.println("Libro: " + titulo +
                           " | Autor: " + autor +
                           " | Páginas: " + paginas);
    }
}