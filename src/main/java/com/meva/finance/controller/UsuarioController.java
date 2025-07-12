package com.meva.finance.controller;

import com.meva.finance.Usuario.Usuario;
import com.meva.finance.Usuario.UsuarioDto;
import com.meva.finance.service.UsuariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/users")
public class UsuarioController {

    @Autowired
    UsuariosService usuariosService;


    @PostMapping ("/register")
    public void register(@RequestBody Usuario usuario) {
        usuariosService.register(usuario);
    }

  /*  @PutMapping ("/search")
    public void search(@RequestBody UsuarioDto userDto) {
        .save(new User)

    }*/
}
