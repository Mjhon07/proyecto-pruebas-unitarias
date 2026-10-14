package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class UtilidadesTest {

    @Test
    void esMayorDeEdad_devuelveTrue_siLaEdadEsMayorOIgualA18() {
        // Arrange
        int edad = 18;

        // Act
        boolean resultado = EjemploMetodos.esMayorDeEdad(edad);

        // Assert
        assertTrue(resultado);
    }

    @Test
    void esMayorDeEdad_devuelveFalse_siLaEdadEsMenorQue18() {
        // Arrange
        int edad = 17;

        // Act
        boolean resultado = EjemploMetodos.esMayorDeEdad(edad);

        // Assert
        assertFalse(resultado);
    }

    @Test
    void esPrimo_devuelveTrue_siElNumeroEsPrimo() {
        // Arrange
        int numero = 7;

        // Act
        boolean resultado = EjemploMetodos.esPrimo(numero);

        // Assert
        assertTrue(resultado);
    }

    @Test
    void esPrimo_devuelveFalse_siElNumeroNoEsPrimo() {
        // Arrange
        int numero = 12;

        // Act
        boolean resultado = EjemploMetodos.esPrimo(numero);

        // Assert
        assertFalse(resultado);
    }
}
