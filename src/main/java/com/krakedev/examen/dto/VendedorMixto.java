package com.krakedev.examen.dto;

public class VendedorMixto extends Vendedor{
	
	public VendedorMixto(String cedula) {
        super(cedula, "M");
    }
	
	@Override
    public double calcularSueldo() {
        double adicional = getSueldoFijo() * 0.01 * getNumeroVentas();
        return getSueldoFijo() + adicional;
    }

}
