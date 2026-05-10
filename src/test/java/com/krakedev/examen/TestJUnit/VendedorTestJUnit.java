package com.krakedev.examen.TestJUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.krakedev.examen.dto.Vendedor;

public class VendedorTestJUnit {
	
	@Test
    public void testCalcularSueldo() {

        Vendedor vendedor = new Vendedor("111111111","V");

        vendedor.setSueldoFijo(500);

        double esperado = 500;
        double actual = vendedor.calcularSueldo();

        assertEquals(esperado, actual);
    }

}
