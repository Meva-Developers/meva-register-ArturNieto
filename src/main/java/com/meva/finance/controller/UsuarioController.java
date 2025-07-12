package com.meva.finance.controller;

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
    public void register(@RequestBody UsuarioDto userDto) {
        usuariosService.register(userDto);
    }

  /*  @PutMapping ("/search")
    public void search(@RequestBody UsuarioDto userDto) {
        .save(new User)

    }*/
    //tabelas, dto users, repository sp/data
}
