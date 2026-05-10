package com.krakedev.examen.controllers;

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
    public void agregarVendedor(@RequestBody Vendedor vendedor) {

        if (vendedor.getTipo().equals("V")) {

            Vendedor v = new Vendedor(
                    vendedor.getCedula(),
                    vendedor.getTipo());

            v.setSueldoFijo(vendedor.getSueldoFijo());

            admin.agregar(v);

        } else if (vendedor.getTipo().equals("C")) {

            VendedorComision vc =
                    new VendedorComision(vendedor.getCedula());

            vc.setComisionPorVenta(
                    vendedor.getComisionPorVenta());

            vc.setNumeroVentas(
                    vendedor.getNumeroVentas());

            admin.agregar(vc);

        } else if (vendedor.getTipo().equals("M")) {

            VendedorMixto vm =
                    new VendedorMixto(vendedor.getCedula());

            vm.setSueldoFijo(
                    vendedor.getSueldoFijo());

            vm.setNumeroVentas(
                    vendedor.getNumeroVentas());

            admin.agregar(vm);
        }
    }

    @GetMapping("/vendedores/{cedula}")
    public Double calcularSueldoVendedor(
            @PathVariable String cedula) {

        return admin.calcularSueldo(cedula);
    }
}
    
