package com.meva.finance.api;

import com.meva.finance.dto.UserDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/users")
public class UserController {

    @PostMapping ("/register")
    public void register(@RequestBody UserDto userDto) {
        System.out.println("Nome do usuário: " + userDto.getNome());
    }

    @PutMapping ("/search")
    public void search(@RequestBody UserDto userDto) {
        System.out.println("Todos usuários cadastrados: " + userDto.getNome());

    }
    //tabelas, dto users, repository sp/data
}
