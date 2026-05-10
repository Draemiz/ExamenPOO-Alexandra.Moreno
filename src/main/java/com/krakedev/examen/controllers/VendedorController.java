package com.krakedev.examen.controllers;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.krakedev.examen.dto.Vendedor;
import com.krakedev.examen.dto.VendedorComision;
import com.krakedev.examen.dto.VendedorMixto;
import com.krakedev.examen.servicios.AdminVentas;

@RestController
public class VendedorController {

    private AdminVentas admin;

    public VendedorController() {

        admin = new AdminVentas();
    }

    @PostMapping("/vendedores")
    public String agregarVendedor(@RequestBody Vendedor vendedor) {

        if (vendedor.getTipo().equals("V")) {

        	Vendedor v = new Vendedor(
        	        vendedor.getCedula(),
        	        vendedor.getTipo());

        	v.setTipo("V");
        	v.setSueldoFijo(vendedor.getSueldoFijo());

        	admin.agregar(v);

        } else if (vendedor.getTipo().equals("C")) {

            VendedorComision vc =
                    new VendedorComision(vendedor.getCedula());

            vc.setTipo("C");

            vc.setComisionPorVenta(
                    vendedor.getComisionPorVenta());

            vc.setNumeroVentas(
                    vendedor.getNumeroVentas());

            admin.agregar(vc);

        } else if (vendedor.getTipo().equals("M")) {

            VendedorMixto vm =
                    new VendedorMixto(vendedor.getCedula());

            vm.setTipo("M");

            vm.setSueldoFijo(
                    vendedor.getSueldoFijo());

            vm.setNumeroVentas(
                    vendedor.getNumeroVentas());

            admin.agregar(vm);
        }

        return "Vendedor agregado correctamente";
    }

    @GetMapping("/vendedores/{cedula}")
    public Double calcularSueldoVendedor(
            @PathVariable String cedula) {

        return admin.calcularSueldo(cedula);
    }

    @GetMapping("/vendedores")
    public ArrayList<Vendedor> obtenerVendedores() {

        return admin.obtenerTodos();
    }
}