package com.krakedev.examen.servicios;

import java.util.ArrayList;

import com.krakedev.examen.dto.Vendedor;

public class AdminVentas {
	
	private ArrayList<Vendedor> vendedores;
	
	public AdminVentas() {
        vendedores = new ArrayList<Vendedor>();
    }
	
	
	//meetodo agregar vendedor
	public void agregar(Vendedor vendedor) {
        vendedores.add(vendedor);
    }
	
	//método calcularSueldo
    public Double calcularSueldo(String cedula) {

        for (Vendedor vendedor : vendedores) {
            if (vendedor.getCedula().equals(cedula)) {
                return vendedor.calcularSueldo();
            }
        }
        return null;
    }
    
}

