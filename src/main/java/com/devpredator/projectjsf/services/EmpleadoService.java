package com.devpredator.projectjsf.services;

import java.util.ArrayList;
import java.util.List;

import com.devpredator.projectjsf.entity.Empleado;

public class EmpleadoService {

	public List<Empleado> consultarEmpleados(){
		
		
		List<Empleado> empleados = new ArrayList<Empleado>();
		//test
		Empleado E1 = new Empleado();
		Empleado E2 = new Empleado();
		Empleado E3 = new Empleado();
		
		E1.setNombre("diego");
		E1.setPrimerApellido("aros");
		E1.setSegundoApelllido("mansilla");
		E1.setPuesto("chofer");
		E1.setStatus(true);
		
		E2.setNombre("diego2");
		E2.setPrimerApellido("aros2");
		E2.setSegundoApelllido("mansilla2");
		E2.setPuesto("chofer2");
		E2.setStatus(true);
		
		E3.setNombre("diego3");
		E3.setPrimerApellido("aros3");
		E3.setSegundoApelllido("mansilla3");
		E3.setPuesto("chofer3");
		E3.setStatus(false);
		
		
		empleados.add(E1);
		empleados.add(E2);
		empleados.add(E3);
		return empleados;
	}
	
}
