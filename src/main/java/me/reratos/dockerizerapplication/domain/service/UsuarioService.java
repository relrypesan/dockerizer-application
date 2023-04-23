package me.reratos.dockerizerapplication.domain.service;

import lombok.RequiredArgsConstructor;
import me.reratos.dockerizerapplication.domain.entities.Usuario;
import me.reratos.dockerizerapplication.domain.repositories.UsuarioRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public Usuario criarUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

}
