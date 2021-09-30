package com.minha.escola.controller;


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

import com.minha.escola.model.Aluno;
import com.minha.escola.repository.AlunoRepository;

@RestController
@RequestMapping("/aluno")
@CrossOrigin("*")

public class AlunoController {
	
	@Autowired
	private AlunoRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Aluno>> findAllAluno (){
		return ResponseEntity.ok(repository.findAll());
	}
	
	 @GetMapping("/{id}")
	    public ResponseEntity<Aluno> GetById(@PathVariable long id) { //FindByID
	        Aluno response = repository.findById(id).orElseThrow(RuntimeException::new);
	        return ResponseEntity.ok(response);
	}
	 
	@PostMapping
	public ResponseEntity<Aluno> PostAluno (@RequestBody Aluno aluno){
		
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(aluno));
	}
	
	@PutMapping
	public ResponseEntity<Aluno> PutAluno (@RequestBody Aluno aluno){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(aluno));
	}
	
	@DeleteMapping("/{id}")
	public void DeleteAluno (@PathVariable long id) {
		repository.deleteById(id);
		
	}
}