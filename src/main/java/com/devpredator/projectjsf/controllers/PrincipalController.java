package com.devpredator.projectjsf.controllers;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.devpredator.projectjsf.entity.Empleado;
import com.devpredator.projectjsf.services.EmpleadoService;

@ManagedBean
@ViewScoped //mantiene informacion en page
public class PrincipalController {
	private List<Empleado> empleados;
	private EmpleadoService empleadoService = new EmpleadoService();
	private String var1;
	
	@PostConstruct
	public void init() {
		
		var1="test1";
		
		consultarEmpleados();
		
		System.out.println(empleados);
	}
	
	
	public void consultarEmpleados() {
		
		this.empleados = empleadoService.consultarEmpleados();
		
		
	}

	public List<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}


	public String getVar1() {
		return var1;
	}


	public void setVar1(String var1) {
		this.var1 = var1;
	}
}
