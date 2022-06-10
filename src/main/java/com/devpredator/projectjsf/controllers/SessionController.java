package com.devpredator.projectjsf.controllers;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.devpredator.projectjsf.dto.UsuarioDTO;

/*
 * 
 *Mantiene informacion de usuario por sesion 
*/

@ManagedBean //javax.faces.bean.ManagedBean;
@SessionScoped //javax.faces.bean.SessionScoped;, permite que esta clase se genere una vez por sesion 
public class SessionController {
	private UsuarioDTO usuarioDTO;//usuario en sesion

	@PostConstruct //javax.annotation.PostConstruct;
	public void init() {
		System.out.println("Cargando datos de sesion de usuario");
	}
	
	public UsuarioDTO getUsuarioDTO() {
		return usuarioDTO;
	}

	public void setUsuarioDTO(UsuarioDTO usuarioDTO) {
		this.usuarioDTO = usuarioDTO;
	}
	
}
