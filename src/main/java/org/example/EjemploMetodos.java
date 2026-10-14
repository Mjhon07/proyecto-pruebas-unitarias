package org.example;

public final class EjemploMetodos {

    private EjemploMetodos() {
    }

    public static boolean esMayorDeEdad(int edad) {
        return edad >= 18;
    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        if (numero == 2) {
            return true;
        }
        if (numero % 2 == 0) {
            return false;
        }

        for (int divisor = 3; divisor <= Math.sqrt(numero); divisor += 2) {
            if (numero % divisor == 0) {
                return false;
            }
        }

        return true;
    }
}
