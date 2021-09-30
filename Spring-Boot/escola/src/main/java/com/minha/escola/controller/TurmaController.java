package com.minha.escola.controller;

import com.minha.escola.model.Turma;
import com.minha.escola.repository.TurmaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/turma")
@CrossOrigin("*")
public class TurmaController {

    @Autowired
    private TurmaRepository repository;

    @GetMapping
    public ResponseEntity<List<Turma>> GetAll() {
        return ResponseEntity.ok(repository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Turma> GetById(@PathVariable long id) { //FindByID
        Turma response = repository.findById(id).orElseThrow(RuntimeException::new);
        return ResponseEntity.ok(response);
    }

    @PostMapping
    public ResponseEntity<Turma> PostTurma(@RequestBody Turma turma){
        return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(turma));
    }
    @PutMapping
    public ResponseEntity<Turma> PutTurma(@RequestBody Turma turma){
        return ResponseEntity.status(HttpStatus.OK)
                .body(repository.save(turma));
    }

    @DeleteMapping("/{id}")
    public void DeleteTurma (@PathVariable long id) {
        repository.deleteById(id);
    }
}

