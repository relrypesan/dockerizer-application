package me.reratos.dockerizerapplication.domain.service;

import lombok.RequiredArgsConstructor;
import me.reratos.dockerizerapplication.domain.entities.Usuario;
import me.reratos.dockerizerapplication.domain.exceptions.EntityNotFoundException;
import me.reratos.dockerizerapplication.domain.repositories.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public Usuario criarUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public List<Usuario> listarUsuarios() {
        return usuarioRepository.findAll();
    }

    public Usuario consultarUsuario(String id) {
        return usuarioRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Não foi encontrado este usuario"));
    }

}
