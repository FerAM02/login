package com.entrelineas.login.servicio;

import java.util.Arrays;
import java.util.List;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.entrelineas.login.dto.UsuarioRegistroDTO;
import com.entrelineas.login.modelo.Rol;
import com.entrelineas.login.modelo.Usuario;
import com.entrelineas.login.repositorio.UsuarioRepositorio;

@Service
public class UsuarioServicioImpl implements UsuarioServicio {


    private UsuarioRepositorio usuarioRepositorio;


    public UsuarioServicioImpl(UsuarioRepositorio usuarioRepositorio) {
        super();
        this.usuarioRepositorio = usuarioRepositorio;
    }

    @Override
    public Usuario guardar(UsuarioRegistroDTO registroDTO) {
        Usuario usuario = new Usuario(registroDTO.getUsername(), registroDTO.getEmail(),
                registroDTO.getPassword(), Arrays.asList(new Rol("ROLE_USER")));
        return usuarioRepositorio.save(usuario);
    }

    @Override
    public List<Usuario> listarUsuarios() {
        return null;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }
}