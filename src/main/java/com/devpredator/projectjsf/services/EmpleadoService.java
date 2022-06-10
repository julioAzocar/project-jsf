package com.devpredator.projectjsf.services;

import java.util.ArrayList;
import java.util.List;

import com.devpredator.projectjsf.entity.Empleado;

public class EmpleadoService {

	public List<Empleado> consultarEmpleados(){
		
		
		List<Empleado> empleados = new ArrayList<Empleado>();
		//test
		
		for (int i = 0; i < 10; i++) {
			Empleado E1 = new Empleado();

			E1.setNombre("diego-" + i);
			E1.setPrimerApellido("aros " + i);
			E1.setSegundoApelllido("mansilla " + i);
			E1.setPuesto("chofer " + i);
			E1.setStatus(true);
			
			empleados.add(E1);
		}
		
		for (int i = 0; i < 10; i++) {
			Empleado E1 = new Empleado();

			E1.setNombre("ana-" + i);
			E1.setPrimerApellido("azocar " + i);
			E1.setSegundoApelllido("gutierres " + i);
			E1.setPuesto("yunior " + i);
			E1.setStatus(true);
			
			empleados.add(E1);
		}
		
		for (int i = 0; i < 10; i++) {
			Empleado E1 = new Empleado();

			E1.setNombre("lisa-" + i);
			E1.setPrimerApellido("soto " + i);
			E1.setSegundoApelllido("peres " + i);
			E1.setPuesto("madico " + i);
			E1.setStatus(true);
			
			empleados.add(E1);
		}

		
		return empleados;
	}
	
}
