package com.coffeemv.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coffeemv.apirest.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

	
	Usuario findById(long id);
}
