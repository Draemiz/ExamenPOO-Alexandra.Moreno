package com.krakedev.examen;

import com.krakedev.examen.dto.Vendedor;

public class TestVendedor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vendedor vendedor = new Vendedor("123456789","V");
		vendedor.setSueldoFijo(500);
		System.out.println(vendedor);
	}

}
