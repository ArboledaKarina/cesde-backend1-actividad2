package com.example;

public class CuentaBancaria {

    // Atributos privados
    private String titular;
    private double saldo;

    // 1️⃣ Constructor
    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;

        if (saldoInicial < 0) {
            this.saldo = 0;
        } else {
            this.saldo = saldoInicial;
        }
    }

    // 2️⃣ Getters y Setters

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    // SOLO getter para saldo
    public double getSaldo() {
        return saldo;
    }

    // 3️⃣ Método depositar
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
        } else {
            System.out.println("Error: La cantidad debe ser mayor que 0.");
        }
    }

    // 4️⃣ Método retirar
    public void retirar(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("Error: La cantidad debe ser mayor que 0.");
        } else if (cantidad > saldo) {
            System.out.println("Error: Fondos insuficientes.");
        } else {
            saldo -= cantidad;
        }
    }
}