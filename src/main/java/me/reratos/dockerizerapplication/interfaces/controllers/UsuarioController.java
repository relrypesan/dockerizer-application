package me.reratos.dockerizerapplication.interfaces.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@Slf4j
@RestController("/usuarios")
public class UsuarioController {

    @PostMapping
    public ResponseEntity<Object> criar(Map<String, Object> usuarioDto) {
        log.info("Criando usuario");
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping
    public ResponseEntity<Object> listar() {
        log.info("Listando usuarios");
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @GetMapping("/{id_usuario}")
    public ResponseEntity<Object> consultar(@PathVariable("id_usuario") String idUsuario) {
        log.info("Consultando usuario");
        return ResponseEntity.status(HttpStatus.OK).build();
    }

}
