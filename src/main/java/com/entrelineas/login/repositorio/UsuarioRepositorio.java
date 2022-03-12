package com.entrelineas.login.repositorio;

import com.entrelineas.login.modelo.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Long> {

}
