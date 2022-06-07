/**
 * 
 */
package com.devpredator.projectjsf.controllers;

import java.io.IOException;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

/**
 * @author julio
 *
 */
@ManagedBean (name = "loginController")
public class LoginController {
	private String usuario;
	private String password;

	public void ingresar() {
		System.out.println("Usuario : " + usuario);
		
		if (usuario.equals("julio") && password.equals("123")) {
			//FacesContext.getCurrentInstance().addMessage("formLogin:txtUsuario", new FacesMessage(FacesMessage.SEVERITY_INFO, "Usuario Correcto!!!", ""));
			
			try {
				this.redireccionar("principal.xhtml");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				
				FacesContext.getCurrentInstance().addMessage("formLogin:txtUsuario", new FacesMessage(FacesMessage.SEVERITY_FATAL, "Error: La pagina no existe", ""));
				
				e.printStackTrace();
			}
			
		}else {
			FacesContext.getCurrentInstance().addMessage("formLogin:txtUsuario", new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuario Incorrecto", ""));
		}
		
		
	}
	
	public void redireccionar(String pagina) throws IOException {
		ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
		ec.redirect(pagina);
	}
	
	
	/**
	 * @return the usuario
	 */
	public String getUsuario() {
		return usuario;
	}

	/**
	 * @param nombre the usuario to set
	 */
	public void setUsuario(String nombre) {
		this.usuario = nombre;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

}
