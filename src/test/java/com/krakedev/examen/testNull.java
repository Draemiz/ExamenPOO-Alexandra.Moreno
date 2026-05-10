package com.krakedev.examen;

import com.krakedev.examen.servicios.AdminVentas;

public class testNull {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//AdminVentas admin = null;
        //admin.calcularSueldo("222222222");
		
		AdminVentas admin = new AdminVentas();
		admin.calcularSueldo("222222222");
		
		System.out.println("Programa correcto");
		

	}

}
