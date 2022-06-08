/**
 * 
 */
package com.devpredator.projectjsf.entity;

/**
 * @author julio
 * clase entidades de empleados
 */
public class Empleado {
	private String Nombre;
	private String primerApellido;
	private String segundoApelllido;
	private String puesto;
	private boolean status;
	
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getPrimerApellido() {
		return primerApellido;
	}
	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}
	public String getSegundoApelllido() {
		return segundoApelllido;
	}
	public void setSegundoApelllido(String segundoApelllido) {
		this.segundoApelllido = segundoApelllido;
	}
	public String getPuesto() {
		return puesto;
	}
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
}
