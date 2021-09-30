package com.farmacia.farmacia.controller;

import com.farmacia.farmacia.model.Produto;
import com.farmacia.farmacia.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produto")
@CrossOrigin("*")
public class ProdutoController {


    @Autowired
    private ProdutoRepository repository;


    @GetMapping
    public ResponseEntity<List<Produto>> findAllProduto() {
        return ResponseEntity.ok(repository.findAll());

    }

    @GetMapping("/{id}")
    public ResponseEntity<Produto> getById(@PathVariable long id) {
        Produto response = repository.findById(id).orElseThrow(RuntimeException::new);
        return ResponseEntity.ok(response);
    }

    @PostMapping
    public ResponseEntity<Produto> postProduto(@RequestBody Produto produto) { //Create
        return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(produto));

    }

    @PutMapping
    public ResponseEntity<Produto> putProduto(@RequestBody Produto produto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(produto));
    }

    @DeleteMapping("/{id}")
    public void deleteProduto(long id) {
        repository.deleteById(id);
    }
}

