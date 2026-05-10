package com.krakedev.examen.dto;

public class VendedorComision extends Vendedor {
	
	public VendedorComision() {
	    super();
	}
	
	public VendedorComision(String cedula) {
        super(cedula, "C");
    }
	
	 @Override
	    public double calcularSueldo() {
	        return getComisionPorVenta() * getNumeroVentas();
	    }
}
