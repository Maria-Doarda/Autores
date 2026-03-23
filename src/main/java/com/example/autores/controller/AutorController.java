package com.example.autores.controller;

import com.example.autores.models.AutorModel;
import com.example.autores.services.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/autores")
public class AutorController {

    @Autowired
    private AutorService autorService;

    @GetMapping
    public ResponseEntity<List<AutorModel>> findAll(){
        List<AutorModel> request = autorService.findAll();
        return ResponseEntity.ok().body(request);
    }

    @PostMapping
    public ResponseEntity<AutorModel> criarAutor(@RequestBody AutorModel autorModel){
        AutorModel request = autorService.criarAutor(autorModel);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{id}").buildAndExpand(autorModel).toUri();
        return ResponseEntity.created(uri).body(request);
    }

    @GetMapping("/{id}")
    public Optional<AutorModel> buscarId(@PathVariable Long id){
        return autorService.buscarId(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        autorService.deletar(id);
    }





}
