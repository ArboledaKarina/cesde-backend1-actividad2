package com.example;

public class Main {
    public static void main(String[] args) {

        Libro l1 = new Libro();
        l1.mostrarDetalles();

        Libro l2 = new Libro("Harry Potter", "J.K. Rowling");
        l2.mostrarDetalles();

        Libro l3 = new Libro("El Señor de los Anillos", "J.R.R. Tolkien", 1200);
        l3.mostrarDetalles();

        CuentaBancaria cuenta = new CuentaBancaria("Maria", 500);

        cuenta.depositar(200);
        System.out.println(cuenta.getSaldo()); // 700

        cuenta.retirar(1000); // Error fondos insuficientes

        cuenta.retirar(300);
        System.out.println(cuenta.getSaldo()); // 400

        Estudiante e = new Estudiante("Pedro", 21, 2.5);
        e.mostrarInfo(); // Debe indicar REPROBADO

        Estudiante e2 = new Estudiante("Laura", 19, 4.2);
        e2.mostrarInfo(); // Debe indicar APROBADO
    }

}
