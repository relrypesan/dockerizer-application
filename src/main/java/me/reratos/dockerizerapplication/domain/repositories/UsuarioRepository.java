package me.reratos.dockerizerapplication.domain.repositories;

import me.reratos.dockerizerapplication.domain.entities.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface UsuarioRepository extends MongoRepository<Usuario, String> {
    List<Usuario> findByNome(String nome);
}
