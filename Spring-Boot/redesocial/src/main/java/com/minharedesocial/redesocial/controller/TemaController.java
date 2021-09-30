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

import com.minharedesocial.redesocial.model.Tema;
import com.minharedesocial.redesocial.repository.TemaRepository;

@RestController
@RequestMapping("/tema")
@CrossOrigin("*")

public class TemaController {

	@Autowired
	private TemaRepository repository;
		
	@GetMapping
	public ResponseEntity <List<Tema>> findAll () { 
		return ResponseEntity.ok(repository.findAll());
		}
		
	@GetMapping("/{id}")
	public ResponseEntity <Tema> getByIdTema (@PathVariable long id) { 
		 Tema response = repository.findById(id).orElseThrow(RuntimeException::new);
		 return ResponseEntity.ok(response);
		}
		
	@PostMapping
	public ResponseEntity<Tema> postTema (@RequestBody Tema tema) {
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(tema));
		}
		
	@PutMapping
	public ResponseEntity<Tema> putTema (@RequestBody Tema tema) {
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(tema));
		}
		
	@DeleteMapping("/{id}")
	public void deleteTema (long id) {
		repository.deleteById(id);
		}

}
