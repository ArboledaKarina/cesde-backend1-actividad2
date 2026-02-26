package com.example;

public class Estudiante {

    // Atributos privados
    private String nombre;
    private int edad;
    private double promedio;

    // 1️⃣ Constructor vacío
    public Estudiante() {
        this.nombre = "Sin nombre";
        this.edad = 0;
        this.promedio = 0.0;
    }

    // 2️⃣ Constructor completo
    public Estudiante(String nombre, int edad, double promedio) {
        this.nombre = nombre;
        setEdad(edad); // usamos setter para validar
        this.promedio = promedio;
    }

    // 3️⃣ Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    // Validación: edad > 0
    public void setEdad(int edad) {
        if (edad > 0) {
            this.edad = edad;
        } else {
            System.out.println("Error: La edad debe ser mayor que 0.");
        }
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    // 4️⃣ Método haAprobado()
    public boolean haAprobado() {
        return promedio >= 3.0;
    }

    // 5️⃣ Método mostrarInfo()
    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre +
                           " | Edad: " + edad +
                           " | Promedio: " + promedio +
                           " | Estado: " + (haAprobado() ? "APROBADO" : "REPROBADO"));
    }
}