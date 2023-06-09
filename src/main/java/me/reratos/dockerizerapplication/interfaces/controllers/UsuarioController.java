package me.reratos.dockerizerapplication.interfaces.controllers;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import me.reratos.dockerizerapplication.domain.entities.Usuario;
import me.reratos.dockerizerapplication.domain.service.UsuarioService;
import me.reratos.dockerizerapplication.interfaces.dtos.UsuarioDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/usuarios")
public class UsuarioController {

    private final UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity<Object> criar(@RequestBody UsuarioDTO usuarioDto) {
        log.info("Criando usuario");
        var user = usuarioService.criarUsuario(Usuario.builder()
                        .nome(usuarioDto.getNome())
                        .sexo(usuarioDto.getSexo())
                        .dataNascimento(LocalDate.parse(usuarioDto.getDataNascimento()))
                .build());
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(user);
    }

    @GetMapping
    public ResponseEntity<Object> listar() {
        log.info("Listando usuarios");
        var users = usuarioService.listarUsuarios();
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(users);
    }

    @GetMapping("/{id_usuario}")
    public ResponseEntity<Object> consultar(@PathVariable("id_usuario") String idUsuario) {
        log.info("Consultando usuario");
        var user = usuarioService.consultarUsuario(idUsuario);
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(user);
    }

}
