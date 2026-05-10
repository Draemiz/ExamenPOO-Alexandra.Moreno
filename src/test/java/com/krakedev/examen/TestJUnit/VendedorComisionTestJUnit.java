package com.krakedev.examen.TestJUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.krakedev.examen.dto.VendedorComision;

public class VendedorComisionTestJUnit {
	
	@Test
    public void testCalcularSueldo() {

        VendedorComision vendedor = new VendedorComision("456");

        vendedor.setComisionPorVenta(10);
        vendedor.setNumeroVentas(5);

        double esperado = 50;
        double actual = vendedor.calcularSueldo();

        assertEquals(esperado, actual);
    }

}
