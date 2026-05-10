package com.krakedev.examen.TestJUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.krakedev.examen.dto.VendedorMixto;

public class VendedorMixtoTestJUnit {
	
	@Test
    public void testCalcularSueldo() {

        VendedorMixto vendedor = new VendedorMixto("789");

        vendedor.setSueldoFijo(1000);
        vendedor.setNumeroVentas(10);

        double esperado = 1100;
        double actual = vendedor.calcularSueldo();

        assertEquals(esperado, actual);
    }

}
