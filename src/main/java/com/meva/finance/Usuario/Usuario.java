package com.meva.finance.Usuario;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;


import java.time.LocalDate;


@Entity(name = "Usuario")
@Table(name = "user_meva")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")

public class Usuario{

    @Id
    //colocar o total de numeros e minimo
    private String cpf;

    private String nome;

    private String genero;

    private LocalDate nascimento;

    private String estado;

    private String cidade;


}


