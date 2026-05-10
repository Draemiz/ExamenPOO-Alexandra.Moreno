package com.krakedev.examen.dto;

public class Vendedor {

	private String cedula;
	private int numeroVentas;
	private double sueldoFijo;
	private double comisionPorVenta;

	public Vendedor(String cedula) {
		this.cedula = cedula;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public int getNumeroVentas() {
		return numeroVentas;
	}

	public void setNumeroVentas(int numeroVentas) {
		this.numeroVentas = numeroVentas;
	}

	public double getSueldoFijo() {
		return sueldoFijo;
	}

	public void setSueldoFijo(double sueldoFijo) {
		this.sueldoFijo = sueldoFijo;
	}

	public double getComisionPorVenta() {
		return comisionPorVenta;
	}

	public void setComisionPorVenta(double comisionPorVenta) {
		this.comisionPorVenta = comisionPorVenta;
	}
	
	public double calcularSueldo() {
        return sueldoFijo;
    }

	@Override
	public String toString() {
		return "Vendedor: cedula: " + cedula + ", numero de ventas: " + numeroVentas + ", sueldo Fijo: " + sueldoFijo
				+ ", comision por venta: " + comisionPorVenta + ".";
	}

}
