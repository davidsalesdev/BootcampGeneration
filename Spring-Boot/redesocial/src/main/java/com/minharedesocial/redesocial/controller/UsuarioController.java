package com.minharedesocial.redesocial.controller;
	
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.minharedesocial.redesocial.model.Usuario;
import com.minharedesocial.redesocial.repository.UsuarioRepository;

@RestController
@RequestMapping("/usuario")
@CrossOrigin("*")

public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;
		
	@GetMapping
	public ResponseEntity <List<Usuario>> findAllUsuario () {
		return ResponseEntity.ok(repository.findAll());
		}
		
	@GetMapping("/{id}")
	public ResponseEntity <Usuario> findByIdUsuario (@PathVariable long id) { 
		Usuario response = repository.findById(id).orElseThrow(RuntimeException::new);
		return ResponseEntity.ok(response);
		}
		
	@PostMapping
	public ResponseEntity<Usuario> postUsuario (@RequestBody Usuario usuario) {
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(usuario));
		}
		
	@PutMapping
	public ResponseEntity<Usuario> putUsuario (@RequestBody Usuario usuario) {
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(usuario));
		}
		
	@DeleteMapping("/{id}")
	public void deleteUsuario (long id) {
		repository.deleteById(id);
		}	

}
