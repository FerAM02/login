package com.entrelineas.login.servicio;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.entrelineas.login.dto.UsuarioRegistroDTO;
import com.entrelineas.login.modelo.Usuario;


public interface UsuarioServicio extends UserDetailsService{

    public Usuario guardar(UsuarioRegistroDTO registroDTO);

    public List<Usuario> listarUsuarios();

}