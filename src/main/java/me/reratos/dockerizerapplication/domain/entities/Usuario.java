package me.reratos.dockerizerapplication.domain.entities;

import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

public class Usuario {

    @Id
    private String id;

    private String nome;
    private String sexo;
    private LocalDateTime dataNascimento;

}
