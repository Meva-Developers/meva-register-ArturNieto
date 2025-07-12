package com.meva.finance.service;

import com.meva.finance.Usuario.Usuario;
import com.meva.finance.Usuario.UsuarioDto;
import com.meva.finance.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuariosService {

    @Autowired
    UsuarioRepository usuarioRepository;

    public void register(Usuario usuario) {
        usuarioRepository.save(usuario);

    }
}

