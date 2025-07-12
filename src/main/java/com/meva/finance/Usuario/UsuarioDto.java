package com.meva.finance.Usuario;



import java.time.LocalDate;


public record UsuarioDto(String cpf,String nome,String genero,LocalDate nascimento,String estado,String cidade) {



}
