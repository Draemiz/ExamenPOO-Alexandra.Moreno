package com.krakedev.examen;

import com.krakedev.examen.dto.Vendedor;
import com.krakedev.examen.dto.VendedorComision;
import com.krakedev.examen.dto.VendedorMixto;
import com.krakedev.examen.servicios.AdminVentas;

public class TestAdmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AdminVentas admin = new AdminVentas();
		
		// Vendedor normal
        Vendedor vendedor = new Vendedor("111111111");
        vendedor.setSueldoFijo(500);

        // Vendedor comision
        VendedorComision vndcom = new VendedorComision("222222222");
        vndcom.setComisionPorVenta(10);
        vndcom.setNumeroVentas(5);

        // Vendedor mixto
        VendedorMixto vndmx = new VendedorMixto("333333333");
        vndmx.setSueldoFijo(1000);
        vndmx.setNumeroVentas(10);

        // Agregar
        admin.agregar(vendedor);
        admin.agregar(vndcom);
        admin.agregar(vndmx);
        
     // Calcular sueldos
        System.out.println("Sueldo vendedor: "
                + admin.calcularSueldo("111111111"));

        System.out.println("Comision de vendedor por ventas realizadas: "
                + admin.calcularSueldo("222222222"));

        System.out.println("Sueldo vendedor más sus ventas: "
                + admin.calcularSueldo("333333333"));
        
     // Probar cedula inexistente
        System.out.println("Cedula inexistente: "
                + admin.calcularSueldo("999999999"));
    }

}
